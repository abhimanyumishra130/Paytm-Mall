package com.example.paytmmall.Product_Recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.paytmmall.R;

import java.util.ArrayList;

public class OrderAdapter extends RecyclerView.Adapter<OrderViewHolder> {

    private ArrayList<ProductRecyclerModel> orderList;
    private ProductOnClickListener productOnClickListener;

    public OrderAdapter(ArrayList<ProductRecyclerModel> orderList,ProductOnClickListener productOnClickListener) {
        this.orderList = orderList;
        this.productOnClickListener=productOnClickListener;
    }

    @NonNull
    @Override
    public OrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.order_placed_item_layout,parent,false);
        return new OrderViewHolder(view,productOnClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull  OrderViewHolder holder, int position) {

        ProductRecyclerModel productRecyclerModel = orderList.get(position);
        holder.setOrderData(productRecyclerModel);

    }

    @Override
    public int getItemCount() {
        return orderList.size();
    }
}
