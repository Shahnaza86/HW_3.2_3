package com.example.secondlesson;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> bakeryList;
    private BakeryAdapter adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv_bakery);
        loadData();
        adapter=new BakeryAdapter(bakeryList);
        recyclerView.setAdapter(adapter);

    }

    private void loadData() {
        bakeryList=new ArrayList<>();
        bakeryList.add("Napoleon");
        bakeryList.add("Pahlava");
        bakeryList.add("Tvorozhniy");
        bakeryList.add("Medovik");
        bakeryList.add("Ponchiki");
        bakeryList.add("Samsy");
        bakeryList.add("Bliny");
        bakeryList.add("Picca");
        bakeryList.add("Pirozhki");
        bakeryList.add("Bulochki");
        bakeryList.add("Zavarnye");
    }
}