package com.example.aimhackathonentry.Helpers;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.example.aimhackathonentry.R;
import com.example.aimhackathonentry.SessionVariables.SuperGlobals;


public class NavigationManager {


    public static void goToActivity(Context context, Class _class) {

        Intent intent = new Intent(context, _class);
        context.startActivity(intent);

    }


    public static void goToFragment(View view, String fromTab, Fragment fragment) {

        SuperGlobals.currentTab = fromTab;
        SuperGlobals.tabLinkedHashMap.get(fromTab).add(fragment);

        ((FragmentActivity) view.getContext()).getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragmentContainer, fragment)
                .hide(SuperGlobals.currentFragment)
                .show(fragment)
                .commit();

        SuperGlobals.currentFragment = fragment;

    }


}
