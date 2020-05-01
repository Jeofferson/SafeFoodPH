package com.example.aimhackathonentry.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.aimhackathonentry.BottomNavigationViewItems.FragmentCart;
import com.example.aimhackathonentry.BottomNavigationViewItems.FragmentHome;
import com.example.aimhackathonentry.BottomNavigationViewItems.FragmentProfile;
import com.example.aimhackathonentry.R;
import com.example.aimhackathonentry.SessionVariables.Constants;
import com.example.aimhackathonentry.SessionVariables.SuperGlobals;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {


    private FragmentManager fragmentManager;

    private BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prepareBottomNavigationView();

    }


    @Override
    public void onBackPressed() {

        if (SuperGlobals.tabLinkedHashMap.get(SuperGlobals.currentTab).size() <= 1) {

            super.onBackPressed();

        } else {

            Fragment fragment = SuperGlobals.tabLinkedHashMap.get(SuperGlobals.currentTab).get(SuperGlobals.tabLinkedHashMap.get(SuperGlobals.currentTab).size() - 2);
            fragmentManager
                    .beginTransaction()
                    .hide(SuperGlobals.currentFragment)
                    .show(fragment)
                    .commit();

            SuperGlobals.currentFragment = fragment;
            SuperGlobals.tabLinkedHashMap.get(SuperGlobals.currentTab).remove(SuperGlobals.tabLinkedHashMap.get(SuperGlobals.currentTab).size() - 1);

        }

    }


    private void prepareBottomNavigationView() {

        fragmentManager = getSupportFragmentManager();
        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        prepareTabs();

        bottomNavigationView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener);
        bottomNavigationView.setOnNavigationItemReselectedListener(onNavigationItemReselectedListener);

    }


    private void prepareTabs() {

        Fragment fragment = new FragmentHome();

        SuperGlobals.tabLinkedHashMap.put(Constants.HOME, new ArrayList<>(Arrays.asList(
                fragment
        )));
        SuperGlobals.tabLinkedHashMap.put(Constants.CART, new ArrayList<Fragment>());
        SuperGlobals.tabLinkedHashMap.put(Constants.PROFILE, new ArrayList<Fragment>());

        SuperGlobals.currentTab = Constants.HOME;

        fragmentManager
                .beginTransaction()
                .add(R.id.fragmentContainer, fragment)
                .show(fragment)
                .commit();

//        bottomNavigationView.getMenu().getItem(0).setIcon(R.drawable.ic_home_black_24dp);

        SuperGlobals.currentFragment = fragment;

    }


    private BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

//            bottomNavigationView.getMenu().getItem(0).setIcon(R.drawable.home_outline);
//            bottomNavigationView.getMenu().getItem(1).setIcon(R.drawable.world_outline);
//            bottomNavigationView.getMenu().getItem(2).setIcon(R.drawable.countries_outline);

            switch (item.getItemId()) {

                case R.id.home:
//                    item.setIcon(R.drawable.home);
                    selectTab(Constants.HOME);
                    return true;

                case R.id.cart:
//                    item.setIcon(R.drawable.world);
                    selectTab(Constants.CART);
                    return true;

                case R.id.profile:
//                    item.setIcon(R.drawable.countries);
                    selectTab(Constants.PROFILE);
                    return true;

                default:
                    return false;

            }

        }
    };


    private void selectTab(String tabName) {

        SuperGlobals.currentTab = tabName;

        if (SuperGlobals.tabLinkedHashMap.get(tabName).isEmpty()) {

            switch (tabName) {

                case Constants.HOME:
                    SuperGlobals.tabLinkedHashMap.get(tabName).add(new FragmentHome());
                    break;

                case Constants.CART:
                    SuperGlobals.tabLinkedHashMap.get(tabName).add(new FragmentCart());
                    break;

                case Constants.PROFILE:
                    SuperGlobals.tabLinkedHashMap.get(tabName).add(new FragmentProfile());
                    break;

            }

            Fragment fragment = SuperGlobals.tabLinkedHashMap.get(tabName).get(SuperGlobals.tabLinkedHashMap.get(tabName).size() - 1);
            fragmentManager
                    .beginTransaction()
                    .add(R.id.fragmentContainer, fragment)
                    .hide(SuperGlobals.currentFragment)
                    .show(fragment)
                    .commit();

            SuperGlobals.currentFragment = fragment;

        } else {

            Fragment fragment = SuperGlobals.tabLinkedHashMap.get(tabName).get(SuperGlobals.tabLinkedHashMap.get(tabName).size() - 1);
            fragmentManager
                    .beginTransaction()
                    .hide(SuperGlobals.currentFragment)
                    .show(fragment)
                    .commit();

            SuperGlobals.currentFragment = fragment;

        }

    }


    private BottomNavigationView.OnNavigationItemReselectedListener onNavigationItemReselectedListener = new BottomNavigationView.OnNavigationItemReselectedListener() {
        @Override
        public void onNavigationItemReselected(@NonNull MenuItem item) {

            switch (item.getItemId()) {

                case R.id.home:
                    reselectTab(Constants.HOME);
                    break;

                case R.id.cart:
                    reselectTab(Constants.CART);
                    break;

                case R.id.profile:
                    reselectTab(Constants.PROFILE);
                    break;

            }

        }
    };


    private void reselectTab(String tabName) {

        SuperGlobals.currentTab = tabName;

        for (int i = SuperGlobals.tabLinkedHashMap.get(tabName).size() - 1; i >= 1; i--) {

            SuperGlobals.tabLinkedHashMap.get(tabName).remove(i);

        }

        Fragment fragment = SuperGlobals.tabLinkedHashMap.get(tabName).get(SuperGlobals.tabLinkedHashMap.get(tabName).size() - 1);
        fragmentManager
                .beginTransaction()
                .hide(SuperGlobals.currentFragment)
                .show(fragment)
                .commit();

        SuperGlobals.currentFragment = fragment;

    }


}
