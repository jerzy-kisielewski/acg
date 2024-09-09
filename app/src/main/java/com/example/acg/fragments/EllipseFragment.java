package com.example.acg.fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.acg.R;
import com.google.android.material.button.MaterialButton;

public class EllipseFragment extends Fragment {


    public EllipseFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ellipse, container, false);

        View rectangles = view.findViewById(R.id.ellipses);

        MaterialButton button = view.findViewById(R.id.refresh);
        button.setOnClickListener(v -> {
            rectangles.invalidate();
        });

        return view;
    }
}