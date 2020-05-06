package com.example.aimhackathonentry.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.aimhackathonentry.BottomNavigationViewItems.FragmentStore;
import com.example.aimhackathonentry.BottomNavigationViewItems.FragmentShop;
import com.example.aimhackathonentry.BottomNavigationViewItems.FragmentProfile;
import com.example.aimhackathonentry.DummyData.Entities;
import com.example.aimhackathonentry.ObjectModels.User;
import com.example.aimhackathonentry.R;
import com.example.aimhackathonentry.SessionVariables.Constants;
import com.example.aimhackathonentry.SessionVariables.ConstantsSharedPreferences;
import com.example.aimhackathonentry.SessionVariables.ConstantsVolley;
import com.example.aimhackathonentry.SessionVariables.SuperGlobals;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {


    private User user;

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    private FragmentManager fragmentManager;

    private BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        sharedPreferences = getSharedPreferences(ConstantsSharedPreferences.SHARED_PREFERENCES_NAME, Activity.MODE_PRIVATE);
//        editor = sharedPreferences.edit();

        SuperGlobals.currentUser = Entities.userList.get(0);
        user = SuperGlobals.currentUser;

        prepareBottomNavigationView();

//        if (SuperGlobals.shouldCheckForUpdatesInUser) {
//
//            checkForUpdatesInUser();
//
//        } else {
//
//            prepareBottomNavigationView();
//
//        }

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


//    private void checkForUpdatesInUser() {
//
//        StringRequest stringRequest = new StringRequest(
//                Request.Method.POST,
//                ConstantsVolley.URL_CHECK_FOR_UPDATES_IN_USER,
//                new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//
//                        try {
//
//                            JSONObject jsonObject = new JSONObject(response);
//
//                            String status = jsonObject.getString("status");
//
//                            if (status.equals("failed")) {
//
//                                Toast.makeText(MainActivity.this, jsonObject.getString("errorMessage"), Toast.LENGTH_SHORT).show();
//
//                            } else if (status.equals("success")) {
//
//                                int userId = jsonObject.getInt("userId");
//                                String username = jsonObject.getString("username");
//                                String password = jsonObject.getString("password");
//                                String firstName = jsonObject.getString("firstName");
//                                String lastName = jsonObject.getString("lastName");
//                                String displayPicture = jsonObject.getString("displayPicture");
//                                String city = jsonObject.getString("city");
//                                String province = jsonObject.getString("province");
//
//                                User user = new User(
//                                        userId,
//                                        username,
//                                        password,
//                                        firstName,
//                                        lastName,
//                                        displayPicture,
//                                        city,
//                                        province
//                                );
//
//                                SuperGlobals.currentUser = user;
//
//                                Gson gson = new Gson();
//                                String json = gson.toJson(user);
//                                editor.putString(ConstantsSharedPreferences.CURRENT_USER, json);
//                                editor.putString(ConstantsSharedPreferences.ONLINE_STATUS, "Online");
//                                editor.commit();
//
//                                prepareBottomNavigationView();
//
//                            } else {
//
//                                Toast.makeText(MainActivity.this, "Log in failed.", Toast.LENGTH_SHORT).show();
//
//                            }
//
//                        } catch (JSONException e) {
//
//                            Toast.makeText(MainActivity.this, "Log in failed.", Toast.LENGTH_SHORT).show();
//                            Log.e(Constants.TAG, e.getMessage());
//
//                        }
//
//                    }
//                },
//                new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//
//                        Toast.makeText(MainActivity.this, "Log in failed.", Toast.LENGTH_SHORT).show();
//                        Log.e(Constants.TAG, error.toString());
//
//                    }
//                }) {
//
//            @Override
//            protected Map<String, String> getParams() throws AuthFailureError {
//
//                Map<String, String> params = new HashMap<>();
//
//                params.put("userId", String.valueOf(user.getUserId()));
//
//                return params;
//            }
//
//        };
//
//        RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
//        requestQueue.add(stringRequest);
//
//    }


    private void prepareBottomNavigationView() {

        fragmentManager = getSupportFragmentManager();
        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        prepareTabs();

        bottomNavigationView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener);
        bottomNavigationView.setOnNavigationItemReselectedListener(onNavigationItemReselectedListener);

    }


    private void prepareTabs() {

        Fragment fragment = new FragmentShop();

        SuperGlobals.tabLinkedHashMap.put(Constants.SHOP, new ArrayList<>(Arrays.asList(
                fragment
        )));
        SuperGlobals.tabLinkedHashMap.put(Constants.STORE, new ArrayList<Fragment>());
        SuperGlobals.tabLinkedHashMap.put(Constants.PROFILE, new ArrayList<Fragment>());

        SuperGlobals.currentTab = Constants.SHOP;

        fragmentManager
                .beginTransaction()
                .add(R.id.fragmentContainer, fragment)
                .show(fragment)
                .commit();

        bottomNavigationView.getMenu().getItem(0).setIcon(R.drawable.shop_filled);

        SuperGlobals.currentFragment = fragment;

    }


    private BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            bottomNavigationView.getMenu().getItem(0).setIcon(R.drawable.shop);
            bottomNavigationView.getMenu().getItem(1).setIcon(R.drawable.store);
            bottomNavigationView.getMenu().getItem(2).setIcon(R.drawable.profile);

            switch (item.getItemId()) {

                case R.id.shop:
                    item.setIcon(R.drawable.shop_filled);
                    selectTab(Constants.SHOP);
                    return true;

                case R.id.store:
                    item.setIcon(R.drawable.store_filled);
                    selectTab(Constants.STORE);
                    return true;

                case R.id.profile:
                    item.setIcon(R.drawable.profile_filled);
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

                case Constants.SHOP:
                    SuperGlobals.tabLinkedHashMap.get(tabName).add(new FragmentShop());
                    break;

                case Constants.STORE:
                    SuperGlobals.tabLinkedHashMap.get(tabName).add(new FragmentStore());
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

                case R.id.shop:
                    reselectTab(Constants.SHOP);
                    break;

                case R.id.store:
                    reselectTab(Constants.STORE);
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
