package com.example.acg.fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.acg.R;
import com.google.android.material.button.MaterialButton;

public class CircleFragment extends Fragment {

    public CircleFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_circle, container, false);

        View circles = view.findViewById(R.id.circles);

        MaterialButton button = view.findViewById(R.id.refresh);
        button.setOnClickListener(v -> {
            circles.invalidate();
        });

        return view;
    }
}