package com.example.m821;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng GCArena = new LatLng(28.102907, -15.456285);   
        mMap.addMarker(new MarkerOptions().position(GCArena).title("Gran Canaria Arena").icon(BitmapDescriptorFactory.fromResource(R.drawable.quevedomarker))); //Personalitzacio del marcador
        LatLng WiZink = new LatLng(40.423748, -3.671747);   
        mMap.addMarker(new MarkerOptions().position(WiZink).title("WiZink Center").icon(BitmapDescriptorFactory.fromResource(R.drawable.quevedomarker))); //Personalitzacio del marcador
        LatLng StJordi = new LatLng(41.363887, 2.152614);   
        mMap.addMarker(new MarkerOptions().position(StJordi).title("Sant Jordi Club").icon(BitmapDescriptorFactory.fromResource(R.drawable.quevedomarker))); //Personalitzacio del marcador
        LatLng Cabaret = new LatLng(37.388188, -5.976860);   
        mMap.addMarker(new MarkerOptions().position(Cabaret).title("Cabaret Festival Latino").icon(BitmapDescriptorFactory.fromResource(R.drawable.quevedomarker))); //Personalitzacio del marcador
        LatLng NavArena = new LatLng(42.795883, -1.635303);   
        mMap.addMarker(new MarkerOptions().position(NavArena).title("Navarra Arena").icon(BitmapDescriptorFactory.fromResource(R.drawable.quevedomarker))); //Personalitzacio del marcador
        LatLng BEC = new LatLng(43.288535, -2.992691);   
        mMap.addMarker(new MarkerOptions().position(BEC).title("BEC!").icon(BitmapDescriptorFactory.fromResource(R.drawable.quevedomarker))); //Personalitzacio del marcador
        mMap.moveCamera(CameraUpdateFactory.newLatLng(GCArena));
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL); //Tipus de mapa
    }
}