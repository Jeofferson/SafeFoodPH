package com.example.aimhackathonentry.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.aimhackathonentry.Helpers.NavigationManager;
import com.example.aimhackathonentry.R;

public class MainForm extends AppCompatActivity {


    private Button btnRegister;
    private Button btnLogIn;
    private Button btnFacebook;
    private Button btnGoogle;
    private Button btnSms;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_form);

        updateViews();

    }


    private void updateViews() {

        btnRegister = findViewById(R.id.btnRegister);
        btnLogIn = findViewById(R.id.btnLogIn);
        btnFacebook = findViewById(R.id.btnFacebook);
        btnGoogle = findViewById(R.id.btnGoogle);
        btnSms = findViewById(R.id.btnSms);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                goToRegister();

            }
        });

        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                goToLogIn();

            }
        });

        btnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                goToMain();

            }
        });

        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                goToMain();

            }
        });

        btnSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                goToMain();

            }
        });

    }


    private void goToRegister() {

        NavigationManager.goToActivity(MainForm.this, Register.class);

    }


    private void goToLogIn() {

        NavigationManager.goToActivity(MainForm.this, LogIn.class);

    }


    private void goToMain() {

        NavigationManager.goToActivity(MainForm.this, MainActivity.class);
        finish();

    }


}
