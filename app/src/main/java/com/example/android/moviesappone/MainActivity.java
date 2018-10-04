package com.example.android.moviesappone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Images> modelArrayList;

    public static final String KEY = "5571cb8edc0c8203b51ddfb985abd954";
    public static final String IMAGE = "thumbnail";

    private RecyclerView recyclerView;
    private ModelAdapter adapter;
//    private RecyclerView.LayoutManager layoutManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.model_list);

        recyclerView = findViewById(R.id.rv_model);
        modelArrayList = new ArrayList<>();
        adapter = new ModelAdapter(getApplicationContext(), modelArrayList);

        int numberOfColumns = 2;

        recyclerView.setLayoutManager(new GridLayoutManager(this, numberOfColumns));

        recyclerView.setAdapter(adapter);

        getImages();
    }

    private void getImages() {

        App.getApi().getData()

    }


}
