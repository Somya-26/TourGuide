package com.example.userpc.tourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class LocatePlaceAdapter extends ArrayAdapter<LocatePlace> {
    private int colorId;
    private int imageId;
    public LocatePlaceAdapter(Activity context, ArrayList<LocatePlace> locations,int color)
    {
        super(context,0,locations);
        colorId=color;
        imageId=0;
    }
    public LocatePlaceAdapter(Activity context, ArrayList<LocatePlace> locations,int color,int image)
    {
        super(context,0,locations);
        colorId=color;
        imageId=image;
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listView = convertView;
        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        LocatePlace currentPlace=getItem(position);
        TextView textView=(TextView)listView.findViewById(R.id.name);
        String name=currentPlace.getName();
        textView.setText(name);
        TextView textView1=(TextView)listView.findViewById(R.id.address);
        textView1.setText(currentPlace.getAddressOfPlace());
        LinearLayout linearLayout=(LinearLayout)listView.findViewById(R.id.linear_layout);
        linearLayout.setBackgroundColor(ContextCompat.getColor(getContext(),colorId));
        ImageView imageView=(ImageView)listView.findViewById(R.id.image);
        if(imageId==0)
       imageView.setImageResource(currentPlace.getmImageId());
        else
            imageView.setImageResource(imageId);
        return listView;
    }
}
