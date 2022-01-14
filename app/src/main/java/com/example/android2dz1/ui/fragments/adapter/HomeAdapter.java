package com.example.android2dz1.ui.fragments.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android2dz1.databinding.HolderListDataBinding;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeHolder> {

    private HolderListDataBinding binding;

    ArrayList<String> list = new ArrayList<>();

    @NonNull
    @Override
    public HomeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = HolderListDataBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new HomeHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void addText(String text){
        list.add(text);
        notifyDataSetChanged();

    }

    public class HomeHolder extends RecyclerView.ViewHolder {

        public HomeHolder(@NonNull HolderListDataBinding binding) {
            super(binding.getRoot());

        }

        public void onBind(String text) {
            binding.titleTv.setText(text);
        }
    }

}
