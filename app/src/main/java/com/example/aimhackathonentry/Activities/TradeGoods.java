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
import android.widget.TextView;
import android.widget.Toast;

import com.example.aimhackathonentry.DummyData.Entities;
import com.example.aimhackathonentry.Helpers.NavigationManager;
import com.example.aimhackathonentry.ObjectModels.TradeItem;
import com.example.aimhackathonentry.R;
import com.example.aimhackathonentry.RecyclerViewAdapter.CategoryAdapter;
import com.example.aimhackathonentry.RecyclerViewAdapter.TradeItemAdapter;
import com.example.aimhackathonentry.SessionVariables.SuperGlobals;

import java.util.ArrayList;

public class TradeGoods extends AppCompatActivity {


    private TradeItemAdapter tradeItemAdapter;

    private Toolbar toolbar;

    private RecyclerView recyclerViewTradeGoods;

    private TextView txtTradeItemProductName;
    private Button btnAddTradeItem;
    private Button btnNext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trade_goods);

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

        SuperGlobals.tradeItemList = new ArrayList<>(Entities.tradeItemList);
        updateRecyclerView();

    }


    private void updateRecyclerView() {

        tradeItemAdapter = new TradeItemAdapter(SuperGlobals.tradeItemList);
        recyclerViewTradeGoods.setAdapter(tradeItemAdapter);

    }


    private void updateViews() {

        txtTradeItemProductName = findViewById(R.id.txtTradeItemProductName);
        btnAddTradeItem = findViewById(R.id.btnAddTradeItem);
        btnNext = findViewById(R.id.btnNext);

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

        NavigationManager.goToActivity(TradeGoods.this, AdditionalMessage.class);

    }


}
