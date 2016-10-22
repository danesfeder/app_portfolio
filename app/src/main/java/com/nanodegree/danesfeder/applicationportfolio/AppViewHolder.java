package com.nanodegree.danesfeder.applicationportfolio;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by plk5227 on 10/22/16.
 */
public class AppViewHolder extends RecyclerView.ViewHolder {

    public TextView mMainTextView;
    public TextView mSubTextView;

    public AppViewHolder(final View itemView) {
        super(itemView);

        mMainTextView = (TextView) itemView.findViewById(R.id.tv_main_text);
        mSubTextView = (TextView) itemView.findViewById(R.id.tv_sub_text);

        Button mLaunchBtn = (Button) itemView.findViewById(R.id.btn_launch);
        mLaunchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(itemView.getContext(),
                        "This button will launch " + mMainTextView.getText().toString() + "!",
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
