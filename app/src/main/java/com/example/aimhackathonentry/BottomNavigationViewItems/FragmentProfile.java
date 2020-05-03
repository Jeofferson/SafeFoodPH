package com.example.aimhackathonentry.BottomNavigationViewItems;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
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

    private TextView lblUserFullName;

    private Button btnLogOut;


    public FragmentProfile() {}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        userFullName = String.format("%s %s", SuperGlobals.currentUser.getFirstName(), SuperGlobals.currentUser.getLastName());

        sharedPreferences = getActivity().getSharedPreferences(ConstantsSharedPreferences.SHARED_PREFERENCES_NAME, Activity.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        updateViews(view);

        return view;

    }


    private void updateViews(View view) {

        lblUserFullName = view.findViewById(R.id.lblUserFullName);

        btnLogOut = view.findViewById(R.id.btnLogOut);

        lblUserFullName.setText(userFullName);

        btnLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                logOut();

            }
        });

    }


    private void logOut() {

        editor.putString(ConstantsSharedPreferences.CURRENT_USER, "");
        editor.putString(ConstantsSharedPreferences.ONLINE_STATUS, "");
        editor.commit();

        NavigationManager.goToActivity(getContext(), LogIn.class);
        getActivity().finish();

    }


}
