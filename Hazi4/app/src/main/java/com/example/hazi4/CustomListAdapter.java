package com.example.hazi4;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomListAdapter extends ArrayAdapter {

    private final Activity context;
    private final  String[] rnevek;
    private final String[] tnevek;
    private final Integer[] kepek;
    private final String[] ear;
    private final String[] var;


    public CustomListAdapter(Activity context, String[] rnevek, String[] tnevek, Integer[] kepek, String[] ear, String[] var) {
        super(context, R.layout.item);
        this.context=context;
        this.rnevek = rnevek;
        this.tnevek = tnevek;
        this.kepek = kepek;
        this.ear = ear;
        this.var = var;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View row=inflater.inflate(R.layout.item,null,true);

        TextView rnev=row.findViewById(R.id.rnev);
        TextView tnev=row.findViewById(R.id.tnev);
        TextView elar=row.findViewById(R.id.ear);
        TextView vear=row.findViewById(R.id.var);
        ImageView img=row.findViewById(R.id.kep);

        rnev.setText(rnevek[position]);
        tnev.setText(tnevek[position]);
        elar.setText(ear[position]);
        vear.setText(var[position]);
        img.setImageResource(kepek[position]);

        return row;
    }
}
