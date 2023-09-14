package com.example.techtrash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Tela_OndeImapc extends AppCompatActivity {

    ImageButton btnvoltarimpac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_onde_imapc);

        btnvoltarimpac = (ImageButton) findViewById(R.id.btnvoltarimpac);
    }
    public void voltar(View view) {
        Intent intent = new Intent(this, TelaMenu.class);
        startActivity(intent);
    }
}