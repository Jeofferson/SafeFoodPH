package com.example.aimhackathonentry.BottomNavigationViewItems;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.widget.SearchView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.aimhackathonentry.DummyData.Entities;
import com.example.aimhackathonentry.Fragments.FragmentAdvancedSearch;
import com.example.aimhackathonentry.Fragments.FragmentCategories;
import com.example.aimhackathonentry.Fragments.FragmentProduct;
import com.example.aimhackathonentry.Helpers.NavigationManager;
import com.example.aimhackathonentry.ObjectModels.Product;
import com.example.aimhackathonentry.R;
import com.example.aimhackathonentry.RecyclerViewAdapter.ProductAdapter;
import com.example.aimhackathonentry.SessionVariables.Constants;
import com.example.aimhackathonentry.SessionVariables.ConstantsVolley;
import com.example.aimhackathonentry.SessionVariables.SuperGlobals;
import com.example.aimhackathonentry.SessionVariables.SuperGlobalsInstanceForMyStoreShop;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FragmentShop extends Fragment {


    private ProductAdapter productAdapter;

    private View view;

    private CardView layoutRecommendedItems;
    private RecyclerView recyclerViewRecommendedItems;

    private RecyclerView recyclerViewProducts;

    private SearchView searchView;
    private ImageView btnCustomSearch;
    private ImageView btnCart;


    public FragmentShop() {}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_shop, container, false);

        prepareSearchView();
        prepareRecyclerView();

        updateViews();

        return view;

    }


    private void prepareSearchView() {

        searchView = view.findViewById(R.id.searchView);
        searchView.setQueryHint("Search foods...");

        View searchPlate = searchView.findViewById(androidx.appcompat.R.id.search_plate);
        searchPlate.setBackgroundColor(Color.parseColor("#00000000"));

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                productAdapter.getFilter().filter(newText);

                return false;

            }
        });

    }


    private void prepareRecyclerView() {

        if (SuperGlobals.currentTab.equals(Constants.SHOP)) {

            layoutRecommendedItems = view.findViewById(R.id.layoutRecommendedItems);
            layoutRecommendedItems.setVisibility(View.VISIBLE);

            recyclerViewRecommendedItems = view.findViewById(R.id.recyclerViewRecommendedItems);
            recyclerViewRecommendedItems.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
            recyclerViewRecommendedItems.setNestedScrollingEnabled(false);

        }

        recyclerViewProducts = view.findViewById(R.id.recyclerViewProducts);
        recyclerViewProducts.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        recyclerViewProducts.setNestedScrollingEnabled(false);

        queryProducts();

    }


    private void queryProducts() {

        switch (SuperGlobals.currentTab) {

            case Constants.SHOP:
                SuperGlobals.dietList.clear();
                SuperGlobals.productListShop.clear();

                SuperGlobals.dietList = new ArrayList<>(Entities.dietFoodList);

                if (SuperGlobals.currentCategory.equals(Constants.ALL)) {

                    SuperGlobals.productListShop = new ArrayList<>(Entities.productList);

                } else {

                    for (int i = 0; i < Entities.productList.size(); i++) {

                        Product product = Entities.productList.get(i);

                        if (product.getCategory().equals(SuperGlobals.currentCategory)) {

                            SuperGlobals.productListShop.add(product);

                        }

                    }

                }
                break;

            case Constants.STORE:
                SuperGlobals.productListStore.clear();

                for (int i = 0; i < Entities.productList.size(); i++) {

                    Product product = Entities.productList.get(i);

                    if (product.getFirstName().equals(Entities.storeList.get(1).getName())) {

                        SuperGlobals.productListStore.add(product);

                    }

                }
                break;

        }

        updateRecyclerView();

//        productList.clear();
//
//        StringRequest stringRequest = new StringRequest(
//                Request.Method.POST,
//                ConstantsVolley.URL_RETRIEVE_PRODUCTS,
//                new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//
//                        try {
//
//                            JSONObject jsonObject2 = new JSONObject(response);
//                            JSONArray jsonArray = jsonObject2.getJSONArray("products");
//
//                            for (int i = 0; i < jsonArray.length(); i++) {
//
//                                JSONObject jsonObject = jsonArray.getJSONObject(i);
//
//                                Product product = new Product(
//                                        jsonObject.getInt("product_id"),
//                                        jsonObject.getInt("seller_id"),
//                                        jsonObject.getString("first_name"),
//                                        jsonObject.getString("last_name"),
//                                        jsonObject.getString("user_display_picture"),
//                                        jsonObject.getString("city"),
//                                        jsonObject.getString("province"),
//                                        jsonObject.getString("product_name"),
//                                        jsonObject.getString("product_display_picture"),
//                                        jsonObject.getString("category"),
//                                        jsonObject.getDouble("price"),
//                                        jsonObject.getInt("quantity"),
//                                        jsonObject.getString("description"),
//                                        jsonObject.getString("payment_method")
//                                );
//
//                                SuperGlobals.productList.add(product);
//
//                            }
//
//                            updateRecyclerView();
//
//                        } catch (JSONException e) {
//
//                            Toast.makeText(view.getContext(), "Problem loading data.", Toast.LENGTH_SHORT).show();
//                            Log.e("Error1", e.getMessage());
//
//                        }
//
//                    }
//                },
//                new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//
//                        Toast.makeText(view.getContext(), "Problem loading data.", Toast.LENGTH_SHORT).show();
//                        Log.e("Error2", error.getMessage());
//
//                    }
//                }) {
//
//            @Override
//            protected Map<String, String> getParams() throws AuthFailureError {
//
//                Map<String, String> params = new HashMap<>();
//
//                params.put("category", "");
//                params.put("filter", "");
//
//                return params;
//            }
//
//        };
//
//        RequestQueue requestQueue = Volley.newRequestQueue(view.getContext());
//        requestQueue.add(stringRequest);

    }


    private void updateRecyclerView() {

        if (SuperGlobals.currentTab.equals(Constants.SHOP)) {

            productAdapter = new ProductAdapter(SuperGlobals.dietList, true);
            recyclerViewRecommendedItems.setAdapter(productAdapter);

        }

        productAdapter = new ProductAdapter(SuperGlobals.currentTab.equals(Constants.SHOP) ? SuperGlobals.productListShop : SuperGlobals.productListStore, false);
        recyclerViewProducts.setAdapter(productAdapter);

    }


    private void updateViews() {

        btnCustomSearch = view.findViewById(R.id.btnCustomSearch);
        btnCart = view.findViewById(R.id.btnCart);

        btnCustomSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                NavigationManager.goToFragment(view, SuperGlobals.currentTab, new FragmentAdvancedSearch());

            }
        });

        btnCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(view.getContext(), "cart", Toast.LENGTH_SHORT).show();

            }
        });

    }


}
