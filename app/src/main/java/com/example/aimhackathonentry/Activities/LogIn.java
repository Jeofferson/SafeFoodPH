package com.example.aimhackathonentry.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.aimhackathonentry.DummyData.Entities;
import com.example.aimhackathonentry.Helpers.NavigationManager;
import com.example.aimhackathonentry.SessionVariables.ConstantsSharedPreferences;
import com.example.aimhackathonentry.ObjectModels.User;
import com.example.aimhackathonentry.R;
import com.example.aimhackathonentry.SessionVariables.Constants;
import com.example.aimhackathonentry.SessionVariables.ConstantsVolley;
import com.example.aimhackathonentry.SessionVariables.SuperGlobals;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class LogIn extends AppCompatActivity {


    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    private TextView txtUsername;
    private TextView txtPassword;
    private Button btnLogIn;
    private ProgressBar progressBar;

    private TextView btnRegister;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        sharedPreferences = getSharedPreferences(ConstantsSharedPreferences.SHARED_PREFERENCES_NAME, Activity.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        // For resetting Shared Preferences...
//        editor.clear();
//        editor.commit();

//        checkedIfLoggedIn();

        updateViews();

    }


//    private void checkedIfLoggedIn() {
//
        // Dummy data
//        if (sharedPreferences.getString(ConstantsSharedPreferences.ONLINE_STATUS, "").equals("Online")) {
//
//            Gson gson = new Gson();
//            String json = sharedPreferences.getString(ConstantsSharedPreferences.CURRENT_USER, "");
//            User user = gson.fromJson(json, User.class);
//            SuperGlobals.currentUser = user;
//
//            SuperGlobals.shouldCheckForUpdatesInUser = true;
//            NavigationManager.goToActivity(LogIn.this, MainActivity.class);
//            finish();
//
//        }
//
//        SuperGlobals.currentUser = Entities.userList.get(0);
//
//        SuperGlobals.shouldCheckForUpdatesInUser = false;
//        NavigationManager.goToActivity(LogIn.this, MainActivity.class);
//        finish();
//
//    }


    private void updateViews() {

        txtUsername = findViewById(R.id.txtUsername);
        txtPassword = findViewById(R.id.txtPassword);
        btnLogIn = findViewById(R.id.btnLogIn);
        progressBar = findViewById(R.id.progressBar);

        btnRegister = findViewById(R.id.btnRegister);

        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                logIn();

            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                register();

            }
        });

    }


    private void logIn() {

        NavigationManager.goToActivity(LogIn.this, MainActivity.class);
        finish();

//        hideViewsAction();
//
//        final String username = txtUsername.getText().toString().trim();
//        final String password = txtPassword.getText().toString().trim();
//
//        if (username.isEmpty() || password.isEmpty()) {
//
//            showError("Please fill out all the fields.");
//            return;
//
//        }
//
//        StringRequest stringRequest = new StringRequest(
//                Request.Method.POST,
//                ConstantsVolley.URL_LOGIN,
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
//                                showError(jsonObject.getString("errorMessage"));
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
//                                SuperGlobals.shouldCheckForUpdatesInUser = false;
//                                NavigationManager.goToActivity(LogIn.this, MainActivity.class);
//                                finish();
//
//                            } else {
//
//                                showError("Login failed.");
//
//                            }
//
//                        } catch (JSONException e) {
//
//                            showError("Login failed.");
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
//                        showError("Login failed.");
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
//                params.put("username", username);
//                params.put("password", password);
//
//                return params;
//            }
//
//        };
//
//        RequestQueue requestQueue = Volley.newRequestQueue(LogIn.this);
//        requestQueue.add(stringRequest);

    }


    private void showError(String message) {

        Toast.makeText(LogIn.this, message, Toast.LENGTH_SHORT).show();

        showViewsAction();

    }


    private void hideViewsAction() {

        btnLogIn.setVisibility(View.GONE);
        progressBar.setVisibility(View.VISIBLE);

    }


    private void showViewsAction() {

        progressBar.setVisibility(View.GONE);
        btnLogIn.setVisibility(View.VISIBLE);

    }


    private void register() {

        NavigationManager.goToActivity(LogIn.this, Register.class);

    }


}
