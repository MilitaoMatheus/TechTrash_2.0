package com.example.techtrash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ComoImpac extends AppCompatActivity {

    ImageButton btnvoltar4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_como_impac);

        btnvoltar4 = (ImageButton) findViewById(R.id.btnvoltar6);
    }

    public void voltar2(View view) {
        Intent intent = new Intent(this, TelaMenu.class);
        startActivity(intent);
    }
}