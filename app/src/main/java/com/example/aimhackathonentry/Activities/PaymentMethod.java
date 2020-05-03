package com.example.aimhackathonentry.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.aimhackathonentry.ObjectModels.Product;
import com.example.aimhackathonentry.R;
import com.example.aimhackathonentry.SessionVariables.SuperGlobals;

public class PaymentMethod extends AppCompatActivity {


    Product product;

    private Toolbar toolbar;

    private ImageView imgDisplayPicture;
    private TextView lblProductName;
    private TextView lblPrice;
    private TextView lblQuantity;
    private TextView lblDescription;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_method);

        product = SuperGlobals.currentProduct;

        setUpToolbar("Order Details");

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
        lblPrice = findViewById(R.id.lblPrice);
        lblQuantity = findViewById(R.id.lblQuantity);
        lblDescription = findViewById(R.id.lblDescription);

        Glide.with(PaymentMethod.this).load(product.getProductDisplayPicture()).into(imgDisplayPicture);
        lblProductName.setText(product.getProductName());
        lblPrice.setText(String.format("₱%,.2f", product.getPrice()));
        lblQuantity.setText(String.format("Quantity: %d", product.getQuantity()));
        lblDescription.setText(product.getDescription());

    }


}
