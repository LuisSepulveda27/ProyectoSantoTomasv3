package santoTomas.proyectosantotomas;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class GoogleMaps extends AppCompatActivity implements OnMapReadyCallback{
    private GoogleMap mMap;
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.maps);
        mapFragment.getMapAsync(this );
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;
        LatLng chillan = new LatLng(-36.60787975863577, -72.10238905258322);
        mMap.addMarker(new MarkerOptions().position(chillan).title("Chillan"));

        LatLng PizzeriaPiamonte = new LatLng(-36.6012724170505, -72.10568394038705);
        mMap.addMarker(new MarkerOptions().position(PizzeriaPiamonte).title("Pizzeria Piamonte"));

        LatLng PizzasILSabore = new LatLng(-36.60477547973137, -72.10891904827848);
        mMap.addMarker(new MarkerOptions().position(PizzasILSabore).title("Pizzas IL Sabore"));

        LatLng Pizzaregionale = new LatLng(-36.605795397153116, -72.08802200581006);
        mMap.addMarker(new MarkerOptions().position(Pizzaregionale).title("Pizzaregionale"));

        LatLng DonatelloPizzeríaRistorante = new LatLng(-36.60707335241942, -72.09395057720046);
        mMap.addMarker(new MarkerOptions().position(DonatelloPizzeríaRistorante).title("Donatello Pizzería & Ristorante"));

        LatLng PizzaioloBaldini = new LatLng(-36.60465871850123, -72.0919100135219);
        mMap.addMarker(new MarkerOptions().position(PizzaioloBaldini).title("Pizzaiolo Baldini"));

        LatLng WeLovePizza = new LatLng(-36.58862344235343, -72.08555297000323);
        mMap.addMarker(new MarkerOptions().position(WeLovePizza).title("We Love Pizza"));

        LatLng DominoPizza = new LatLng(-36.59929967309197, -72.10171561318978);
        mMap.addMarker(new MarkerOptions().position(DominoPizza).title("Domino's Pizza"));
        float zoomLevel = 16.0f; //This goes up to 21

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(chillan, zoomLevel));
    }
}