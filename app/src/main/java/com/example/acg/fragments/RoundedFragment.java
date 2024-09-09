package com.example.acg.fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.acg.R;
import com.google.android.material.button.MaterialButton;

public class RoundedFragment extends Fragment {

    public RoundedFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_rounded, container, false);

        View rectangles = view.findViewById(R.id.rounded_rectangles);

        MaterialButton button = view.findViewById(R.id.refresh);
        button.setOnClickListener(v -> {
            rectangles.invalidate();
        });

        return view;
    }
}