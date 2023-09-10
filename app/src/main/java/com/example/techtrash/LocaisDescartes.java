package com.example.techtrash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class LocaisDescartes extends AppCompatActivity {

    Button btnLocal1;
    Button btnLocal2;
    Button btnLocal3;
    ImageButton btnvoltar6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locais_descartes);

        btnLocal1 = (Button) findViewById(R.id.btnLocal1);
        btnLocal2 = (Button) findViewById(R.id.btnLocal2);
        btnLocal3 = (Button) findViewById(R.id.btnLocal3);
        btnvoltar6 = (ImageButton) findViewById(R.id.btnvoltar6);
    }
}