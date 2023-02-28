package com.example.m821;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

//Llista final dels concerts

public class Llista extends AppCompatActivity {

   RecyclerView rvllistaConcerts;
   Adapter_Llista adapter;

   ArrayList<Concert> concerts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_llista);

       rvllistaConcerts = findViewById(R.id.rvConcerts);
       rvllistaConcerts.setLayoutManager(new LinearLayoutManager(this));

       concerts = new ArrayList<>();

       //Creem els concerts

       Concert concert1 = new Concert("Gran Canaria","11/3/2023", "Gran Canaria Arena");
       concerts.add(concert1);
       Concert concert2 = new Concert("Madrid","5/5/2023", "WiZink Center");
       concerts.add(concert2);
        Concert concert3 = new Concert("Barcelona","12/5/2023", "Sant Jordi Club");
        concerts.add(concert3);
        Concert concert4 = new Concert("Sevilla","2/9/2023", "Cabaret Festival Latino");
        concerts.add(concert4);
        Concert concert5 = new Concert("Pamplona","6/10/2023", "Navarra Arena");
        concerts.add(concert5);
        Concert concert6 = new Concert("Bilbao","7/10/2023", "BEC!");
        concerts.add(concert6);

        // I els dissenyem gràcies al adapter que hem fet.

       adapter = new Adapter_Llista(concerts, this);
       rvllistaConcerts.setAdapter(adapter);
       rvllistaConcerts.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

    }
}