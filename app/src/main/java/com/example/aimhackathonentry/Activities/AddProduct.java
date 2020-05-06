package com.example.aimhackathonentry.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.example.aimhackathonentry.R;

public class AddProduct extends AppCompatActivity {


    private LinearLayout layoutDescription;
    private EditText txtDescription;

    private Button btnAddProduct;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);

        updateViews();

    }


    private void updateViews() {

        layoutDescription = findViewById(R.id.layoutDescription);
        txtDescription = findViewById(R.id.txtDescription);

        btnAddProduct = findViewById(R.id.btnAddProduct);

        layoutDescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                focusOnTextDescription();

            }
        });

        btnAddProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();

            }
        });

    }


    private void focusOnTextDescription() {

        txtDescription.requestFocus();

        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.showSoftInput(txtDescription, InputMethodManager.SHOW_IMPLICIT);

    }


}
