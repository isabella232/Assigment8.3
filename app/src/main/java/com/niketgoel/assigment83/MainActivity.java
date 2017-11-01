package com.niketgoel.assigment83;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creating an ArrayList of AndroidVersion objects
        ArrayList<AndroidVersion>arrayListAndroidVersions = new ArrayList<>();
        arrayListAndroidVersions.add(new AndroidVersion("Donut",R.drawable.donut));
        arrayListAndroidVersions.add(new AndroidVersion("Eclair",R.drawable.eclair));
        arrayListAndroidVersions.add(new AndroidVersion("Froyo",R.drawable.froyo));
        arrayListAndroidVersions.add(new AndroidVersion("Gingerbread",R.drawable.gingerbread));
        arrayListAndroidVersions.add(new AndroidVersion("Honeycomb",R.drawable.honeycomb));
        arrayListAndroidVersions.add(new AndroidVersion("Icecream",R.drawable.icecream));
        arrayListAndroidVersions.add(new AndroidVersion("Jellybean",R.drawable.jellybean));
        arrayListAndroidVersions.add(new AndroidVersion("Kitkat",R.drawable.kitkat));
        arrayListAndroidVersions.add(new AndroidVersion("Lollipop",R.drawable.lollipop));
        arrayListAndroidVersions.add(new AndroidVersion("Marshmallow",R.drawable.marshmallow));
        arrayListAndroidVersions.add(new AndroidVersion("Nougat",R.drawable.nougat));

        // Passing context and ArrayList of AndroidVersion
        AndroidVersionAdapter adapter = new AndroidVersionAdapter(this,arrayListAndroidVersions);
        // Accessing GridView
        GridView gridItem = (GridView)findViewById(R.id.gridItemAndroid);
        //Setting adapter into grid GridView
        gridItem.setAdapter(adapter);
    }
}
