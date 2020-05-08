package com.example.aimhackathonentry.Fragments;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.aimhackathonentry.R;


public class FragmentAdvancedSearch extends Fragment {


    private View view;

    private Toolbar toolbar;

    private Spinner spinnerLocation;
    private Spinner spinnerRange;
    private Spinner spinnerSortByPrice;
    private Spinner spinnerSortByLocation;

    private Button btnCancel;
    private Button btnApply;


    public FragmentAdvancedSearch() {}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_advanced_search, container, false);

        setUpToolbar("Advanced Search");
        prepareSpinners();
        updateViews();

        return view;

    }


    private void setUpToolbar(String title) {

        toolbar = view.findViewById(R.id.toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);

        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(title);

    }


    public void prepareSpinners() {

        spinnerLocation = view.findViewById(R.id.spinnerLocation);
        spinnerRange = view.findViewById(R.id.spinnerRange);
        spinnerSortByPrice = view.findViewById(R.id.spinnerSortByPrice);
        spinnerSortByLocation = view.findViewById(R.id.spinnerSortByLocation);

        ArrayAdapter<CharSequence> adapterLocation = ArrayAdapter.createFromResource(view.getContext(), R.array.location, R.layout.support_simple_spinner_dropdown_item);
        spinnerLocation.setAdapter(adapterLocation);

        ArrayAdapter<CharSequence> adapterRange = ArrayAdapter.createFromResource(view.getContext(), R.array.range, R.layout.support_simple_spinner_dropdown_item);
        spinnerRange.setAdapter(adapterRange);

        ArrayAdapter<CharSequence> adapterSortByPrice = ArrayAdapter.createFromResource(view.getContext(), R.array.sortByPrice, R.layout.support_simple_spinner_dropdown_item);
        spinnerSortByPrice.setAdapter(adapterSortByPrice);

        ArrayAdapter<CharSequence> adapterSortByLocation = ArrayAdapter.createFromResource(view.getContext(), R.array.sortByLocation, R.layout.support_simple_spinner_dropdown_item);
        spinnerSortByLocation.setAdapter(adapterSortByLocation);

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
