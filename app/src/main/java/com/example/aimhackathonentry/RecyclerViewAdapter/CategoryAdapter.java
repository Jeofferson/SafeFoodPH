package com.example.aimhackathonentry.RecyclerViewAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aimhackathonentry.Helpers.FragmentNavigationManager;
import com.example.aimhackathonentry.ObjectModels.Category;
import com.example.aimhackathonentry.R;
import com.example.aimhackathonentry.SessionVariables.Constants;

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

        holder.lblCategoryName.setText(categoryList.get(position).getCategoryName());

    }


    @Override
    public int getItemCount() {
        return categoryList.size();
    }


    public class CategoryViewHolder extends RecyclerView.ViewHolder {

        private TextView lblCategoryName;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);

            lblCategoryName = itemView.findViewById(R.id.lblCategoryName);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    goToFragmentProducts(v);

                }
            });

        }

        private void goToFragmentProducts(View view) {

            FragmentNavigationManager.goToFragmentCountry(view, Constants.HOME);

        }

    }


}
