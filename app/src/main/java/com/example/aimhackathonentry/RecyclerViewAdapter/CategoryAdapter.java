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
import com.example.aimhackathonentry.ObjectModels.Category;
import com.example.aimhackathonentry.R;
import com.example.aimhackathonentry.SessionVariables.ConstantsVolley;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {


    private List<Category> categoryList;

    private Context context;


    public CategoryAdapter(List<Category> categoryList) {
        this.categoryList = categoryList;
    }


    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        context = parent.getContext();

        View view = LayoutInflater.from(context).inflate(R.layout.row_category, parent, false);

        return new CategoryViewHolder(view);

    }


    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {

        Category category = categoryList.get(position);

        Glide.with(context).load(ConstantsVolley.URL_IMAGES + category.getImage()).into(holder.imgImage);
        holder.lblName.setText(category.getName());

    }


    @Override
    public int getItemCount() {
        return categoryList.size();
    }


    public class CategoryViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgImage;

        private TextView lblName;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);

            imgImage = itemView.findViewById(R.id.imgImage);
            lblName = itemView.findViewById(R.id.lblName);

        }

    }


}
