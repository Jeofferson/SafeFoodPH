package com.example.aimhackathonentry.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;
import com.example.aimhackathonentry.Helpers.NavigationManager;
import com.example.aimhackathonentry.ObjectModels.Product;
import com.example.aimhackathonentry.ObjectModels.User;
import com.example.aimhackathonentry.R;
import com.example.aimhackathonentry.SessionVariables.Constants;
import com.example.aimhackathonentry.SessionVariables.ConstantsSharedPreferences;
import com.example.aimhackathonentry.SessionVariables.ConstantsVolley;
import com.example.aimhackathonentry.SessionVariables.SuperGlobals;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

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

        Glide.with(PlaceOrder.this).load(ConstantsVolley.URL_IMAGES + user.getDisplayPicture()).into(imgBuyerDisplayPicture);
        String fullName = String.format("%s %s", user.getFirstName(), user.getLastName());
        lblFullName.setText(fullName);
        Glide.with(PlaceOrder.this).load(ConstantsVolley.URL_IMAGES + product.getProductDisplayPicture()).into(imgProductDisplayPicture);
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

        hideViewsAction();

        StringRequest stringRequest = new StringRequest(
                Request.Method.POST,
                ConstantsVolley.URL_CREATE_ORDER,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        try {

                            JSONObject jsonObject = new JSONObject(response);

                            String status = jsonObject.getString("status");

                            if (status.equals("failed")) {

                                showError(jsonObject.getString("errorMessage"));

                            } else if (status.equals("success")) {

                                NavigationManager.goToActivity(PlaceOrder.this, OrderSent.class);

                            } else {

                                showError("Process failed.");

                            }

                        } catch (JSONException e) {

                            showError("Process failed.");
                            Log.e(Constants.TAG, e.getMessage());

                        }

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                        showError("Process failed.");
                        Log.e(Constants.TAG, error.getMessage());

                    }
                }) {

            @Override
            protected Map<String, String> getParams() throws AuthFailureError {

                Map<String, String> params = new HashMap<>();

                params.put("productId", String.valueOf(product.getProductId()));
                params.put("buyerId", String.valueOf(user.getUserId()));
                params.put("sellerId", String.valueOf(product.getSellerId()));
                params.put("quantity", String.valueOf(SuperGlobals.orderQuantity));
                params.put("paymentMethod", SuperGlobals.paymentMethod);
                params.put("additionalMessage", SuperGlobals.additionalMessage);

                return params;
            }

        };

        RequestQueue requestQueue = Volley.newRequestQueue(PlaceOrder.this);
        requestQueue.add(stringRequest);

    }


    private void showError(String message) {

        Toast.makeText(PlaceOrder.this, message, Toast.LENGTH_SHORT).show();

        showViewsAction();

    }


    private void hideViewsAction() {

        btnPlaceOrder.setVisibility(View.GONE);
        progressBar.setVisibility(View.VISIBLE);

    }


    private void showViewsAction() {

        progressBar.setVisibility(View.GONE);
        btnPlaceOrder.setVisibility(View.VISIBLE);

    }


}
