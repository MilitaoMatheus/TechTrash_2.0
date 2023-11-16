package com.example.techtrash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class TelaMenu extends AppCompatActivity {
    static String mensagem;

    ImageButton btnOque;
    ImageButton btnCuriosidades;
    ImageButton btnComoImpac;
    ImageButton btnOndeImpac;
    ImageButton btnDescarte;
    ImageButton btnContato;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_menu);

        /*
        Intent nomeUsu = getIntent();
        String msg = nomeUsu.getStringExtra(MainActivity.NOME_USUARIO);
        mensagem = "Seja bem vindo(a), " + msg + "! O que deseja ver??";
        TextView nomeText = (TextView)findViewById(R.id.nomeText);
        nomeText.setText(mensagem);

         */

        btnOque = (ImageButton) findViewById(R.id.imgOquee);
        btnCuriosidades = (ImageButton) findViewById(R.id.imgCuriosidades);
        btnComoImpac = (ImageButton) findViewById(R.id.imgComoImpac);
        btnOndeImpac = (ImageButton) findViewById(R.id.imgOndeImpac);
        btnDescarte = (ImageButton) findViewById(R.id.imgDesc);
        btnContato = (ImageButton) findViewById(R.id.imgContato);
    }

    public void IrOquee(View view){
        Intent intent = new Intent(this, tela_oque.class);
        startActivity(intent);
    }
    public void IrCuriosidades(View view){
        Intent intent = new Intent(this, Tela_OndeImapc.class);
        startActivity(intent);
    }
    public void IrImpactos(View view){
        Intent intent = new Intent(this, ComoImpac.class);
        startActivity(intent);
    }
    public void IrLugarImpacto(View view){
        Intent intent = new Intent(this, DescarteReutilizacao.class);
        startActivity(intent);
    }
    public void IrDescarte(View view) {
        Intent intent = new Intent(this, TelaDeLocalizacao.class);
        startActivity(intent);
    }
    public void IrContato (View view){
        Intent intent = new Intent(this, Curiosidades.class);
        startActivity(intent);
    }
}