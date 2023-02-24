package com.example.m821;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;
    Button botonmapa, botonlista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //hola
    }

    public void btnMapa(View view) {
        mp = MediaPlayer.create(this, R.raw.quevedo);
        mp.start();
        Intent mapa = new Intent(this, MapsActivity.class);

        startActivity(mapa);

    }

    public void btnLlista(View view) {
        mp = MediaPlayer.create(this, R.raw.quevedo);
        mp.start();
        Intent llista = new Intent(this, Llista.class);
        startActivity(llista);
    }



}