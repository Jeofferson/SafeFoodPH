package com.example.aimhackathonentry.Tabs;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.aimhackathonentry.R;


public class TabDashboard extends Fragment {


    private View view;


    public TabDashboard() {}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_tab_dashboard, container, false);

        return view;

    }


}
