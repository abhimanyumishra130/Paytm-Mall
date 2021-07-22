package com.example.paytmmall;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductViewHolder extends RecyclerView.ViewHolder {


    private ImageView img;
    private TextView name;
    private OnClickListener onClickListener;

    public ProductViewHolder(@NonNull  View itemView, OnClickListener onClickListener) {
        super(itemView);
        this.onClickListener=onClickListener;
        initView(itemView);
    }

    private void initView(View itemView) {
        img=itemView.findViewById(R.id.image_product);
        name=itemView.findViewById(R.id.text_product);
    }
    public  void SetData(ProductModel productModel){
        img.setImageResource(productModel.getImg());
        name.setText(productModel.getText());
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickListener.onClick(productModel,getAdapterPosition());
            }
        });
    }
}
