package com.example.android.moviesappone;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class ModelAdapter extends RecyclerView.Adapter<ModelAdapter.ViewHolder> {

    private final ArrayList<Images> modelList;
    private Context context;

    public ModelAdapter(Context applicationContext, ArrayList<Images> modelList) {
        this.context = context;
        this.modelList = modelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.model_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Images images = modelList.get(position);
        holder.name.setText(images.getImages());
//        holder.number.setText(String.valueOf(model.getNumber()));

        Glide.with(context).load(images.getFields().getThumbnail()).into(holder.image);

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView name;
        public ImageView image;

        public ViewHolder(View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.tv_image);
        }
    }

    public void setData(List<Images> list) {
        modelList.addAll(list);
        notifyDataSetChanged();
    }
}
