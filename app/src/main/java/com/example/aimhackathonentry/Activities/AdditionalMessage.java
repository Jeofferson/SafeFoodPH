package com.example.aimhackathonentry.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.aimhackathonentry.Helpers.NavigationManager;
import com.example.aimhackathonentry.ObjectModels.Product;
import com.example.aimhackathonentry.R;
import com.example.aimhackathonentry.SessionVariables.ConstantsVolley;
import com.example.aimhackathonentry.SessionVariables.SuperGlobals;

public class AdditionalMessage extends AppCompatActivity {


    private Product product;

    private Toolbar toolbar;

    private ImageView imgDisplayPicture;
    private TextView lblProductName;
    private TextView lblDescription;
    private TextView lblFullName;
    private TextView lblAddress;

    private LinearLayout layoutAdditionalMessage;
    private EditText txtAdditionalMessage;

    private Button btnNext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_additional_message);

        product = SuperGlobals.currentProduct;

        setUpToolbar("Additional Message");

        updateViews();

    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {

            case android.R.id.home:
                onBackPressed();
                return true;

        }

        return super.onOptionsItemSelected(item);

    }


    private void setUpToolbar(String title) {

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }


    private void updateViews() {

        imgDisplayPicture = findViewById(R.id.imgDisplayPicture);
        lblProductName = findViewById(R.id.lblProductName);
        lblDescription = findViewById(R.id.lblDescription);
        lblFullName = findViewById(R.id.lblFullName);
        lblAddress = findViewById(R.id.lblAddress);

        layoutAdditionalMessage = findViewById(R.id.layoutAdditionalMessage);
        txtAdditionalMessage = findViewById(R.id.txtAdditionalMessage);

        btnNext = findViewById(R.id.btnNext);

        Glide.with(AdditionalMessage.this).load(ConstantsVolley.URL_IMAGES + product.getProductDisplayPicture()).into(imgDisplayPicture);
        lblProductName.setText(product.getProductName());
        lblDescription.setText(product.getDescription());
        String fullName = String.format("%s %s", product.getFirstName(), product.getLastName());
        lblFullName.setText(fullName);
        String address = String.format("%s, %s", product.getCity(), product.getProvince());
        lblAddress.setText(address);
        
        layoutAdditionalMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                focusOnTextAdditionalMessage();
                
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                next();

            }
        });

    }


    private void focusOnTextAdditionalMessage() {

        txtAdditionalMessage.requestFocus();

        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.showSoftInput(txtAdditionalMessage, InputMethodManager.SHOW_IMPLICIT);

    }


    private void next() {

        SuperGlobals.additionalMessage = txtAdditionalMessage.getText().toString().trim();

        NavigationManager.goToActivity(AdditionalMessage.this, PlaceOrder.class);

    }


}
