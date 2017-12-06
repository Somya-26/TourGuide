package com.example.userpc.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView=(TextView) findViewById(R.id.places);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,FamousPlaces.class);
                startActivity(intent);
            }
        });
        TextView textView1=(TextView) findViewById(R.id.hotel);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Hotels.class);
                startActivity(intent);
            }
        });
        TextView textView2=(TextView) findViewById(R.id.restaurant);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Restaurants.class);
                startActivity(intent);
            }
        });
        TextView textView3=(TextView) findViewById(R.id.hospital);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Hospitals.class);
                startActivity(intent);
            }
        });
    }
}
