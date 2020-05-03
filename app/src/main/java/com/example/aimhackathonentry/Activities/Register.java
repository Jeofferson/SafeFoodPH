package com.example.aimhackathonentry.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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
import com.example.aimhackathonentry.Helpers.NavigationManager;
import com.example.aimhackathonentry.ObjectModels.User;
import com.example.aimhackathonentry.R;
import com.example.aimhackathonentry.SessionVariables.Constants;
import com.example.aimhackathonentry.SessionVariables.ConstantsSharedPreferences;
import com.example.aimhackathonentry.SessionVariables.ConstantsVolley;
import com.example.aimhackathonentry.SessionVariables.SuperGlobals;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Register extends AppCompatActivity {


    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    private EditText txtUsername;
    private EditText txtFirstName;
    private EditText txtLastName;
    private EditText txtCity;
    private EditText txtProvince;
    private EditText txtPassword;
    private EditText txtConfirmPassword;
    private Button btnRegister;
    private ProgressBar progressBar;

    private TextView btnLogIn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        sharedPreferences = getSharedPreferences(ConstantsSharedPreferences.SHARED_PREFERENCES_NAME, Activity.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        updateViews();

    }


    private void updateViews() {

        txtUsername = findViewById(R.id.txtUsername);
        txtFirstName = findViewById(R.id.txtFirstName);
        txtLastName = findViewById(R.id.txtLastName);
        txtCity = findViewById(R.id.txtCity);
        txtProvince = findViewById(R.id.txtProvince);
        txtPassword = findViewById(R.id.txtPassword);
        txtConfirmPassword = findViewById(R.id.txtConfirmPassword);
        btnRegister = findViewById(R.id.btnRegister);
        progressBar = findViewById(R.id.progressBar);

        btnLogIn = findViewById(R.id.btnLogIn);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                register();

            }
        });

        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                logIn();

            }
        });

    }


    private void register() {

        hideViewsAction();

        final String username = txtUsername.getText().toString().trim();
        final String firstName = txtFirstName.getText().toString().trim();
        final String lastName = txtLastName.getText().toString().trim();
        final String city = txtCity.getText().toString().trim();
        final String province = txtProvince.getText().toString().trim();
        final String password = txtPassword.getText().toString().trim();
        final String confirmPassword = txtConfirmPassword.getText().toString().trim();

        if (
                username.isEmpty() ||
                firstName.isEmpty() ||
                lastName.isEmpty() ||
                city.isEmpty() ||
                province.isEmpty() ||
                password.isEmpty() ||
                confirmPassword.isEmpty()
        ) {

            showError("Please fill out all the fields.");
            return;

        }

        if (!password.equals(confirmPassword)) {

            showError("Passwords don't match.");
            return;

        }

        StringRequest stringRequest = new StringRequest(
                Request.Method.POST,
                ConstantsVolley.URL_REGISTER,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        try {

                            JSONObject jsonObject = new JSONObject(response);

                            String status = jsonObject.getString("status");

                            if (status.equals("failed")) {

                                showError(jsonObject.getString("errorMessage"));

                            } else if (status.equals("success")) {

                                int userId = jsonObject.getInt("lastInsertedId");

                                User user = new User(
                                        userId,
                                        username,
                                        password,
                                        firstName,
                                        lastName,
                                        "",
                                        city,
                                        province
                                );

                                SuperGlobals.currentUser = user;

                                Gson gson = new Gson();
                                String json = gson.toJson(user);
                                editor.putString(ConstantsSharedPreferences.CURRENT_USER, json);
                                editor.putString(ConstantsSharedPreferences.ONLINE_STATUS, "Online");
                                editor.commit();

                                NavigationManager.goToActivity(Register.this, MainActivity.class);
                                finish();

                            } else {

                                showError("Login failed.");

                            }

                        } catch (JSONException e) {

                            showError("Login failed.");
                            Log.e(Constants.TAG_LOG_IN, e.getMessage());

                        }

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                        showError("Login failed.");
                        Log.e(Constants.TAG_LOG_IN, error.getMessage());

                    }
                }) {

            @Override
            protected Map<String, String> getParams() throws AuthFailureError {

                Map<String, String> params = new HashMap<>();

                params.put("username", username);
                params.put("password", password);
                params.put("firstName", firstName);
                params.put("lastName", lastName);
                params.put("city", city);
                params.put("province", province);

                return params;
            }

        };

        RequestQueue requestQueue = Volley.newRequestQueue(Register.this);
        requestQueue.add(stringRequest);

    }


    private void showError(String message) {

        Toast.makeText(Register.this, message, Toast.LENGTH_SHORT).show();

        showViewsAction();

    }


    private void hideViewsAction() {

        btnRegister.setVisibility(View.GONE);
        progressBar.setVisibility(View.VISIBLE);

    }


    private void showViewsAction() {

        progressBar.setVisibility(View.GONE);
        btnRegister.setVisibility(View.VISIBLE);

    }


    private void logIn() {

        finish();

    }


}
