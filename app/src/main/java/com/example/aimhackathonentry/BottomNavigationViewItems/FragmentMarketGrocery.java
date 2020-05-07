package com.example.aimhackathonentry.BottomNavigationViewItems;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.aimhackathonentry.Fragments.FragmentCategories;
import com.example.aimhackathonentry.Helpers.NavigationManager;
import com.example.aimhackathonentry.R;
import com.example.aimhackathonentry.SessionVariables.Constants;
import com.example.aimhackathonentry.SessionVariables.SuperGlobals;


public class FragmentMarketGrocery extends Fragment {


    private View view;

    private CardView btnMarket;
    private CardView btnGrocery;


    public FragmentMarketGrocery() {}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_market_grocery, container, false);

        updateViews();

        return view;

    }


    private void updateViews() {

        btnMarket = view.findViewById(R.id.btnMarket);
        btnGrocery = view.findViewById(R.id.btnGrocery);

        btnMarket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                choose(0);

            }
        });

        btnGrocery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                choose(1);

            }
        });

    }


    private void choose(int chosenIndex) {

        switch (chosenIndex) {

            case 0:
                SuperGlobals.userBudgetEquivalent = "Market";
                NavigationManager.goToFragment(view, Constants.SHOP, new FragmentCategories());
                break;

            case 1:
                SuperGlobals.userBudgetEquivalent = "Grocery";
                NavigationManager.goToFragment(view, Constants.SHOP, new FragmentCategories());
                break;

        }

    }


}
