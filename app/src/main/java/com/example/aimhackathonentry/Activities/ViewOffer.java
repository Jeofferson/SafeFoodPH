package com.example.aimhackathonentry.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.aimhackathonentry.DummyData.Entities;
import com.example.aimhackathonentry.R;
import com.example.aimhackathonentry.RecyclerViewAdapter.TradeItemAdapter;
import com.example.aimhackathonentry.SessionVariables.SuperGlobals;

import java.util.ArrayList;

public class ViewOffer extends AppCompatActivity {


    private TradeItemAdapter tradeItemAdapter;

    private Toolbar toolbar;

    private RecyclerView recyclerViewTradeGoods;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_offer);

        setUpToolbar("Offered Goods");

        prepareRecyclerView();

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
        recyclerViewTradeGoods.setLayoutManager(new LinearLayoutManager(ViewOffer.this));

        queryTradeItems();

    }private void queryTradeItems() {

        SuperGlobals.tradeItemList.clear();

        SuperGlobals.tradeItemList = new ArrayList<>(Entities.tradeItemList);
        updateRecyclerView();

    }


    private void updateRecyclerView() {

        tradeItemAdapter = new TradeItemAdapter(SuperGlobals.tradeItemList, false);
        recyclerViewTradeGoods.setAdapter(tradeItemAdapter);

    }


}
