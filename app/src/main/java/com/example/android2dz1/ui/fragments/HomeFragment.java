package com.example.android2dz1.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.android2.databinding.FragmentHomeBinding;
import com.example.android2dz1.adapter.HomeAdapter;


public class HomeFragment extends Fragment {
    String text;
    private FragmentHomeBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(getLayoutInflater(), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initClickers();
        initAdapter();
        getData();
    }

    private String getData() {
        if (getArguments() != null) {
            text = getArguments().getString("key");
            return text;
        }
        return "";
    }

    private void initAdapter() {
        HomeAdapter homeAdapter = new HomeAdapter();
        binding.homeRecycler.setAdapter(homeAdapter);
        if (!getData().isEmpty()) {
            homeAdapter.addText(text);
        }
    }

    private void initClickers() {
        binding.openCreateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CreatTaskFragment creatTaskFragment = new CreatTaskFragment();
                creatTaskFragment.show(requireActivity().getSupportFragmentManager(),"");
            }
        });
    }


}