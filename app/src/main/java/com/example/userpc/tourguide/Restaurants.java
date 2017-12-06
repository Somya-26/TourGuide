package com.example.userpc.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Restaurants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);
        ArrayList<LocatePlace> locations = new ArrayList<LocatePlace>();
        locations.add(new LocatePlace("Gopal Sweets","Leela Bhawan",R.drawable.gopal_sweeta));
        locations.add(new LocatePlace("Moti Mahal Deluxe","Bhupindra Road",R.drawable.moti_mahal));
        locations.add(new LocatePlace("Live Tandoor","Stadium Road",R.drawable.livetandoor));
        locations.add(new LocatePlace("KFC","Near Leela Bhawan",R.drawable.kfc));
        locations.add(new LocatePlace("Buns N Bunnies","Mall Road",R.drawable.bunsnbunnies));
        locations.add(new LocatePlace("Barista","Opposite SBI,Bhupindra Road",R.drawable.barista));
        locations.add(new LocatePlace("Green's Restobar","Mall Road",R.drawable.restobar));
        LocatePlaceAdapter locatePlaceAdapter=new LocatePlaceAdapter(this,locations,R.color.colorRestaurant);
        ListView listView=(ListView)findViewById(R.id.list);
        listView.setAdapter(locatePlaceAdapter);

    }
}
