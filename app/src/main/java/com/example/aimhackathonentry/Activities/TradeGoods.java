package com.example.aimhackathonentry.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.aimhackathonentry.DummyData.Entities;
import com.example.aimhackathonentry.Helpers.NavigationManager;
import com.example.aimhackathonentry.ObjectModels.Product;
import com.example.aimhackathonentry.ObjectModels.TradeItem;
import com.example.aimhackathonentry.R;
import com.example.aimhackathonentry.RecyclerViewAdapter.CategoryAdapter;
import com.example.aimhackathonentry.RecyclerViewAdapter.TradeItemAdapter;
import com.example.aimhackathonentry.SessionVariables.Constants;
import com.example.aimhackathonentry.SessionVariables.ConstantsVolley;
import com.example.aimhackathonentry.SessionVariables.SuperGlobals;
import com.example.aimhackathonentry.SessionVariables.SuperGlobalsInstanceForMyStoreShop;

import java.util.ArrayList;

public class TradeGoods extends AppCompatActivity {


    private Product product;

    private TradeItemAdapter tradeItemAdapter;

    private Toolbar toolbar;

    private ImageView imgDisplayPicture;
    private TextView lblProductName;
    private TextView lblPrice;
    private TextView lblDescription;

    private RecyclerView recyclerViewTradeGoods;

    private TextView txtTradeItemProductName;
    private Button btnAddTradeItem;
    private Button btnNext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trade_goods);

        product = SuperGlobals.currentTab.equals(Constants.SHOP) ? SuperGlobals.currentProduct : SuperGlobalsInstanceForMyStoreShop.currentProduct;

        setUpToolbar("Trade Goods");

        prepareRecyclerView();
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


    private void prepareRecyclerView() {

        recyclerViewTradeGoods = findViewById(R.id.recyclerViewTradeGoods);
        recyclerViewTradeGoods.setLayoutManager(new LinearLayoutManager(TradeGoods.this));

        queryTradeItems();

    }


    private void queryTradeItems() {

        SuperGlobals.tradeItemList.clear();

        updateRecyclerView();

    }


    private void updateRecyclerView() {

        tradeItemAdapter = new TradeItemAdapter(SuperGlobals.tradeItemList, true);
        recyclerViewTradeGoods.setAdapter(tradeItemAdapter);

    }


    private void updateViews() {

        imgDisplayPicture = findViewById(R.id.imgDisplayPicture);
        lblProductName = findViewById(R.id.lblProductName);
        lblPrice = findViewById(R.id.lblPrice);
        lblDescription = findViewById(R.id.lblDescription);

        btnNext = findViewById(R.id.btnNext);

        txtTradeItemProductName = findViewById(R.id.txtTradeItemProductName);
        btnAddTradeItem = findViewById(R.id.btnAddTradeItem);
        btnNext = findViewById(R.id.btnNext);

        Glide.with(TradeGoods.this).load(ConstantsVolley.URL_IMAGES + product.getProductDisplayPicture()).into(imgDisplayPicture);
        lblProductName.setText(product.getProductName());
        lblPrice.setText(String.format("₱%,.2f", product.getPrice()));
        lblDescription.setText(product.getDescription());

        btnAddTradeItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                addTradeItem();

            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                next();

            }
        });

    }


    private void addTradeItem() {

        String tradeItemProductName = txtTradeItemProductName.getText().toString().trim();

        if (tradeItemProductName.isEmpty()) {

            Toast.makeText(this, "The product name of the trade item must not be empty.", Toast.LENGTH_SHORT).show();

        } else {

            TradeItem tradeItem = new TradeItem(tradeItemProductName, 1);

            SuperGlobals.tradeItemList.add(tradeItem);
            tradeItemAdapter.notifyDataSetChanged();

            txtTradeItemProductName.setText("");
            btnNext.setEnabled(true);

        }

    }


    private void next() {

        Entities.tradeItemList = new ArrayList<>(SuperGlobals.tradeItemList);
        NavigationManager.goToActivity(TradeGoods.this, AdditionalMessage.class);

    }


}
