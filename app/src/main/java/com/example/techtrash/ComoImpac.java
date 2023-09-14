package com.example.techtrash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ComoImpac extends AppCompatActivity {

    ImageButton btnvoltarci;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_como_impac);

        btnvoltarci = (ImageButton) findViewById(R.id.btnvoltarci);
    }

    public void voltar (View view) {
        Intent intent = new Intent(this, TelaMenu.class);
        startActivity(intent);
    }
}