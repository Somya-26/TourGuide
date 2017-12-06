package com.example.userpc.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Hospitals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);
        ArrayList<LocatePlace> locations = new ArrayList<LocatePlace>();
        locations.add(new LocatePlace("A P Healthcare & Trauma Centre","Chotti Baradari"));
        locations.add(new LocatePlace("Sachdeva Family Hospital","Bhadson Road"));
        locations.add(new LocatePlace("Columbia Asia Hospital","Bhupindera Road"));
        locations.add(new LocatePlace("Gursharan Hospital","Gursharan Road"));
        locations.add(new LocatePlace("Goverment Hospital","Sangroor Road"));
        locations.add(new LocatePlace("Patiala Heart Institute","Jagdish Marg"));
        locations.add(new LocatePlace("Narayan Hospital","Rajpura Road"));
        LocatePlaceAdapter locatePlaceAdapter=new LocatePlaceAdapter(this,locations,R.color.colorHospital,R.drawable.hospital);
        ListView listView=(ListView)findViewById(R.id.list);
        listView.setAdapter(locatePlaceAdapter);

    }
}
