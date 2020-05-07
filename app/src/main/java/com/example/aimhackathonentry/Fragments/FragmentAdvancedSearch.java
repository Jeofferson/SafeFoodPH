package com.example.aimhackathonentry.Fragments;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.aimhackathonentry.R;


public class FragmentAdvancedSearch extends Fragment {


    private View view;

    private Toolbar toolbar;

    private Button btnCancel;
    private Button btnApply;


    public FragmentAdvancedSearch() {}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_advanced_search, container, false);

        setUpToolbar("Advanced Search");
        updateViews();

        return view;

    }


    private void setUpToolbar(String title) {

        toolbar = view.findViewById(R.id.toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);

        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(title);

    }


    private void updateViews() {

        btnCancel = view.findViewById(R.id.btnCancel);
        btnApply = view.findViewById(R.id.btnApply);

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                execute(false);

            }
        });

        btnApply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                execute(true);

            }
        });

    }


    private void execute(boolean isApplied) {

        ((AppCompatActivity)getActivity()).onBackPressed();

    }


}
