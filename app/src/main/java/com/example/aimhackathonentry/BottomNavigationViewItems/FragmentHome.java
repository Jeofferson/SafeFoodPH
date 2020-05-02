package com.example.aimhackathonentry.BottomNavigationViewItems;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.aimhackathonentry.ObjectModels.Product;
import com.example.aimhackathonentry.R;
import com.example.aimhackathonentry.RecyclerViewAdapter.ProductAdapter;
import com.example.aimhackathonentry.SessionVariables.ConstantsVolley;
import com.example.aimhackathonentry.SessionVariables.SuperGlobals;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;


public class FragmentHome extends Fragment {


    private ProductAdapter productAdapter;

    private View view;

    private Toolbar toolbar;
    private SearchView searchView;
    private RecyclerView recyclerViewProducts;


    public FragmentHome() {}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_home, container, false);

        prepareToolbar("SafeFoodPH");
        prepareSearchView();
        prepareRecyclerView();

        return view;

    }


    private void prepareToolbar(String title) {

        toolbar = view.findViewById(R.id.toolbar);
        ((AppCompatActivity)view.getContext()).setSupportActionBar(toolbar);

        ((AppCompatActivity)view.getContext()).getSupportActionBar().setTitle(title);

    }


    private void prepareSearchView() {

        searchView = view.findViewById(R.id.searchView);
        searchView.setQueryHint("Search foods...");

    }


    private void prepareRecyclerView() {

        recyclerViewProducts = view.findViewById(R.id.recyclerViewProducts);
        recyclerViewProducts.setLayoutManager(new LinearLayoutManager(getActivity()));

        queryProducts();

    }


    private void queryProducts() {

        SuperGlobals.productList.clear();

        StringRequest stringRequest = new StringRequest(
                Request.Method.POST,
                ConstantsVolley.URL_RETRIEVE_PRODUCTS,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        try {

                            JSONObject jsonObject2 = new JSONObject(response);
                            JSONArray jsonArray = jsonObject2.getJSONArray("products");

                            for (int i = 0; i < jsonArray.length(); i++) {

                                JSONObject jsonObject = jsonArray.getJSONObject(i);

                                Product product = new Product(
                                        jsonObject.getInt("product_id"),
                                        jsonObject.getInt("seller_id"),
                                        jsonObject.getString("first_name"),
                                        jsonObject.getString("last_name"),
                                        jsonObject.getString("user_display_picture"),
                                        jsonObject.getString("address"),
                                        jsonObject.getString("product_name"),
                                        jsonObject.getString("product_display_picture"),
                                        jsonObject.getString("category"),
                                        jsonObject.getDouble("price"),
                                        jsonObject.getInt("quantity"),
                                        jsonObject.getString("description"),
                                        jsonObject.getString("payment_method")
                                );

                                SuperGlobals.productList.add(product);

                            }

                            updateRecyclerView();

                        } catch (JSONException e) {

                            Toast.makeText(view.getContext(), "Problem loading data.", Toast.LENGTH_SHORT).show();
                            Log.e("Error1", e.getMessage());

                        }

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                        Toast.makeText(view.getContext(), "Problem loading data.", Toast.LENGTH_SHORT).show();
                        Log.e("Error2", error.getMessage());

                    }
                }) {

            @Override
            protected Map<String, String> getParams() throws AuthFailureError {

                Map<String, String> params = new HashMap<>();

                params.put("category", "");
                params.put("filter", "");

                return params;
            }

        };

        RequestQueue requestQueue = Volley.newRequestQueue(view.getContext());
        requestQueue.add(stringRequest);

    }


    private void updateRecyclerView() {

        productAdapter = new ProductAdapter(SuperGlobals.productList);
        recyclerViewProducts.setAdapter(productAdapter);

    }


}
