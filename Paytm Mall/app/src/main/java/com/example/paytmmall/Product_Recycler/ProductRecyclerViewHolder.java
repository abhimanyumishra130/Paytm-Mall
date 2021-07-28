package com.example.paytmmall.Product_Recycler;

import android.graphics.Paint;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.paytmmall.R;

public class ProductRecyclerViewHolder extends RecyclerView.ViewHolder {

    private ProductOnClickListener productOnClickListener;
    private LinearLayout linearLayout;
    private ImageView img;
    private TextView ivProdName, ivProdAmount, ivProdAmountCut;

    public ProductRecyclerViewHolder(@NonNull View itemView, ProductOnClickListener productOnClickListener) {
        super(itemView);
        this.productOnClickListener = productOnClickListener;
        initView(itemView);

    }

    private void initView(View itemView) {
        img = itemView.findViewById(R.id.image);
        ivProdName = itemView.findViewById(R.id.title);
        ivProdAmount = itemView.findViewById(R.id.amountCut);
        ivProdAmountCut = itemView.findViewById(R.id.amount);
        linearLayout = itemView.findViewById(R.id.productViewItemLayout);
    }

    public void setData(ProductRecyclerModel productRecyclerModel) {
        img.setImageResource(productRecyclerModel.getImgId());
        ivProdName.setText(productRecyclerModel.getProdName());
        ivProdAmount.setText(productRecyclerModel.getAmount() + "");
        ivProdAmountCut.setText(productRecyclerModel.getAmountCut() + "");
        ivProdAmount.setPaintFlags(ivProdAmount.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                productOnClickListener.productOnClick(productRecyclerModel, getAdapterPosition());
            }
        });
    }
}
