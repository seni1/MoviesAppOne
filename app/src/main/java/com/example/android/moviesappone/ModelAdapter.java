package com.example.android.moviesappone;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class ModelAdapter extends RecyclerView.Adapter<ModelAdapter.ViewHolder> {

    private final ArrayList<Model> modelList;
    private ArrayList <Model> mModel;

    public ModelAdapter(ArrayList<Model> modelList) {

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
        Model model = modelList.get(position);
        holder.name.setText(model.getName());
        holder.number.setText(String.valueOf(model.getNumber()));

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView name;
        public TextView number;

        public ViewHolder(View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.tv_name);
            number = itemView.findViewById(R.id.tv_number);
        }
    }
}
