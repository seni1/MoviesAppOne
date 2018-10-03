package com.example.android.moviesappone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Model> modelArrayList;
    private RecyclerView recyclerView;
    private ModelAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.model_list);

        recyclerView = findViewById(R.id.rv_model);
        modelArrayList = Model.createMovieList();
        adapter = new ModelAdapter(modelArrayList);
        int numberOfColumns = 2;
        recyclerView.setLayoutManager(new GridLayoutManager(this, numberOfColumns));
        recyclerView.setAdapter(adapter);
    }
}
