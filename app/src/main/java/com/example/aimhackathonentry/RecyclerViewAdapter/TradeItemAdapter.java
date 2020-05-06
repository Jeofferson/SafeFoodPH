package com.example.aimhackathonentry.RecyclerViewAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aimhackathonentry.ObjectModels.TradeItem;
import com.example.aimhackathonentry.R;

import java.util.List;

public class TradeItemAdapter extends RecyclerView.Adapter<TradeItemAdapter.TradeItemViewHolder> {


    private boolean isTradeItemQuantityMutable;

    private List<TradeItem> tradeItemList;

    private Context context;


    public TradeItemAdapter(List<TradeItem> tradeItemList, boolean isTradeItemQuantityMutable) {
        this.tradeItemList = tradeItemList;
        this.isTradeItemQuantityMutable = isTradeItemQuantityMutable;
    }


    @NonNull
    @Override
    public TradeItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        context = parent.getContext();

        View view;

        if (isTradeItemQuantityMutable) {

            view = LayoutInflater.from(context).inflate(R.layout.row_trade_item, parent, false);

        } else {

            view = LayoutInflater.from(context).inflate(R.layout.row_offer_item, parent, false);

        }

        return new TradeItemViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull TradeItemViewHolder holder, int position) {

        TradeItem tradeItem = tradeItemList.get(position);

        holder.lblProductName.setText(tradeItem.getProductName());
        holder.lblTradeItemQuantity.setText((isTradeItemQuantityMutable ? "" : "x") + String.valueOf(tradeItem.getQuantity()));

    }


    @Override
    public int getItemCount() {
        return tradeItemList.size();
    }


    public class TradeItemViewHolder extends RecyclerView.ViewHolder {

        private TextView lblProductName;

        private ImageButton btnDecreaseQuantity;
        private TextView lblTradeItemQuantity;
        private ImageButton btnIncreaseQuantity;

        public TradeItemViewHolder(@NonNull View itemView) {
            super(itemView);

            lblProductName = itemView.findViewById(R.id.lblProductName);
            lblTradeItemQuantity = itemView.findViewById(R.id.lblTradeItemQuantity);

            if (isTradeItemQuantityMutable) {

                btnDecreaseQuantity = itemView.findViewById(R.id.btnDecreaseQuantity);
                btnIncreaseQuantity = itemView.findViewById(R.id.btnIncreaseQuantity);

                btnDecreaseQuantity.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        modifyQuantity(false);

                    }
                });

                btnIncreaseQuantity.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        modifyQuantity(true);

                    }
                });

            }

        }


        private void modifyQuantity(boolean doIncrease) {

            int orderQuantity = Integer.parseInt(lblTradeItemQuantity.getText().toString().trim());

            if (!doIncrease) {

                orderQuantity = Math.max((orderQuantity - 1), 1);

            } else {

                orderQuantity++;

            }

            tradeItemList.get(getAdapterPosition()).setQuantity(orderQuantity);
            lblTradeItemQuantity.setText(String.valueOf(orderQuantity));

        }

    }


}
