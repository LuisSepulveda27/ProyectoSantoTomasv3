package santoTomas.proyectosantotomas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class CrearLocales extends AppCompatActivity {

    Button btnAgregar;
    EditText name,direccion,calidad;
    private  FirebaseFirestore mfirestore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_locales);

        this.setTitle("Agregar Locales");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mfirestore = FirebaseFirestore.getInstance();

        name = findViewById(R.id.name);
        direccion = findViewById(R.id.direccion);
        calidad = findViewById(R.id.calidad);
        btnAgregar = findViewById(R.id.btnAgregar);

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String n = name.getText().toString().trim();
                String d = direccion.getText().toString().trim();
                String c = calidad.getText().toString().trim();
                if (n.isEmpty()&& d.isEmpty()&& c.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Ingresar los datos", Toast.LENGTH_SHORT).show();

                }else{
                postLocales(n,d,c);
                }
            }
        });
    }

    private void postLocales(String n, String d, String c) {
        Map<String,Object> map = new HashMap<>();
        map.put("Nombre",n);
        map.put("Direccion",d);
        map.put("Calidad",c);
        mfirestore.collection("Locales").add(map).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
            @Override
            public void onSuccess(DocumentReference documentReference) {
                Toast.makeText(getApplicationContext(), "Creado Exsitosamente", Toast.LENGTH_SHORT).show();
                finish();
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(getApplicationContext(), "Error al Ingresar los datos", Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return false;
    }
}