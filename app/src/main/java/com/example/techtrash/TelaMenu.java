package com.example.techtrash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TelaMenu extends AppCompatActivity {
    static String mensagem;

    Button btnir1;
    Button btnir2;
    Button btnir3;
    Button btnir5;
    Button btnir4;
    Button btnir6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_menu);

        Intent nomeUsu = getIntent();
        String msg = nomeUsu.getStringExtra(MainActivity.NOME_USUARIO);
        mensagem = "Seja bem vindo, " + msg + "! O que deseja ver??";
        TextView nomeText = (TextView)findViewById(R.id.nomeText);
        nomeText.setText(mensagem);

        btnir1 = (Button) findViewById(R.id.btnir1);
        btnir2 = (Button) findViewById(R.id.btnir2);
        btnir3 = (Button) findViewById(R.id.btnir3);
        btnir4 = (Button) findViewById(R.id.btnir4);
        btnir5 = (Button) findViewById(R.id.btnir5);
        btnir6 = (Button) findViewById(R.id.btnir6);
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
    public void transicao5(View view) {
        Intent intent = new Intent(this, TelaDeLocalizacao.class);
        startActivity(intent);
    }
    public void transicao6 (View view){
        Intent intent = new Intent(this, Curiosidades.class);
        startActivity(intent);
    }
}