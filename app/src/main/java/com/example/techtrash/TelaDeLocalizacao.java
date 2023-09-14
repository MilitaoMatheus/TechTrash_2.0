package com.example.techtrash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class TelaDeLocalizacao extends AppCompatActivity {

    ImageButton btnvoltarloc1;
    Button btnloc1;
    Button btnweb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_de_localizacao);

        btnvoltarloc1 = (ImageButton) findViewById(R.id.btnvoltarloc1);
        btnloc1 = (Button) findViewById(R.id.btnloc1);
        btnweb = (Button) findViewById(R.id.btnweb);
    }

    public void Pesquisar (View view) {
        Uri uri = Uri.parse("https://www.google.com/maps/place/Centro+de+Descarte+e+Re%C3%BAso+de+Res%C3%ADduos+de+Inform%C3%A1tica+-+CEDIR/@-23.5559876,-46.7285636,15z/data=!4m6!3m5!1s0x94ce563c461c085f:0x3d015c99b2ebd9bc!8m2!3d-23.5559876!4d-46.7285636!16s%2Fg%2F11b7f2k9bh?entry=ttu");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }
    public void PesquisarGoogle (View view){
        Uri uri = Uri.parse("https://www.google.com/search?q=locais+de+descarte+de+lixo+eletronico&rlz=1C1GCEA_enBR1059BR1059&oq=locais+de+descarte&aqs=chrome.0.0i512j69i57j0i512l5j0i22i30l3.3709j0j4&sourceid=chrome&ie=UTF-8");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }
    public void voltar(View view){
        Intent intent = new Intent(this, TelaMenu.class);
        startActivity(intent);
    }
}