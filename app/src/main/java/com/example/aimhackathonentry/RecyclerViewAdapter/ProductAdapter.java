package com.example.aimhackathonentry.RecyclerViewAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aimhackathonentry.Helpers.FragmentNavigationManager;
import com.example.aimhackathonentry.ObjectModels.Product;
import com.example.aimhackathonentry.R;
import com.example.aimhackathonentry.SessionVariables.Constants;

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

        String sellerFullName = String.format("%s %s", product.getFirstName(), product.getLastName());
        holder.lblSellerFullName.setText(sellerFullName);

        holder.lblDescription.setText(product.getDescription());
        holder.lblPrice.setText(String.valueOf(product.getPrice()));
        holder.lblSellerAddress.setText(product.getAddress());

    }


    @Override
    public int getItemCount() {
        return productList.size();
    }


    public class ProductViewHolder extends RecyclerView.ViewHolder {

        private CircleImageView imgSellerDisplayPicture;
        private TextView lblSellerFullName;

        private ImageView imgDisplayPicture;
        private TextView lblDescription;
        private TextView lblPrice;
        private TextView lblSellerAddress;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);

            imgSellerDisplayPicture = itemView.findViewById(R.id.imgSellerDisplayPicture);
            lblSellerFullName = itemView.findViewById(R.id.lblSellerFullName);

            imgDisplayPicture = itemView.findViewById(R.id.imgDisplayPicture);
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

            FragmentNavigationManager.goToFragmentProduct(view, Constants.HOME);

        }

    }


}
