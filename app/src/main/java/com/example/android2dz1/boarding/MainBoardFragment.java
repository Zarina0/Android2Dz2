package com.example.android2dz1.boarding;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android2dz1.R;
import com.example.android2dz1.boarding.model.ViewPagerModel;
import com.example.android2dz1.boarding.model.data.DataClient;
import com.example.android2dz1.databinding.FragmentMainBoardBinding;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class MainBoardFragment extends Fragment {
    private FragmentMainBoardBinding binding;
    ViewPagerAdapter adapter;
    ArrayList<ViewPagerModel> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMainBoardBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        list = DataClient.getData();
        adapter = new ViewPagerAdapter(list);
        binding.viewpager.setAdapter(adapter);
        binding.springDotsIndicator.setViewPager2(binding.viewpager);

    }

    @Override
    public void onStop() {
        super.onStop();
        list.clear();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}











