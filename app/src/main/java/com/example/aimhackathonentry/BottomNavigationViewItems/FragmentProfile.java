package com.example.aimhackathonentry.BottomNavigationViewItems;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.aimhackathonentry.Activities.LogIn;
import com.example.aimhackathonentry.Helpers.NavigationManager;
import com.example.aimhackathonentry.SessionVariables.ConstantsSharedPreferences;
import com.example.aimhackathonentry.R;
import com.example.aimhackathonentry.SessionVariables.SuperGlobals;


public class FragmentProfile extends Fragment {


    String userFullName;

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    private View view;

    private Toolbar toolbar;

    private TextView lblUserFullName;


    public FragmentProfile() {}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_profile, container, false);

        sharedPreferences = getActivity().getSharedPreferences(ConstantsSharedPreferences.SHARED_PREFERENCES_NAME, Activity.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        setUpToolbar("Profile");

        updateViews(view);

        return view;

    }


    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);

        inflater.inflate(R.menu.menu_profile_overflow_menu, menu);
        super.onCreateOptionsMenu(menu,inflater);

    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {

            case R.id.btnLogOut:
                logOut();
                break;

        }

        return super.onOptionsItemSelected(item);

    }


    private void setUpToolbar(String title) {

        toolbar = view.findViewById(R.id.toolbar);
        ((AppCompatActivity)view.getContext()).setSupportActionBar(toolbar);

        ((AppCompatActivity)view.getContext()).getSupportActionBar().setTitle(title);
        setHasOptionsMenu(true);

    }


    private void updateViews(View view) {

        lblUserFullName = view.findViewById(R.id.lblUserFullName);

        userFullName = String.format("%s %s", SuperGlobals.currentUser.getFirstName(), SuperGlobals.currentUser.getLastName());
        lblUserFullName.setText(userFullName);

    }


    private void logOut() {

        editor.putString(ConstantsSharedPreferences.CURRENT_USER, "");
        editor.putString(ConstantsSharedPreferences.ONLINE_STATUS, "");
        editor.commit();

        NavigationManager.goToActivity(getContext(), LogIn.class);
        getActivity().finish();

    }


}
