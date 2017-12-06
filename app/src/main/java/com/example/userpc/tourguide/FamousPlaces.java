package com.example.userpc.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamousPlaces extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);
        ArrayList<LocatePlace> locations = new ArrayList<LocatePlace>();
        locations.add(new LocatePlace("Kaali Temple ","Mall Road",R.drawable.temple));
        locations.add(new LocatePlace("Gurudwara Dukh Nivaran Saahib","Nabha Road",R.drawable.gurudwara));
        locations.add(new LocatePlace("Baradari Garden","Baradari Road",R.drawable.bardari));
        locations.add(new LocatePlace("National Institute of Sports","Lower Mall Road",R.drawable.nis));
        locations.add(new LocatePlace("Quila Mubarak","Quila Chownk",R.drawable.quila));
        locations.add(new LocatePlace("Sheesh Mahal","Dakala Road",R.drawable.shheshmahal));
        locations.add(new LocatePlace("Omaxe Mall","Mall Road",R.drawable.images));
     LocatePlaceAdapter locatePlaceAdapter=new LocatePlaceAdapter(this,locations,R.color.colorFamousPlace);
        ListView listView=(ListView)findViewById(R.id.list);
        listView.setAdapter(locatePlaceAdapter);

    }
}
