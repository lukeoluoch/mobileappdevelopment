package com.example.myapplicationz;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new SimpleListFragment(); //ChildFragment1 at position 0
            case 1:
                return new PlaceholderFragment(); //ChildFragment2 at position 1
            }
        return null; //does not happen
    }

    @Override
    public int getCount() {
        return 2; //three fragments
    }
}