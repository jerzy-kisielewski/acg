package com.example.acg;

import com.example.acg.fragments.*;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new CircleFragment();
            case 1:
                return new RectangleFragment();
            case 2:
                return new EllipseFragment();
            case 3:
                return new RoundedFragment();
            case 4:
                return new SquareFragment();
            case 5:
                return new LineFragment();
            default:
                return new CircleFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 6;
    }
}
