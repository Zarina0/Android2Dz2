package com.example.android2dz1.boarding;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android2dz1.R;
import com.example.android2dz1.boarding.model.ViewPagerModel;
import com.example.android2dz1.databinding.FragmentBoardBinding;
import com.example.android2dz1.databinding.FragmentMainBoardBinding;


public class BoardFragment extends Fragment {
    private FragmentBoardBinding binding;
    ViewPagerModel model;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBoardBinding.inflate(getLayoutInflater());
        return binding.getRoot();

    }

}