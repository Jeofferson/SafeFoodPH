package com.example.aimhackathonentry.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.aimhackathonentry.Helpers.NavigationManager;
import com.example.aimhackathonentry.ObjectModels.Product;
import com.example.aimhackathonentry.R;
import com.example.aimhackathonentry.SessionVariables.SuperGlobals;

public class OrderDetails extends AppCompatActivity {


    private Product product;

    private int orderQuantity;

    private Toolbar toolbar;

    private ImageView imgDisplayPicture;
    private TextView lblProductName;
    private TextView lblPrice;
    private TextView lblQuantity;
    private TextView lblDescription;

    private ImageButton btnDecreaseQuantity;
    private TextView lblOrderQuantity;
    private ImageButton btnIncreaseQuantity;
    private TextView lblOrderPrice;

    private RadioGroup radioGroupPaymentMethod;

    private Button btnNext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);

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

        btnDecreaseQuantity = findViewById(R.id.btnDecreaseQuantity);
        lblOrderQuantity = findViewById(R.id.lblOrderQuantity);
        btnIncreaseQuantity = findViewById(R.id.btnIncreaseQuantity);
        lblOrderPrice = findViewById(R.id.lblOrderPrice);

        radioGroupPaymentMethod = findViewById(R.id.radioGroupPaymentMethod);

        btnNext = findViewById(R.id.btnNext);

        Glide.with(OrderDetails.this).load(product.getProductDisplayPicture()).into(imgDisplayPicture);
        lblProductName.setText(product.getProductName());
        lblPrice.setText(String.format("₱%,.2f each", product.getPrice()));
        lblQuantity.setText(String.format("Quantity: %d", product.getQuantity()));
        lblDescription.setText(product.getDescription());

        lblOrderPrice.setText(String.format("Order Price: ₱%,.2f", product.getPrice()));

        btnDecreaseQuantity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                modifyQuantity(false);

            }
        });

        btnIncreaseQuantity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                modifyQuantity(true);

            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                next();

            }
        });

    }


    private void modifyQuantity(boolean doIncrease) {

        orderQuantity = Integer.parseInt(lblOrderQuantity.getText().toString().trim());

        if (!doIncrease) {

            orderQuantity = Math.max((orderQuantity - 1), 1);

        } else {

            orderQuantity = Math.min((orderQuantity + 1), product.getQuantity());

        }

        lblOrderQuantity.setText(String.valueOf(orderQuantity));
        lblOrderPrice.setText(String.format("Order Price: ₱%,.2f", product.getPrice() * orderQuantity));

    }


    private void next() {

        SuperGlobals.orderQuantity = Integer.parseInt(lblOrderQuantity.getText().toString().trim());
        String paymentMethod = String.valueOf(((RadioButton) findViewById(radioGroupPaymentMethod.getCheckedRadioButtonId())).getText());
        SuperGlobals.paymentMethod = paymentMethod;

        switch (paymentMethod) {

            case "Cash":
                NavigationManager.goToActivity(OrderDetails.this, AdditionalMessage.class);
                break;

            case "Trade":
                break;

        }

    }


}
