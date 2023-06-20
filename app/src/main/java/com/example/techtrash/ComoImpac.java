package com.example.techtrash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ComoImpac extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_como_impac);
    }

    public void voltar2(View view) {
        Intent intent = new Intent(this, TelaMenu.class);
        startActivity(intent);
    }
}