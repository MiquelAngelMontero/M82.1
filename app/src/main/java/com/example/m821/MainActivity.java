package com.example.m821;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    static MediaPlayer mp; // declarem mediaplayer per la musica de fons
    MediaPlayer mp2; // musica per els botons
    Button botonmapa, botonlista; // declarem els botons

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp2 = MediaPlayer.create(this, R.raw.bzrp); // fiquem la musica de fons
        mp2.start();
        //D
    }

    public void btnMapa(View view) {
        mp = MediaPlayer.create(this, R.raw.quevedo); // li assignem la música que volem ficar-li al botó
        mp2.stop(); //parem la mísica de fons
        mp.start();

        Intent mapa = new Intent(this, MapsActivity.class);

        startActivity(mapa);

    }

    public void btnLlista(View view) {
        mp = MediaPlayer.create(this, R.raw.quevedo); // li assignem la musica que volem ficar-li al botó
        mp2.stop(); //parem la música de fons
        mp.start();
        Intent llista = new Intent(this, Llista.class);
        startActivity(llista);
    }

    public static MediaPlayer getMp() {
        return mp;
    }
}