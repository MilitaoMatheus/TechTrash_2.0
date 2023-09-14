package com.example.techtrash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class TelaDeLocalizacao extends AppCompatActivity {

    ImageButton btnvoltarloc1;
    Button btnloc1;
    Button btnweb;
    Button btnligar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_de_localizacao);

        btnvoltarloc1 = (ImageButton) findViewById(R.id.btnvoltarloc1);
        btnloc1 = (Button) findViewById(R.id.btnloc1);
        btnweb = (Button) findViewById(R.id.btnweb);
        btnligar = (Button) findViewById(R.id.btnligar);
    }

    public void Pesquisar (View view) {
        Uri uri = Uri.parse("https://www.google.com/maps/place/Centro+de+Descarte+e+Re%C3%BAso+de+Res%C3%ADduos+de+Inform%C3%A1tica+-+CEDIR/@-23.5559876,-46.7285636,15z/data=!4m6!3m5!1s0x94ce563c461c085f:0x3d015c99b2ebd9bc!8m2!3d-23.5559876!4d-46.7285636!16s%2Fg%2F11b7f2k9bh?entry=ttu");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }
    public void EnviarEmail (View view) throws UnsupportedEncodingException {
        String uriText = "mailto:contato@sobreiralixoeletronico.com.br" + "?subject="+ URLEncoder.encode("Lixo Eletrônico", "utf-8")+
                "&body=" + URLEncoder.encode("Gostaria de saber mais sobre", "utf-8");
        Uri uri = Uri.parse(uriText);
        Intent it = new Intent(Intent.ACTION_SENDTO);
        it.setData(uri);
        startActivity(Intent.createChooser(it, "Enviar Email"));
    }
    public void Ligar (View view){
        Uri uri = Uri.parse("tel:(11) 3333-2135");
        Intent it = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(it);
    }
    public void voltar(View view){
        Intent intent = new Intent(this, TelaMenu.class);
        startActivity(intent);
    }
}