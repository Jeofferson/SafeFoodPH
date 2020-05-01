package com.example.aimhackathonentry.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.aimhackathonentry.Helpers.NavigationManager;
import com.example.aimhackathonentry.R;

public class Register extends AppCompatActivity {


    private Button btnRegister;

    private TextView btnLogIn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        updateViews();

    }


    private void updateViews() {

        btnRegister = findViewById(R.id.btnRegister);

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

        NavigationManager.goToMainActivity(Register.this);
        finish();

    }


    private void logIn() {

        finish();

    }


}
