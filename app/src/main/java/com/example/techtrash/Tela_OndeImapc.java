package com.example.techtrash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Tela_OndeImapc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_onde_imapc);
    }
    public void voltar1(View view) {
        Intent intent = new Intent(this, TelaMenu.class);
        startActivity(intent);
    }
}