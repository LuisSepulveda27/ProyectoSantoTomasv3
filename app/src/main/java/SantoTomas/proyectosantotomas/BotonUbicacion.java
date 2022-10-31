package SantoTomas.proyectosantotomas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BotonUbicacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boton_ubicacion);
    }
    public void Mapa1 (View view) {
        Intent mapa1 = new Intent(this, GoogleMaps.class);
        startActivity(mapa1);
    }
}