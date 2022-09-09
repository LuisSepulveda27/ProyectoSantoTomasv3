package SantoTomas.proyectosantotomas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Siguiente (View view){
        Intent siguiente = new Intent(this, BotonLocales.class);
        startActivity(siguiente);
    }
    public void Siguiente2 (View view) {
        Intent siguiente2 = new Intent(this, BotonUbicacion.class);
        startActivity(siguiente2);
    }
}