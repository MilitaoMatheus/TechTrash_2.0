package com.example.techtrash;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PontoReciclagemActivity extends AppCompatActivity {

    private static final int REQUEST_LOCATION = 1;
    Button btn;
    TextView location;
    LocationManager lm;
    String lat,lon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ponto_reciclagem);

        ActivityCompat.requestPermissions(this, new String[]{
                Manifest.permission.ACCESS_FINE_LOCATION}, REQUEST_LOCATION);

        location = findViewById(R.id.txtLocation);
    }

    public void pegarLocalização(View v){
        lm = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        if(!lm.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
            OnGPS();
        }else{
            getLocation();
            Uri actualLocation = Uri.parse("geo:" + lat + ", " + lon + "?q=Ponto+de+reciclagem+mais+próximo");
            Intent maps = new Intent(Intent.ACTION_VIEW, actualLocation);
            startActivity(maps);
        }
    }

    private void getLocation() {
        if(ActivityCompat.checkSelfPermission(PontoReciclagemActivity.this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(PontoReciclagemActivity.this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, new String[]{
                    Manifest.permission.ACCESS_FINE_LOCATION}, REQUEST_LOCATION);
        }else{
            Location locationGPS = lm.getLastKnownLocation(LocationManager.GPS_PROVIDER);
            Location locationNetwork = lm.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
            Location locationPassive = lm.getLastKnownLocation(LocationManager.PASSIVE_PROVIDER);

            if(locationGPS != null){
                double latitude = locationGPS.getLatitude();
                double longitude = locationGPS.getLongitude();

                lat = String.valueOf(latitude);
                lon = String.valueOf(longitude);

                location.setText("Localização atual:" + "\n" + "Latitude: " + lat + "\n" + "Longitude: " + lon);
            }else if(locationNetwork != null){
                double latitude = locationNetwork.getLatitude();
                double longitude = locationNetwork.getLongitude();

                lat = String.valueOf(latitude);
                lon = String.valueOf(longitude);

                location.setText("Localização atual:" + "\n" + "Latitude: " + lat + "\n" + "Longitude: " + lon);
            }else if(locationPassive != null){
                double latitude = locationPassive.getLatitude();
                double longitude = locationPassive.getLongitude();

                lat = String.valueOf(latitude);
                lon = String.valueOf(longitude);

                location.setText("Localização atual:" + "\n" + "Latitude: " + lat + "\n" + "Longitude: " + lon);
            }else{
                Toast.makeText(this, "Não foi possível pegar a sua localização", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void OnGPS() {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Ative o GPS").setCancelable(false).setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                startActivity(new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS));
            }
        }).setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        final AlertDialog ad = builder.create();
        ad.show();
    }
}