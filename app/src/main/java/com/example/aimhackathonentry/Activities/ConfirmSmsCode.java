package com.example.aimhackathonentry.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.aimhackathonentry.Helpers.NavigationManager;
import com.example.aimhackathonentry.R;

public class ConfirmSmsCode extends AppCompatActivity {


    private Button btnNext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_sms_code);

        updateViews();

    }


    private void updateViews() {

        btnNext = findViewById(R.id.btnNext);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                NavigationManager.goToActivity(ConfirmSmsCode.this, MainActivity.class);
                finish();

            }
        });

    }


}
