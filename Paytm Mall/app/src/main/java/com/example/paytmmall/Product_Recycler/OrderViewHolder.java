package com.example.paytmmall.Product_Recycler;

import android.graphics.Paint;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.paytmmall.R;

public class OrderViewHolder extends RecyclerView.ViewHolder {

    private ProductOnClickListener productOnClickListener;
    private LinearLayout linearLayout;
    private ImageView img;
    private TextView ivProdName,ivProdAmount,ivProdAmountCut;

    public OrderViewHolder(@NonNull View itemView,ProductOnClickListener productOnClickListener) {
        super(itemView);
        this.productOnClickListener=productOnClickListener;
        initView(itemView);
    }


    private void initView(View itemView) {
        img = itemView.findViewById(R.id.itemImage);
        ivProdName= itemView.findViewById(R.id.itemTitle);
        ivProdAmount=itemView.findViewById(R.id.aamount);
        ivProdAmountCut=itemView.findViewById(R.id.aamountCut);
        linearLayout=itemView.findViewById(R.id.ProductViewItemLayout);
    }

    public void setOrderData(ProductRecyclerModel productRecyclerModel){
        img.setImageResource(productRecyclerModel.getImgId());
        ivProdName.setText(productRecyclerModel.getProdName());
        ivProdAmount.setText(productRecyclerModel.getAmount()+"");
        ivProdAmountCut.setText(productRecyclerModel.getAmountCut()+"");
        ivProdAmountCut.setPaintFlags(ivProdAmountCut.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                productOnClickListener.productOnClick(productRecyclerModel,getAdapterPosition());
            }
        });
    }
}
