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
import com.example.aimhackathonentry.ObjectModels.Order;
import com.example.aimhackathonentry.R;
import com.example.aimhackathonentry.SessionVariables.ConstantsVolley;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.OrderViewHolder> {


    private List<Order> orderList;

    private Context context;


    public OrderAdapter(List<Order> orderList) {
        this.orderList = orderList;
    }


    @NonNull
    @Override
    public OrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        context = parent.getContext();

        View view = LayoutInflater.from(context).inflate(R.layout.row_order, parent, false);

        return new OrderViewHolder(view);

    }


    @Override
    public void onBindViewHolder(@NonNull OrderViewHolder holder, int position) {

        Order order = orderList.get(position);

        Glide.with(context).load(ConstantsVolley.URL_IMAGES + order.getBuyerDisplayPicture()).into(holder.imgBuyerDisplayPicture);
        holder.lblBuyerFirstName.setText(order.getFirstName());
        holder.lblBuyerLastName.setText(order.getLastName());

        Glide.with(context).load(ConstantsVolley.URL_IMAGES + order.getProductDisplayPicture()).into(holder.imgProductDisplayPicture);
        holder.lblProductName.setText(order.getProductName());
        holder.lblQuantity.setText(String.format("x%d", order.getQuantity()));

    }


    @Override
    public int getItemCount() {
        return orderList.size();
    }


    public class OrderViewHolder extends RecyclerView.ViewHolder {

        private CircleImageView imgBuyerDisplayPicture;
        private TextView lblBuyerFirstName;
        private TextView lblBuyerLastName;

        private ImageView imgProductDisplayPicture;
        private TextView lblProductName;
        private TextView lblQuantity;

        public OrderViewHolder(@NonNull View itemView) {
            super(itemView);

            imgBuyerDisplayPicture = itemView.findViewById(R.id.imgBuyerDisplayPicture);
            lblBuyerFirstName = itemView.findViewById(R.id.lblBuyerFirstName);
            lblBuyerLastName = itemView.findViewById(R.id.lblBuyerLastName);

            imgProductDisplayPicture = itemView.findViewById(R.id.imgProductDisplayPicture);
            lblProductName = itemView.findViewById(R.id.lblProductName);
            lblQuantity = itemView.findViewById(R.id.lblQuantity);

        }

    }


}
