package com.example.techtrash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class DescarteReutilizacao extends AppCompatActivity {

    ImageButton btnvoltardr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descarte_reutilizacao);

        btnvoltardr = (ImageButton) findViewById(R.id.btnvoltardr);
    }
    public void voltar(View view) {
        Intent intent = new Intent(this, TelaMenu.class);
        startActivity(intent);
    }
}