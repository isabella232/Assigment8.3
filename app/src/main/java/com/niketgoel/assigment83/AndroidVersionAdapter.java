package com.niketgoel.assigment83;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;



public class AndroidVersionAdapter extends ArrayAdapter<AndroidVersion> {
    /**
     * Cnstructor to initilize the Context and ArrayList
     * @param context
     * @param androidVersion
     */
    public AndroidVersionAdapter(Activity context, ArrayList<AndroidVersion>androidVersion) {
        super(context, 0, androidVersion);
    }

    /**
     * Provides a view for an Adapter like ListView,GridView,etc
     * @param position
     * @param convertView
     * @param parent
     * @return
     */

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View gridItemView;
        gridItemView = convertView;
        if(gridItemView == null){
            gridItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_gridview,parent,false);

        }
        // Get the object{@Link AndroidVersion} at this position
        AndroidVersion currentAndroidVersion = getItem(position);

        //setting text into the TextView
        TextView androidName = (TextView)gridItemView.findViewById(R.id.androidVersionText);
        androidName.setText(currentAndroidVersion.getmAndroidVersion());


        //Setting Image into the ImageView
        ImageView androidImage = (ImageView)gridItemView.findViewById(R.id.android_image);
        androidImage.setImageResource(currentAndroidVersion.getmImageResourceId());

        return gridItemView;
    }
}
