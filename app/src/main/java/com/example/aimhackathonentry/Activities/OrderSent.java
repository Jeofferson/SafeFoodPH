package com.example.aimhackathonentry.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.aimhackathonentry.Helpers.NavigationManager;
import com.example.aimhackathonentry.R;
import com.example.aimhackathonentry.SessionVariables.SuperGlobals;

public class OrderSent extends AppCompatActivity {


    private Button btnDone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_sent);

        updateViews();

    }


    private void updateViews() {

        btnDone = findViewById(R.id.btnDone);

        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                done();

            }
        });

    }


    private void done() {

        SuperGlobals.shouldCheckForUpdatesInUser = false;
        NavigationManager.goToActivity(OrderSent.this, MainActivity.class);
        finish();
        
    }


}
