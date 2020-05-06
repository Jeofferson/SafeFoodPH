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
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.aimhackathonentry.Activities.LogIn;
import com.example.aimhackathonentry.Helpers.NavigationManager;
import com.example.aimhackathonentry.ObjectModels.User;
import com.example.aimhackathonentry.SessionVariables.ConstantsSharedPreferences;
import com.example.aimhackathonentry.R;
import com.example.aimhackathonentry.SessionVariables.ConstantsVolley;
import com.example.aimhackathonentry.SessionVariables.SuperGlobals;

import de.hdodenhof.circleimageview.CircleImageView;


public class FragmentProfile extends Fragment {


    private User user;

    private String userFullName;

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    private View view;

    private Toolbar toolbar;

    private CircleImageView imgUserDisplayPicture;
    private TextView lblUserFullName;


    public FragmentProfile() {}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_profile, container, false);

        user = SuperGlobals.currentUser;

        sharedPreferences = getActivity().getSharedPreferences(ConstantsSharedPreferences.SHARED_PREFERENCES_NAME, Activity.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        setUpToolbar("Profile");

        updateViews(view);

        return view;

    }


    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {

        setUpToolbar("Profile");

        inflater.inflate(R.menu.menu_profile_overflow_menu, menu);

        super.onCreateOptionsMenu(menu, inflater);

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
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);

        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(title);
        setHasOptionsMenu(true);

    }


    private void updateViews(View view) {

        imgUserDisplayPicture = view.findViewById(R.id.imgUserDisplayPicture);
        lblUserFullName = view.findViewById(R.id.lblUserFullName);

        Glide.with(view.getContext()).load(ConstantsVolley.URL_IMAGES + user.getDisplayPicture()).into(imgUserDisplayPicture);
        userFullName = String.format("%s %s", user.getFirstName(), user.getLastName());
        lblUserFullName.setText(userFullName);

    }


    private void logOut() {

//        editor.putString(ConstantsSharedPreferences.CURRENT_USER, "");
//        editor.putString(ConstantsSharedPreferences.ONLINE_STATUS, "");
//        editor.commit();

        NavigationManager.goToActivity(getContext(), LogIn.class);
        getActivity().finish();

    }


}
