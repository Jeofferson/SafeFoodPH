package com.example.aimhackathonentry.Fragments;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.aimhackathonentry.R;


public class FragmentProducts extends Fragment {


    private View view;

    private Toolbar toolbar;
    private SearchView searchView;


    public FragmentProducts() {}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_products, container, false);

        prepareToolbar("Sample Category");
        prepareSearchView();

        return view;

    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {

            case android.R.id.home:
                ((Activity) view.getContext()).onBackPressed();
                return true;

        }

        return super.onOptionsItemSelected(item);

    }


    private void prepareToolbar(String title) {

        toolbar = view.findViewById(R.id.toolbar);
        ((AppCompatActivity)view.getContext()).setSupportActionBar(toolbar);

        ((AppCompatActivity)view.getContext()).getSupportActionBar().setTitle(title);
        setHasOptionsMenu(true);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayShowHomeEnabled(true);

    }


    private void prepareSearchView() {

        searchView = view.findViewById(R.id.searchView);
        searchView.setQueryHint("Search foods...");

    }


}
