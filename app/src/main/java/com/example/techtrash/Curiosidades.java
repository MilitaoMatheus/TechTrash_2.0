package com.example.techtrash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Curiosidades extends AppCompatActivity {

    ImageButton btnvoltarcuriosidade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curiosidades);

        btnvoltarcuriosidade = (ImageButton) findViewById(R.id.btnvoltarcuriosidade);
    }
    public void voltar (View view){
        Intent intent = new Intent(this, TelaMenu.class);
        startActivity(intent);
    }
}