package com.example.aimhackathonentry.RecyclerViewAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.aimhackathonentry.Fragments.FragmentProduct;
import com.example.aimhackathonentry.Helpers.FragmentNavigationManager;
import com.example.aimhackathonentry.ObjectModels.Product;
import com.example.aimhackathonentry.R;
import com.example.aimhackathonentry.SessionVariables.Constants;
import com.example.aimhackathonentry.SessionVariables.SuperGlobals;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {


    private List<Product> productList;

    private Context context;


    public ProductAdapter(List<Product> productList) {
        this.productList = productList;
    }


    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        context = parent.getContext();

        View view = LayoutInflater.from(context).inflate(R.layout.row_product, parent, false);

        return new ProductViewHolder(view);

    }


    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {

        Product product = productList.get(position);

        Glide.with(context).load(product.getUserDisplayPicture()).into(holder.imgSellerDisplayPicture);
        String fullName = String.format("%s %s", product.getFirstName(), product.getLastName());
        holder.lblFullName.setText(fullName);

        Glide.with(context).load(product.getProductDisplayPicture()).into(holder.imgProductDisplayPicture);
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


    public class ProductViewHolder extends RecyclerView.ViewHolder {

        private CircleImageView imgSellerDisplayPicture;
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

            SuperGlobals.currentProduct = productList.get(getAdapterPosition());
            FragmentNavigationManager.goToFragment(view, Constants.HOME, new FragmentProduct());

        }

    }


}
