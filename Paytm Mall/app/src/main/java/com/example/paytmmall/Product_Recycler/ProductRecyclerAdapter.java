package com.example.paytmmall.Product_Recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.paytmmall.R;

import java.util.ArrayList;

public class ProductRecyclerAdapter extends RecyclerView.Adapter<ProductRecyclerViewHolder> {
    ArrayList<ProductRecyclerModel> productList ;

    public ProductRecyclerAdapter(ArrayList<ProductRecyclerModel> productList) {
        this.productList = productList;
    }

    @NonNull
    @Override
    public ProductRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_view_layout,parent,false);
        return new ProductRecyclerViewHolder(view);
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
