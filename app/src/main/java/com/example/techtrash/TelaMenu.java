package com.example.techtrash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TelaMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_menu);
    }

    public void transicao1(View view){
        Intent intent = new Intent(this, tela_oque.class);
        startActivity(intent);
    }
    public void transicao2(View view){
        Intent intent = new Intent(this, Tela_OndeImapc.class);
        startActivity(intent);
    }
    public void transicao3(View view){
        Intent intent = new Intent(this, ComoImpac.class);
        startActivity(intent);
    }
    public void transicao4(View view){
        Intent intent = new Intent(this, DescarteReutilizacao.class);
        startActivity(intent);
    }
}