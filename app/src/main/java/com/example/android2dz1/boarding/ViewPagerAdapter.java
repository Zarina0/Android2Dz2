package com.example.android2dz1.boarding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android2dz1.boarding.model.ViewPagerModel;
import com.example.android2dz1.databinding.FragmentBoardBinding;

import java.util.ArrayList;

public class ViewPagerAdapter extends RecyclerView.Adapter<ViewPagerAdapter.ViewPagerHolder> {

    ArrayList<ViewPagerModel> list = new ArrayList<>();

    public ViewPagerAdapter(ArrayList<ViewPagerModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewPagerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewPagerHolder(FragmentBoardBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull ViewPagerHolder holder, int position) {
        holder.onBind(list.get(position));


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewPagerHolder extends RecyclerView.ViewHolder {
        private FragmentBoardBinding binding;

        public ViewPagerHolder(@NonNull FragmentBoardBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }


        public void onBind(ViewPagerModel model) {
            binding.tvTitle.setText(model.getTitle());
            binding.tvDiscription.setText(model.getDescription());
            binding.imageview.setImageResource(model.getImage());
        }
    }

}
