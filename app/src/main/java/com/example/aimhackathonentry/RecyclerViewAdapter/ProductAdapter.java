package com.example.aimhackathonentry.RecyclerViewAdapter;

import androidx.recyclerview.widget.RecyclerView;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {


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


    public class ProductViewHolder extends RecyclerView.ViewHolder {

        private TextView lblCategoryName;

        public ProductViewHolder(@NonNull View itemView) {
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
