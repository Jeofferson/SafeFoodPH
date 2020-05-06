package com.example.aimhackathonentry.SplashScreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import com.example.aimhackathonentry.Activities.LogIn;
import com.example.aimhackathonentry.Activities.MainActivity;
import com.example.aimhackathonentry.Helpers.NavigationManager;
import com.example.aimhackathonentry.R;
import com.example.aimhackathonentry.SessionVariables.Constants;

public class SplashScreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                NavigationManager.goToActivity(SplashScreen.this, MainActivity.class);
                finish();

            }
        }, Constants.SPLASH_SCREEN_DURATION);

    }


}
