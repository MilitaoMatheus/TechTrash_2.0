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

    ImageButton btnIrDescarte;
    ImageButton btnMandarEmail;
    ImageButton btnFazerLigacao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_de_localizacao);

        btnIrDescarte = (ImageButton) findViewById(R.id.btnIrDescarte);
        btnMandarEmail = (ImageButton) findViewById(R.id.btMandarEmail);
        btnFazerLigacao = (ImageButton) findViewById(R.id.imgFazerLigacao);
    }

    public void Pesquisar (View view) {
        Uri uri = Uri.parse("https://www.google.com/maps/place/R.+do+Triunfo,+203+-+Santa+Ifig%C3%AAnia,+S%C3%A3o+Paulo+-+SP,+01212-010/@-23.5364079,-46.6382472,17z/data=!3m1!4b1!4m6!3m5!1s0x94ce585bbe00c519:0x5121cdd4c82b907a!8m2!3d-23.5364079!4d-46.6382472!16s%2Fg%2F11cs8mdx9d?entry=ttu");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }
    public void EnviarEmail (View view) throws UnsupportedEncodingException {
        String uriText = "mailto:contato@sobreiralixoeletronico.com.br" + "?subject="+ URLEncoder.encode("Lixo " + "Eletrônico", "utf-8")+
                "&body=" + URLEncoder.encode("Gostaria "+ "de " +  "saber " + "mais " + "sobre.", "utf-8");
        Uri uri = Uri.parse(uriText);
        Intent it = new Intent(Intent.ACTION_SENDTO);
        it.setData(uri);
        startActivity(Intent.createChooser(it, "Enviar Email"));
    }
    public void Ligar (View view) {
        Uri uri = Uri.parse("tel:(11) 3333-2135");
        Intent it = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(it);
    }
}