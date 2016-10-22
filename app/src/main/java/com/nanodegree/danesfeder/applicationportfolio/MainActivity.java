package com.nanodegree.danesfeder.applicationportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<AppInfo> appInfo = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvApplications = (RecyclerView) findViewById(R.id.rv_applications);
        rvApplications.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        rvApplications.setItemAnimator(new DefaultItemAnimator());
        rvApplications.setAdapter(new AppAdapter(appInfo));

        prepareAppData();
    }

    void prepareAppData() {
        appInfo.add(new AppInfo("Popular Movies", "What are the best movies out today?"));
        appInfo.add(new AppInfo("Stock Hawk", "Big bucks, no whammies!"));
        appInfo.add(new AppInfo("Build It Bigger", "Bit by bit"));
        appInfo.add(new AppInfo("Make Your App Material", "Front end for days"));
        appInfo.add(new AppInfo("Go Ubiquitous", "???"));
        appInfo.add(new AppInfo("Capstone", "The final product"));
    }
}
