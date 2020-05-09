package com.example.aimhackathonentry.Activities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.example.aimhackathonentry.R;
import com.example.aimhackathonentry.SessionVariables.Constants;

public class AddProduct extends AppCompatActivity {


    private ImageView imgProductDisplayPicture;

    private LinearLayout layoutDescription;
    private EditText txtDescription;

    private Button btnAddProduct;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);

        updateViews();

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == Constants.PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null & data.getData() != null) {

            Uri imageUri = data.getData();

            Glide.with(AddProduct.this).load(imageUri).into(imgProductDisplayPicture);

        }

    }


    private void updateViews() {

        imgProductDisplayPicture = findViewById(R.id.imgProductDisplayPicture);

        layoutDescription = findViewById(R.id.layoutDescription);
        txtDescription = findViewById(R.id.txtDescription);

        btnAddProduct = findViewById(R.id.btnAddProduct);

        imgProductDisplayPicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openFileChooser();

            }
        });

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


    private void openFileChooser() {

        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, Constants.PICK_IMAGE_REQUEST);

    }


    private void focusOnTextDescription() {

        txtDescription.requestFocus();

        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.showSoftInput(txtDescription, InputMethodManager.SHOW_IMPLICIT);

    }


}
