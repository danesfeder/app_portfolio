package com.nanodegree.danesfeder.applicationportfolio;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Dan on 10/22/16.
 * Adapter for viewholders
 */

class AppAdapter extends RecyclerView.Adapter<AppViewHolder> {

    private ArrayList<AppInfo> appInfo;

    AppAdapter(ArrayList<AppInfo> appInfo) {
        this.appInfo = appInfo;
    }

    @Override
    public AppViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.app_card_layout, parent, false);

        return new AppViewHolder(v);
    }

    @Override
    public void onBindViewHolder(AppViewHolder holder, int position) {
        holder.mMainTextView.setText(appInfo.get(position).getMainText());
        holder.mSubTextView.setText(appInfo.get(position).getSubText());
    }

    @Override
    public int getItemCount() {
        return appInfo.size();
    }
}
