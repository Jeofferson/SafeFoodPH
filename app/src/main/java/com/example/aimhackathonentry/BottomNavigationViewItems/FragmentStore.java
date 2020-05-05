package com.example.aimhackathonentry.BottomNavigationViewItems;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.aimhackathonentry.Helpers.ViewPagerAdapter;
import com.example.aimhackathonentry.R;
import com.example.aimhackathonentry.SessionVariables.SuperGlobals;
import com.example.aimhackathonentry.Tabs.TabAbout;
import com.example.aimhackathonentry.Tabs.TabDashboard;
import com.example.aimhackathonentry.Tabs.TabForSale;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;


public class FragmentStore extends Fragment {


    private View view;

    private TabLayout tabLayout;
    private ViewPager viewPager;


    public FragmentStore() {}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_store, container, false);

        prepareTabLayout();

        return view;

    }


    private void prepareTabLayout() {

        tabLayout = view.findViewById(R.id.tabLayout);
        viewPager = view.findViewById(R.id.viewPager);

        SuperGlobals.tab1 = new TabDashboard();
        SuperGlobals.tab2 = new TabForSale();
        SuperGlobals.tab3 = new TabAbout();

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(((FragmentActivity) view.getContext()).getSupportFragmentManager(), 0);
        viewPagerAdapter.addTab(SuperGlobals.tab1, "Dashboard");
        viewPagerAdapter.addTab(SuperGlobals.tab2, "For Sale");
        viewPagerAdapter.addTab(SuperGlobals.tab3, "About");

        viewPager.setOffscreenPageLimit(viewPagerAdapter.getCount());
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }


}
