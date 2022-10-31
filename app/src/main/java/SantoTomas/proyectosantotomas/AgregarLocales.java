package SantoTomas.proyectosantotomas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AgregarLocales extends AppCompatActivity {

    Button btn_addLocales;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_locales);
        btn_addLocales = findViewById(R.id.btn_addLocales);
        btn_addLocales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AgregarLocales.this,CrearLocales.class));
            }
        });
    }
}