package com.example.aimhackathonentry.Fragments;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.beloo.widget.chipslayoutmanager.ChipsLayoutManager;
import com.beloo.widget.chipslayoutmanager.gravity.IChildGravityResolver;
import com.beloo.widget.chipslayoutmanager.layouter.breaker.IRowBreaker;
import com.bumptech.glide.Glide;
import com.example.aimhackathonentry.Activities.OrderDetails;
import com.example.aimhackathonentry.Helpers.NavigationManager;
import com.example.aimhackathonentry.ObjectModels.Product;
import com.example.aimhackathonentry.R;
import com.example.aimhackathonentry.SessionVariables.Constants;
import com.example.aimhackathonentry.SessionVariables.ConstantsVolley;
import com.example.aimhackathonentry.SessionVariables.SuperGlobals;
import com.example.aimhackathonentry.SessionVariables.SuperGlobalsInstanceForMyStoreShop;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FragmentProduct extends Fragment {


    private Product product;

    private View view;

    private Toolbar toolbar;

    private ImageView imgDisplayPicture;
    private TextView lblProductName;
    private TextView lblPrice;
    private TextView lblQuantity;
    private TextView lblDescription;

    private ChipGroup chipGroup;

    private ImageView imgStoreDisplayPicture;
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

        product = SuperGlobals.currentTab.equals(Constants.SHOP) ? SuperGlobals.currentProduct : SuperGlobalsInstanceForMyStoreShop.currentProduct;

        updateViews();
        setUpToolbar("Product Details");

        return view;

    }


    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {

//        setUpToolbar("Product Details");
        inflater.inflate(R.menu.menu_cart_overflow_menu, menu);

        super.onCreateOptionsMenu(menu, inflater);

    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {

            case android.R.id.home:
                ((Activity) view.getContext()).onBackPressed();
                return true;

            case R.id.cart:
                Toast.makeText(view.getContext(), "cart", Toast.LENGTH_SHORT).show();
                return true;

        }

        return super.onOptionsItemSelected(item);

    }


    private void setUpToolbar(String title) {

        toolbar = view.findViewById(R.id.toolbar);
        ((AppCompatActivity)view.getContext()).setSupportActionBar(toolbar);

        ((AppCompatActivity)view.getContext()).getSupportActionBar().setTitle(title);
        setHasOptionsMenu(true);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayShowHomeEnabled(true);

    }


    private void updateViews() {

        imgDisplayPicture = view.findViewById(R.id.imgDisplayPicture);
        lblProductName = view.findViewById(R.id.lblProductName);
        lblPrice = view.findViewById(R.id.lblPrice);
        lblQuantity = view.findViewById(R.id.lblQuantity);
        lblDescription = view.findViewById(R.id.lblDescription);

        chipGroup = view.findViewById(R.id.chipGroup);

        imgStoreDisplayPicture = view.findViewById(R.id.imgStoreDisplayPicture);
        lblFullName = view.findViewById(R.id.lblFullName);
        lblAddress = view.findViewById(R.id.lblAddress);

        btnAddToCart = view.findViewById(R.id.btnAddToCart);
        progressBar1 = view.findViewById(R.id.progressBar1);

        btnBuyNow = view.findViewById(R.id.btnBuyNow);
        progressBar2 = view.findViewById(R.id.progressBar2);

        Glide.with(view.getContext()).load(ConstantsVolley.URL_IMAGES + product.getProductDisplayPicture()).into(imgDisplayPicture);
        lblProductName.setText(product.getProductName());
        lblPrice.setText(String.format("₱%,.2f", product.getPrice()));
        lblQuantity.setText(String.format("Quantity: %d", product.getQuantity()));
        lblDescription.setText(product.getDescription());

        setUpChipGroup(product.getNutritions());

        Glide.with(view.getContext()).load(ConstantsVolley.URL_IMAGES + product.getUserDisplayPicture()).into(imgStoreDisplayPicture);
        String fullName = String.format("%s %s", product.getFirstName(), product.getLastName());
        lblFullName.setText(fullName);
        String address = String.format("%s, %s", product.getCity(), product.getProvince());
        lblAddress.setText(address);

        switch (SuperGlobals.currentTab) {

            case Constants.SHOP:
                btnAddToCart.setText("Add to Cart");
                btnBuyNow.setText("Buy Now");

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
                break;

            case Constants.STORE:
                btnAddToCart.setBackground(getResources().getDrawable(R.drawable.my_button_red));
                btnAddToCart.setText("Delete");
                btnBuyNow.setText("View Orders");

                btnAddToCart.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        delete();

                    }
                });

                btnBuyNow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        viewOrders();

                    }
                });
                break;

        }

    }


    private void setUpChipGroup(final List<String> tagList) {

        final ChipGroup chipGroup = view.findViewById(R.id.chipGroup);

        for (int index = 0; index < tagList.size(); index++) {

            final String tagName = tagList.get(index);
            final Chip chip = new Chip(view.getContext());

            int paddingDp = (int) TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP, 10,
                    getResources().getDisplayMetrics()
            );

            chip.setPadding(paddingDp, paddingDp, paddingDp, paddingDp);
            chip.setText(tagName);

//            chip.setCloseIconResource(R.drawable.ic_action_navigation_close);
//            chip.setCloseIconEnabled(true);
//            //Added click listener on close icon to remove tag from ChipGroup
//            chip.setOnCloseIconClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    tagList.remove(tagName);
//                    chipGroup.removeView(chip);
//                }
//            });

            chipGroup.addView(chip);

        }

    }


    private void addToCart() {

        Toast.makeText(view.getContext(), "Add to Cart", Toast.LENGTH_SHORT).show();

    }


    private void buyNow() {

        NavigationManager.goToActivity(view.getContext(), OrderDetails.class);

    }


    private void delete() {

        Toast.makeText(view.getContext(), "Delete", Toast.LENGTH_SHORT).show();

    }


    private void viewOrders() {

        Toast.makeText(view.getContext(), "View Orders", Toast.LENGTH_SHORT).show();

    }


}
