package com.example.techtrash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtNomeUsu;
    ImageButton btnentrar;
    public final static String NOME_USUARIO = "com.example.techtrash.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNomeUsu = (EditText) findViewById(R.id.edtNomeUsu);
        btnentrar = (ImageButton) findViewById(R.id.btnEntrar);
    }
    public void enviarNome(View view) {
        if(edtNomeUsu.getText().toString().matches("")){
            Toast.makeText(this, "Por favor, preencha seu nome!", Toast.LENGTH_SHORT).show();
        } else {
            Intent home = new Intent(this, TelaMenu.class);
            EditText nome = (EditText) findViewById(R.id.edtNomeUsu);
            String msg = nome.getText().toString();
            home.putExtra(NOME_USUARIO, msg);
            startActivity(home);
        }
    }
}