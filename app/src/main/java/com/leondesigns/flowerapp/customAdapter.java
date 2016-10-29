package com.leondesigns.flowerapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Kaos117 on 28/10/2016.
 */

public class customAdapter extends ArrayAdapter<String>{

    public customAdapter(Context context, String[] cat) {
        super(context, R.layout.customrow_tulip ,cat);
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater tulipInflater = LayoutInflater.from(getContext());
        View customView = tulipInflater.inflate(R.layout.customrow_tulip, parent, false);

        String singleTulip = getItem(position);
        TextView tulipTitle  = (TextView) customView.findViewById(R.id.tulipTitle);
        ImageView tulipImg = (ImageView) customView.findViewById(R.id.tulipImg);

        tulipTitle.setText(singleTulip);
        tulipImg.setImageResource(R.drawable.tulip);
        return customView;
    }
}
