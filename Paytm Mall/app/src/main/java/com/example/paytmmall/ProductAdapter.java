package com.example.paytmmall;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductViewHolder> {

    private ArrayList<ProductModel> prod_list;
    private OnClickListener onClickListener;

    public ProductAdapter(ArrayList<ProductModel> prod_list, OnClickListener onClickListener) {
        this.prod_list = prod_list;
        this.onClickListener = onClickListener;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_categories, parent, false);
        return new ProductViewHolder(view, onClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        ProductModel productModel = prod_list.get(position);
        holder.SetData(productModel);

    }

    @Override
    public int getItemCount() {
        return prod_list.size();
    }
}
