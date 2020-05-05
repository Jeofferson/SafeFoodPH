package com.example.aimhackathonentry.Fragments;

import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.aimhackathonentry.DummyData.Entities;
import com.example.aimhackathonentry.R;
import com.example.aimhackathonentry.RecyclerViewAdapter.CategoryAdapter;
import com.example.aimhackathonentry.RecyclerViewAdapter.FeedbackAdapter;
import com.example.aimhackathonentry.SessionVariables.SuperGlobals;


public class FragmentCategories extends Fragment {


    private CategoryAdapter categoryAdapter;

    private View view;

    private Toolbar toolbar;

    private RecyclerView recyclerViewCategories;


    public FragmentCategories() {}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_categories, container, false);

        prepareRecyclerView();

        return view;

    }


    private void prepareRecyclerView() {

        recyclerViewCategories = view.findViewById(R.id.recyclerViewCategories);
        recyclerViewCategories.setLayoutManager(new LinearLayoutManager(getActivity()));

        queryCategories();

    }


    private void queryCategories() {

        SuperGlobals.categoryList = Entities.categoryList;
        updateRecyclerView();

    }


    private void updateRecyclerView() {

        categoryAdapter = new CategoryAdapter(SuperGlobals.categoryList);
        recyclerViewCategories.setAdapter(categoryAdapter);

    }


}
