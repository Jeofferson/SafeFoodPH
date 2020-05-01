package com.example.aimhackathonentry.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.aimhackathonentry.Helpers.NavigationManager;
import com.example.aimhackathonentry.R;

public class LogIn extends AppCompatActivity {


    private Button btnLogIn;

    private TextView btnRegister;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        updateViews();

    }


    private void updateViews() {

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

        NavigationManager.goToMainActivity(LogIn.this);
        finish();

    }


    private void register() {

        NavigationManager.goToRegister(LogIn.this);

    }


}
