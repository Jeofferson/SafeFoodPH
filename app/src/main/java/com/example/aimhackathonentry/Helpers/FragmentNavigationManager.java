package com.example.aimhackathonentry.Helpers;

import android.view.View;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.example.aimhackathonentry.BottomNavigationViewItems.FragmentCart;
import com.example.aimhackathonentry.BottomNavigationViewItems.FragmentHome;
import com.example.aimhackathonentry.BottomNavigationViewItems.FragmentProfile;
import com.example.aimhackathonentry.R;
import com.example.aimhackathonentry.SessionVariables.SuperGlobals;

public class FragmentNavigationManager {


    public static void goToFragmentHome(View view, String fromTab) {

        SuperGlobals.currentTab = fromTab;
        SuperGlobals.tabLinkedHashMap.get(fromTab).add(new FragmentHome());

        Fragment fragment = SuperGlobals.tabLinkedHashMap.get(fromTab).get(SuperGlobals.tabLinkedHashMap.get(fromTab).size() - 1);
        ((FragmentActivity) view.getContext()).getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragmentContainer, fragment)
                .hide(SuperGlobals.currentFragment)
                .show(fragment)
                .commit();

        SuperGlobals.currentFragment = fragment;

    }


    public static void goToFragmentProduct(View view, String fromTab) {

//        SuperGlobals.currentTab = fromTab;
//        SuperGlobals.tabLinkedHashMap.get(fromTab).add(new FragmentProduct());
//
//        Fragment fragment = SuperGlobals.tabLinkedHashMap.get(fromTab).get(SuperGlobals.tabLinkedHashMap.get(fromTab).size() - 1);
//        ((FragmentActivity) view.getContext()).getSupportFragmentManager()
//                .beginTransaction()
//                .add(R.id.fragmentContainer, fragment)
//                .hide(SuperGlobals.currentFragment)
//                .show(fragment)
//                .commit();
//
//        SuperGlobals.currentFragment = fragment;

    }


    public static void goToFragmentCart(View view, String fromTab) {

        SuperGlobals.currentTab = fromTab;
        SuperGlobals.tabLinkedHashMap.get(fromTab).add(new FragmentCart());

        Fragment fragment = SuperGlobals.tabLinkedHashMap.get(fromTab).get(SuperGlobals.tabLinkedHashMap.get(fromTab).size() - 1);
        ((FragmentActivity) view.getContext()).getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragmentContainer, fragment)
                .hide(SuperGlobals.currentFragment)
                .show(fragment)
                .commit();

        SuperGlobals.currentFragment = fragment;

    }


    public static void goToFragmentMoreProfile(View view, String fromTab) {

        SuperGlobals.currentTab = fromTab;
        SuperGlobals.tabLinkedHashMap.get(fromTab).add(new FragmentProfile());

        Fragment fragment = SuperGlobals.tabLinkedHashMap.get(fromTab).get(SuperGlobals.tabLinkedHashMap.get(fromTab).size() - 1);
        ((FragmentActivity) view.getContext()).getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragmentContainer, fragment)
                .hide(SuperGlobals.currentFragment)
                .show(fragment)
                .commit();

        SuperGlobals.currentFragment = fragment;

    }


}
