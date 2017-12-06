package com.example.userpc.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Hotels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);
        ArrayList<LocatePlace> locations = new ArrayList<LocatePlace>();
        locations.add(new LocatePlace("Neemrana's Baradari Palace","1.8 km to City centre"));
        locations.add(new LocatePlace("Hotel Narain Continental","1.2 km to City centre"));
        locations.add(new LocatePlace("Kings Retreat","2.4 km to City centre"));
        locations.add(new LocatePlace("Hotel Eqbal Inn","2.6 km to City centre"));
        locations.add(new LocatePlace("Mohan Continental","1.8 km to City centre"));
        locations.add(new LocatePlace("Harpawittar International","4.3 km to City centre"));
        locations.add(new LocatePlace("Godwin","1.9 km to City centre"));
        LocatePlaceAdapter locatePlaceAdapter=new LocatePlaceAdapter(this,locations,R.color.colorHotel,R.drawable.hotel);
        ListView listView=(ListView)findViewById(R.id.list);
        listView.setAdapter(locatePlaceAdapter);

    }
}
