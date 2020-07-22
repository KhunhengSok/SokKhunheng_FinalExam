package com.example.sokkhunheng.adapters;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.sokkhunheng.R;
import com.example.sokkhunheng.models.Product;

import java.util.zip.Inflater;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {
    private Product[] products ;

    public ProductAdapter(Product[] products) {
        this.products = products;

    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_view_holder, parent, false );
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Product product = products[position];
        holder.product_name.setText(product.getName());
        holder.description.setText(product.getDescription());
        holder.price.setText("$ " + Float.toString(product.getPrice()));
        holder.categoryName.setText(product.getCategoryName());
        Glide.with(holder.itemView).load(Uri.parse(product.getImageUrl())).into(holder.image);

    }

    @Override
    public int getItemCount() {
        return products.length;
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder {
        private ImageView image;
        private TextView product_name ;
        private TextView description ;
        private TextView price ;
        private TextView categoryName ;


        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.product_image);
            product_name  = itemView.findViewById(R.id.product_name);
            description  = itemView.findViewById(R.id.description);
            price  = itemView.findViewById(R.id.price);
            categoryName  = itemView.findViewById(R.id.categoryName);
        }
    }

}
