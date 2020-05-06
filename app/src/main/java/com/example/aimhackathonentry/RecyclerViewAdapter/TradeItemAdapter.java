package com.example.aimhackathonentry.RecyclerViewAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aimhackathonentry.ObjectModels.TradeItem;
import com.example.aimhackathonentry.R;

import java.util.List;

public class TradeItemAdapter extends RecyclerView.Adapter<TradeItemAdapter.TradeItemViewHolder> {


    private List<TradeItem> tradeItemList;

    private Context context;


    public TradeItemAdapter(List<TradeItem> tradeItemList) {
        this.tradeItemList = tradeItemList;
    }


    @NonNull
    @Override
    public TradeItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        context = parent.getContext();

        View view = LayoutInflater.from(context).inflate(R.layout.row_trade_item, parent, false);

        return new TradeItemViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull TradeItemViewHolder holder, int position) {

        TradeItem tradeItem = tradeItemList.get(position);

        holder.lblProductName.setText(tradeItem.getProductName());
        holder.lblTradeItemQuantity.setText(String.valueOf(tradeItem.getQuantity()));

    }


    @Override
    public int getItemCount() {
        return tradeItemList.size();
    }


    public class TradeItemViewHolder extends RecyclerView.ViewHolder {

        private TextView lblProductName;
        private TextView lblTradeItemQuantity;

        public TradeItemViewHolder(@NonNull View itemView) {
            super(itemView);

            lblProductName = itemView.findViewById(R.id.lblProductName);
            lblTradeItemQuantity = itemView.findViewById(R.id.lblTradeItemQuantity);

        }

    }


}
