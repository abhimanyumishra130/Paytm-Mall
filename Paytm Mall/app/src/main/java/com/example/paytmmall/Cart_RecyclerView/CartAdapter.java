package com.example.paytmmall.Cart_RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.paytmmall.Product_Recycler.ProductOnClickListener;
import com.example.paytmmall.Product_Recycler.ProductRecyclerModel;
import com.example.paytmmall.R;

import java.util.ArrayList;

public class CartAdapter extends RecyclerView.Adapter<CartViewHolder> {

    private ArrayList<ProductRecyclerModel> cartListItem;
    private ProductOnClickListener productOnClickListener;

    public CartAdapter(ArrayList<ProductRecyclerModel> cartListItem, ProductOnClickListener productOnClickListener) {
        this.cartListItem = cartListItem;
        this.productOnClickListener = productOnClickListener;
    }

    @NonNull
    @Override
    public CartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_item_layout,parent,false);
        return new CartViewHolder(view,productOnClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull  CartViewHolder holder, int position) {

        ProductRecyclerModel productRecyclerModel = cartListItem.get(position);
        holder.setCartData(productRecyclerModel);

    }

    @Override
    public int getItemCount() {
        return cartListItem.size();
    }
}
