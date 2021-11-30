package com.geektech.month3_android1_homework7;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geektech.month3_android1_homework7.databinding.ItemRecyclerBinding;

public class ViewHolder extends RecyclerView.ViewHolder {
    private final ItemRecyclerBinding binding;
    public ViewHolder(ItemRecyclerBinding binding) {
        super(binding.getRoot());

        this.binding = binding;
    }
}
