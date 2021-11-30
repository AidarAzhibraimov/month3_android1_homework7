package com.geektech.month3_android1_homework7;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geektech.month3_android1_homework7.databinding.ItemRecyclerBinding;

import java.util.ArrayList;

import model.model;

public class Adapter  extends RecyclerView.Adapter<ViewHolder> {
    public Adapter(ArrayList<model> models) {

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemRecyclerBinding binding = ItemRecyclerBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
