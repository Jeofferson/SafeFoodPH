package com.example.aimhackathonentry.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
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
import com.example.aimhackathonentry.SessionVariables.ConstantsVolley;
import com.example.aimhackathonentry.SessionVariables.SuperGlobals;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class LogIn extends AppCompatActivity {


    private TextView txtUsername;
    private TextView txtPassword;
    private Button btnLogIn;

    private TextView btnRegister;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        updateViews();

    }


    private void updateViews() {

        txtUsername = findViewById(R.id.txtUsername);
        txtPassword = findViewById(R.id.txtPassword);
        btnLogIn = findViewById(R.id.btnLogIn);

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

        final String username = txtUsername.getText().toString().trim();
        final String password = txtPassword.getText().toString().trim();

        if (username.isEmpty() || password.isEmpty()) {

            showError("Please fill out all the fields.");
            return;

        }

        StringRequest stringRequest = new StringRequest(
                Request.Method.POST,
                ConstantsVolley.URL_LOGIN,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        try {

                            JSONObject jsonObject = new JSONObject(response);

                            String status = jsonObject.getString("status");

                            if (status.equals("failed")) {

                                showError("Invalid credentials.");

                            } else if (status.equals("success")) {

                                int userId = jsonObject.getInt("userId");
                                String username = jsonObject.getString("username");
                                String password = jsonObject.getString("password");
                                String firstName = jsonObject.getString("firstName");
                                String lastName = jsonObject.getString("lastName");
                                String displayPicture = jsonObject.getString("displayPicture");
                                String address = jsonObject.getString("address");
                                String isLoggedIn = jsonObject.getString("isLoggedIn");

                                SuperGlobals.currentUser = new User(
                                        userId,
                                        username,
                                        password,
                                        firstName,
                                        lastName,
                                        displayPicture,
                                        address,
                                        isLoggedIn
                                );

                                NavigationManager.goToMainActivity(LogIn.this);
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

                return params;
            }

        };

        RequestQueue requestQueue = Volley.newRequestQueue(LogIn.this);
        requestQueue.add(stringRequest);

    }


    private void showError(String message) {

//        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
//
//        showViewsAction();

    }


    private void register() {

        NavigationManager.goToRegister(LogIn.this);

    }


}
