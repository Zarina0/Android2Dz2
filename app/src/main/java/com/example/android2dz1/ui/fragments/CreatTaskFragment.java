package com.example.android2dz1.ui.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android2dz1.R;
import com.example.android2dz1.databinding.FragmentCreatTaskBinding;


public class CreatTaskFragment extends Fragment {
    FragmentCreatTaskBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCreatTaskBinding.inflate(getLayoutInflater(), container, false);
        return binding.getRoot();
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initClickers();
    }

    private void initClickers() {
        binding.btnToSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendingData();
            }
        });
    }

    private void sendingData() {
        String text = binding.edText.getText().toString();
        String number = binding.edNumbers.getText().toString();

        if (text.isEmpty()) {
            binding.edText.setError("Input text");
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("key", text);
            bundle.putString("key1",number);
            Navigation.findNavController(requireView()).navigate(R.id.homeFragment, bundle);
        }
    }
}