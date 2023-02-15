package com.example.secondlesson;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BakeryAdapter extends RecyclerView.Adapter<BakeryViewHolder> {
    private ArrayList<String> bakeryList;

    public BakeryAdapter(ArrayList<String> bakeryList) {
        this.bakeryList = bakeryList;
    }


    @NonNull
    @Override
    public BakeryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BakeryViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bakery,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull BakeryViewHolder holder, int position) {
        holder.bind(bakeryList.get(position));


    }

    @Override
    public int getItemCount() {
        return bakeryList.size();
    }
}
