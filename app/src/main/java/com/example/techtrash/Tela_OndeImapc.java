package com.example.techtrash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Tela_OndeImapc extends AppCompatActivity {

    ImageButton btnvoltar2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_onde_imapc);

        btnvoltar2 = (ImageButton) findViewById(R.id.btnvoltar2);
    }
    public void voltar1(View view) {
        Intent intent = new Intent(this, TelaMenu.class);
        startActivity(intent);
    }
}