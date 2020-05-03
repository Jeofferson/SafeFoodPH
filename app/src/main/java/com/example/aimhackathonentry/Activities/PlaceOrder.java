package com.example.aimhackathonentry.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.aimhackathonentry.ObjectModels.Product;
import com.example.aimhackathonentry.ObjectModels.User;
import com.example.aimhackathonentry.R;
import com.example.aimhackathonentry.SessionVariables.SuperGlobals;

import de.hdodenhof.circleimageview.CircleImageView;

public class PlaceOrder extends AppCompatActivity {


    private User user;
    private Product product;

    private Toolbar toolbar;

    private CircleImageView imgBuyerDisplayPicture;
    private TextView lblFullName;
    private ImageView imgProductDisplayPicture;
    private TextView lblProductName;
    private TextView lblQuantity;
    private TextView lblPaymentMethod;
    private TextView lblOrderPrice;

    private View viewHr;
    private TextView lblAdditionalMessageLabel;
    private ScrollView scrollViewAdditionalMessage;
    private TextView lblAdditionalMessage;

    private Button btnPlaceOrder;
    private ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_order);

        user = SuperGlobals.currentUser;
        product = SuperGlobals.currentProduct;

        setUpToolbar("Review Order");

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

        imgBuyerDisplayPicture = findViewById(R.id.imgBuyerDisplayPicture);
        lblFullName = findViewById(R.id.lblFullName);
        imgProductDisplayPicture = findViewById(R.id.imgProductDisplayPicture);
        lblProductName = findViewById(R.id.lblProductName);
        lblQuantity = findViewById(R.id.lblQuantity);
        lblPaymentMethod = findViewById(R.id.lblPaymentMethod);
        lblOrderPrice = findViewById(R.id.lblOrderPrice);

        viewHr = findViewById(R.id.viewHr);
        lblAdditionalMessageLabel = findViewById(R.id.lblAdditionalMessageLabel);
        scrollViewAdditionalMessage = findViewById(R.id.scrollViewAdditionalMessage);
        lblAdditionalMessage = findViewById(R.id.lblAdditionalMessage);

        btnPlaceOrder = findViewById(R.id.btnPlaceOrder);
        progressBar = findViewById(R.id.progressBar);

        Glide.with(PlaceOrder.this).load(user.getDisplayPicture()).into(imgBuyerDisplayPicture);
        String fullName = String.format("%s %s", user.getFirstName(), user.getLastName());
        lblFullName.setText(fullName);
        Glide.with(PlaceOrder.this).load(product.getProductDisplayPicture()).into(imgProductDisplayPicture);
        lblProductName.setText(product.getProductName());
        lblQuantity.setText(String.format("Quantity: x%d", SuperGlobals.orderQuantity));
        lblPaymentMethod.setText("Payment Method: " + SuperGlobals.paymentMethod);
        lblOrderPrice.setText(String.format("₱%,.2f", product.getPrice() * SuperGlobals.orderQuantity));

        if (SuperGlobals.additionalMessage.isEmpty()) {

            viewHr.setVisibility(View.GONE);
            lblAdditionalMessageLabel.setVisibility(View.GONE);
            scrollViewAdditionalMessage.setVisibility(View.GONE);

        } else {

            lblAdditionalMessage.setText(SuperGlobals.additionalMessage);

            viewHr.setVisibility(View.VISIBLE);
            lblAdditionalMessageLabel.setVisibility(View.VISIBLE);
            scrollViewAdditionalMessage.setVisibility(View.VISIBLE);

        }

        btnPlaceOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                placeOrder();

            }
        });

    }


    private void placeOrder() {



    }


}
