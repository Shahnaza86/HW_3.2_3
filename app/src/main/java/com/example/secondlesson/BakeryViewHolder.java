package com.example.secondlesson;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BakeryViewHolder extends RecyclerView.ViewHolder {
    private TextView tvBakery;

    public BakeryViewHolder(@NonNull View itemView) {
        super(itemView);
        tvBakery=itemView.findViewById(R.id.tv_bakery);
    }

    void bind(String bakery){
        tvBakery.setText(bakery);

    }
}
