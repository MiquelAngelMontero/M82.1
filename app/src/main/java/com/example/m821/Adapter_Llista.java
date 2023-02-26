package com.example.m821;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;

public class Adapter_Llista extends RecyclerView.Adapter<Adapter_Llista.ViewHolder> {

    ArrayList<Concert> llistaConcerts;
    private Context context;

    public Adapter_Llista(ArrayList<Concert> llistaConcerts, Context context) {
        this.llistaConcerts = llistaConcerts;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.concert_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Concert concert = llistaConcerts.get(position);

        holder.lloc.setText(concert.getLloc());
        holder.data.setText(concert.getData());
        holder.sitio.setText(concert.getSitio());

        holder.visit.setOnClickListener(new View.OnClickListener() {@Override
        public void onClick(View v) {
            final String website = "https://www.ticketmaster.es/artist/quevedo-entradas/1151453?clickId=W1KRhATExxyNR3CzNTQzc24XUkAU3PXVGWFn0g0&irgwc=1&utm_source=1313006-Wake%20And%20Listen&utm_medium=affiliate&utm_campaign=1313006";
            Log.i("Location , ", website);
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(website));
            context.startActivity(browserIntent);
        }
        });
    }

    @Override
    public int getItemCount() {
        return llistaConcerts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView lloc;
        TextView data;
        TextView sitio;
        ImageView visit;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            lloc = itemView.findViewById(R.id.lloc);
            data = itemView.findViewById(R.id.data);
            sitio = itemView.findViewById(R.id.sitio);
            visit = itemView.findViewById(R.id.visit);
        }
    }
}

