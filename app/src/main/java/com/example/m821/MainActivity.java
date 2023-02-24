package com.example.m821;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnMapa(View view) {
        Intent mapa = new Intent(this, MapsActivity.class);
        startActivity(mapa);

    }

    public void btnLlista(View view) {
        Intent llista = new Intent(this, Llista.class);
        startActivity(llista);
    }
}