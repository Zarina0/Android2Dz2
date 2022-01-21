package com.example.android2dz1.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android2.databinding.ItemTaskBinding;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeHolder> {

    ArrayList<String> list = new ArrayList<>();
    //private ItemTaskBinding binding;

    @NonNull
    @Override
    public HomeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HomeHolder(ItemTaskBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull HomeHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void addText(String text) {
        list.add(text);
    }

    public class HomeHolder extends RecyclerView.ViewHolder {
        private ItemTaskBinding binding;

        public HomeHolder(@NonNull ItemTaskBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

        }

        public void onBind(String text) {
            binding.titleTv.setText(text);
        }
    }

}
