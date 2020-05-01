package com.example.aimhackathonentry.BottomNavigationViewItems;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.aimhackathonentry.ObjectModels.Category;
import com.example.aimhackathonentry.R;
import com.example.aimhackathonentry.RecyclerViewAdapter.CategoryAdapter;
import com.example.aimhackathonentry.SessionVariables.SuperGlobals;


public class FragmentHome extends Fragment {


    private CategoryAdapter categoryAdapter;

    private View view;

    private Toolbar toolbar;
    private SearchView searchView;
    private RecyclerView recyclerViewCategories;


    public FragmentHome() {}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_home, container, false);

        prepareToolbar("SafeFoodPH");
        prepareSearchView();
        prepareRecyclerView();

        return view;

    }


    private void prepareToolbar(String title) {

        toolbar = view.findViewById(R.id.toolbar);
        ((AppCompatActivity)view.getContext()).setSupportActionBar(toolbar);

        ((AppCompatActivity)view.getContext()).getSupportActionBar().setTitle(title);

    }


    private void prepareSearchView() {

        searchView = view.findViewById(R.id.searchView);
        searchView.setQueryHint("Search foods...");

    }


    private void prepareRecyclerView() {

        recyclerViewCategories = view.findViewById(R.id.recyclerViewCategories);
        recyclerViewCategories.setLayoutManager(new LinearLayoutManager(getActivity()));

        queryCategories();

    }


    private void queryCategories() {

        for (int i = 0; i < 10; i++) {

            SuperGlobals.categoryList.add(new Category("Category " + String.valueOf(i)));

        }

        updateRecyclerView();

    }


    private void updateRecyclerView() {

        categoryAdapter = new CategoryAdapter(SuperGlobals.categoryList);
        recyclerViewCategories.setAdapter(categoryAdapter);

    }


}
