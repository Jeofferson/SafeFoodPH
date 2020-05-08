package com.example.aimhackathonentry.Fragments;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.aimhackathonentry.DummyData.Entities;
import com.example.aimhackathonentry.R;
import com.example.aimhackathonentry.RecyclerViewAdapter.CategoryAdapter;
import com.example.aimhackathonentry.RecyclerViewAdapter.OrderAdapter;
import com.example.aimhackathonentry.SessionVariables.SuperGlobals;


public class FragmentOrders extends Fragment {


    private OrderAdapter orderAdapter;

    private View view;

    private Toolbar toolbar;

    private RecyclerView recyclerViewOrders;


    public FragmentOrders() {}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_orders, container, false);

        setUpToolbar("Orders to Approve");

        prepareRecyclerView();

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


    private void setUpToolbar(String title) {

        toolbar = view.findViewById(R.id.toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);

        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(title);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayShowHomeEnabled(true);

    }


    private void prepareRecyclerView() {

        recyclerViewOrders = view.findViewById(R.id.recyclerViewOrders);
        recyclerViewOrders.setLayoutManager(new LinearLayoutManager(getActivity()));

        queryOrders();

    }


    private void queryOrders() {

        SuperGlobals.orderList = Entities.orderList;
        updateRecyclerView();

    }


    private void updateRecyclerView() {

        orderAdapter = new OrderAdapter(SuperGlobals.orderList);
        recyclerViewOrders.setAdapter(orderAdapter);

    }


}
