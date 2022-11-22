package santoTomas.proyectosantotomas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("El usuario realizo la siguiente accion");

        Button siguiente = (Button) findViewById(R.id.button3);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent siguiente = new Intent(getApplicationContext(), BotonLocales.class);
                startActivity(siguiente);
                myRef.setValue("Ingresaste a los locales");
            }

        });



    }
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("El usuario realizo la siguiente accion");
    public void Siguiente (View view){
        Intent siguiente = new Intent(this, BotonLocales.class);
        startActivity(siguiente);
    }
    public void Siguiente2 (View view) {
        Intent siguiente2 = new Intent(this, GoogleMaps.class);
        startActivity(siguiente2);
        myRef.setValue("Ingresaste a Ubicacion Maps");
    }
    public void Siguiente3 (View view) {
        Intent siguiente3 = new Intent(this, ActLocales.class);
        startActivity(siguiente3);
        myRef.setValue("Ingresaste a Tab ");
    }
    public void Siguiente4 (View view) {
        Intent siguiente4 = new Intent(this, AgregarLocales.class);
        startActivity(siguiente4);
        myRef.setValue("Ingresaste A agregar locales");
    }


}