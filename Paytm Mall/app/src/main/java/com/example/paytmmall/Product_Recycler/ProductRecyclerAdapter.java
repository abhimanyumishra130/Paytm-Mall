package com.example.paytmmall.Product_Recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.paytmmall.R;

import java.util.ArrayList;

public class ProductRecyclerAdapter extends RecyclerView.Adapter<ProductRecyclerViewHolder> {

    private ProductOnClickListener productOnClickListener;
    ArrayList<ProductRecyclerModel> productList;

    public ProductRecyclerAdapter(ArrayList<ProductRecyclerModel> productList, ProductOnClickListener productOnClickListener) {
        this.productList = productList;
        this.productOnClickListener = productOnClickListener;
    }

    @NonNull
    @Override
    public ProductRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_view_layout, parent, false);
        return new ProductRecyclerViewHolder(view, productOnClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductRecyclerViewHolder holder, int position) {
        ProductRecyclerModel productRecyclerModel = productList.get(position);
        holder.setData(productRecyclerModel);

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }
}
