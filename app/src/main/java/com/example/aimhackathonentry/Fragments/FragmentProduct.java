package com.example.aimhackathonentry.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.aimhackathonentry.ObjectModels.Product;
import com.example.aimhackathonentry.R;
import com.example.aimhackathonentry.SessionVariables.SuperGlobals;


public class FragmentProduct extends Fragment {


    private View view;

    private ImageView imgDisplayPicture;
    private TextView lblPrice;
    private TextView lblQuantity;
    private TextView lblDescription;
    private TextView lblFullName;
    private TextView lblAddress;

    private Button btnAddToCart;
    private ProgressBar progressBar1;

    private Button btnBuyNow;
    private ProgressBar progressBar2;


    public FragmentProduct() {}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_product, container, false);

        updateViews();

        return view;

    }


    private void updateViews() {

        imgDisplayPicture = view.findViewById(R.id.imgDisplayPicture);
        lblPrice = view.findViewById(R.id.lblPrice);
        lblQuantity = view.findViewById(R.id.lblQuantity);
        lblDescription = view.findViewById(R.id.lblDescription);
        lblFullName = view.findViewById(R.id.lblFullName);
        lblAddress = view.findViewById(R.id.lblAddress);

        btnAddToCart = view.findViewById(R.id.btnAddToCart);
        progressBar1 = view.findViewById(R.id.progressBar1);

        btnBuyNow = view.findViewById(R.id.btnBuyNow);
        progressBar2 = view.findViewById(R.id.progressBar2);

        Product product = SuperGlobals.currentProduct;

        Glide.with(view.getContext()).load(product.getProductDisplayPicture()).into(imgDisplayPicture);
        lblPrice.setText(String.valueOf(product.getPrice()));
        lblQuantity.setText(String.valueOf(product.getQuantity()));
        lblDescription.setText(String.valueOf(product.getDescription()));
        String fullName = String.format("%s %s", product.getFirstName(), product.getLastName());
        lblFullName.setText(fullName);

        lblAddress.setText(String.valueOf(product.getAddress()));

        btnAddToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                addToCart();

            }
        });

        btnBuyNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                buyNow();

            }
        });

    }


    private void addToCart() {

    }


    private void buyNow() {

    }


}
