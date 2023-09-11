package com.example.techtrash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public final static String NOME_USUARIO = "com.example.techtrash.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnentrar = (Button) findViewById(R.id.btnentrar);
    }
    public void enviarNome(View view) {
        Intent home = new Intent(this, TelaMenu.class);
        EditText nome = (EditText) findViewById(R.id.txtNomeUsu);
        String msg = nome.getText().toString();
        home.putExtra(NOME_USUARIO, msg);
        startActivity(home);
    }
}