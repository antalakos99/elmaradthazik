package com.example.hazi7;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.VH> {
    private Activity mContext;
    private List<Animal> mList;

    public AnimalAdapter(Activity mContext, List<Animal> mList) {
        this.mContext = mContext;
        this.mList = mList;
    }

    @NonNull
    @Override
    public AnimalAdapter.VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new AnimalAdapter.VH(itemView, mContext);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalAdapter.VH holder, int position) {
            Animal animal=mList.get(position);
            holder.image.setImageResource(animal.getKep());
            holder.info.setText(animal.getInfo());
            holder.name.setText(animal.getName());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class VH extends RecyclerView.ViewHolder{
        final View rootView;
        final ImageView image;
        final TextView name;
        final TextView info;

        public VH(@NonNull View itemView, final Context context) {
            super(itemView);
            rootView = itemView;
            image=itemView.findViewById(R.id.kep);
            name=itemView.findViewById(R.id.name);
            info=itemView.findViewById(R.id.info);
        }
    }
}
