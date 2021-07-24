package com.example.paytmmall.Product_Recycler;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.paytmmall.R;

public class ProductRecyclerViewHolder extends RecyclerView.ViewHolder {
    private ImageView img;
    private TextView ivProdName,ivProdAmount,ivProdAmountCut;
    public ProductRecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);

    }

    private void initView(View itemView) {
        img = itemView.findViewById(R.id.image);
        ivProdName= itemView.findViewById(R.id.title);
        ivProdAmount=itemView.findViewById(R.id.amount);
        ivProdAmountCut=itemView.findViewById(R.id.amountCut);
    }

    public void setData(ProductRecyclerModel productRecyclerModel){
        img.setImageResource(productRecyclerModel.getImgId());
        ivProdName.setText(productRecyclerModel.getProdName());
        ivProdAmount.setText(productRecyclerModel.getAmount()+"");
        ivProdAmountCut.setText(productRecyclerModel.getAmountCut()+"");
    }
}
