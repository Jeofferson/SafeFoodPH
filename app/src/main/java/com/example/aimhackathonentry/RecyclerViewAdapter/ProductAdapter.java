package com.example.aimhackathonentry.RecyclerViewAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.aimhackathonentry.Fragments.FragmentProduct;
import com.example.aimhackathonentry.Helpers.NavigationManager;
import com.example.aimhackathonentry.ObjectModels.Product;
import com.example.aimhackathonentry.R;
import com.example.aimhackathonentry.SessionVariables.Constants;
import com.example.aimhackathonentry.SessionVariables.ConstantsVolley;
import com.example.aimhackathonentry.SessionVariables.SuperGlobals;
import com.example.aimhackathonentry.SessionVariables.SuperGlobalsInstanceForMyStoreShop;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> implements Filterable {


    boolean isHorizontalScrolling;

    private List<Product> productList;
    private List<Product> productListFull;

    private Context context;


    public ProductAdapter(List<Product> productList, boolean isHorizontalSrolling) {
        this.productList = productList;
        this.isHorizontalScrolling = isHorizontalSrolling;

        productListFull = new ArrayList<>(productList);
    }


    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        context = parent.getContext();
        View view;

        if (isHorizontalScrolling) {

            view = LayoutInflater.from(context).inflate(R.layout.row_product_horizontal, parent, false);

        } else {

            view = LayoutInflater.from(context).inflate(R.layout.row_product, parent, false);

        }

        return new ProductViewHolder(view);

    }


    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {

        Product product = productList.get(position);

        Glide.with(context).load(ConstantsVolley.URL_IMAGES + product.getUserDisplayPicture()).into(holder.imgSellerDisplayPicture);
        String fullName = String.format("%s %s", product.getFirstName(), product.getLastName());
        holder.lblFullName.setText(fullName);

        Glide.with(context).load(ConstantsVolley.URL_IMAGES + product.getProductDisplayPicture()).into(holder.imgProductDisplayPicture);
        holder.lblProductName.setText(product.getProductName());
        holder.lblDescription.setText(product.getDescription());
        holder.lblPrice.setText(String.format("₱%,.2f", product.getPrice()));
        String address = String.format("%s, %s", product.getCity(), product.getProvince());
        holder.lblSellerAddress.setText(address);

    }


    @Override
    public int getItemCount() {
        return productList.size();
    }


    @Override
    public Filter getFilter() {
        return productFilter;
    }


    private Filter productFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {

            List<Product> filteredList = new ArrayList<>();

            if (constraint == null || constraint.length() == 0) {

                filteredList.addAll(productListFull);

            } else {

                String filterPattern = constraint.toString().trim().toLowerCase();

                for (int i = 0; i < productListFull.size(); i++) {

                    Product product = productListFull.get(i);

                    if (
                            product.getProductName().toLowerCase().contains(filterPattern) ||
                            product.getCategory().toLowerCase().contains(filterPattern) ||
                            product.getCity().toLowerCase().contains(filterPattern) ||
                            product.getProvince().toLowerCase().contains(filterPattern)
                    ) {

                        filteredList.add(product);

                    }

                }

            }

            FilterResults filterResults = new FilterResults();
            filterResults.values = filteredList;

            return filterResults;

        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {

            productList.clear();
            productList.addAll((List) results.values);

            notifyDataSetChanged();

        }
    };


    public class ProductViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgSellerDisplayPicture;
        private TextView lblFullName;

        private ImageView imgProductDisplayPicture;
        private TextView lblProductName;
        private TextView lblDescription;
        private TextView lblPrice;
        private TextView lblSellerAddress;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);

            imgSellerDisplayPicture = itemView.findViewById(R.id.imgSellerDisplayPicture);
            lblFullName = itemView.findViewById(R.id.lblFullName);

            imgProductDisplayPicture = itemView.findViewById(R.id.imgProductDisplayPicture);
            lblProductName = itemView.findViewById(R.id.lblProductName);
            lblDescription = itemView.findViewById(R.id.lblDescription);
            lblPrice = itemView.findViewById(R.id.lblPrice);
            lblSellerAddress = itemView.findViewById(R.id.lblSellerAddress);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    goToFragmentProduct(v);

                }
            });

        }

        private void goToFragmentProduct(View view) {

            switch (SuperGlobals.currentTab) {

                case Constants.SHOP:
                    SuperGlobals.currentProduct = productList.get(getAdapterPosition());
                    NavigationManager.goToFragment(view, Constants.SHOP, new FragmentProduct());
                    break;

                case Constants.STORE:
                    SuperGlobalsInstanceForMyStoreShop.currentProduct = productList.get(getAdapterPosition());
                    NavigationManager.goToFragment(view, Constants.STORE, new FragmentProduct());
                    break;

            }

        }

    }


}
