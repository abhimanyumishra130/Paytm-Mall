package com.example.paytmmall.Cart_RecyclerView;

import android.graphics.Paint;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.paytmmall.Product_Recycler.ProductOnClickListener;
import com.example.paytmmall.Product_Recycler.ProductRecyclerModel;
import com.example.paytmmall.R;

public class CartViewHolder extends RecyclerView.ViewHolder {

    private ProductOnClickListener productOnClickListener;
    private Button remove;
    private ImageView img;
    private TextView ivProdName,ivProdAmount,ivProdAmountCut;
    public CartViewHolder(@NonNull View itemView,ProductOnClickListener productOnClickListener) {
        super(itemView);
        this.productOnClickListener=productOnClickListener;
        initView(itemView);
    }

    private void initView(View itemView) {
        img = itemView.findViewById(R.id.ItemImage);
        ivProdName= itemView.findViewById(R.id.ItemTitle);
        ivProdAmount=itemView.findViewById(R.id.Aamount);
        ivProdAmountCut=itemView.findViewById(R.id.AamountCut);
        remove=itemView.findViewById(R.id.RemoveItem);

    }
    public void setCartData(ProductRecyclerModel productRecyclerModel){
        img.setImageResource(productRecyclerModel.getImgId());
        ivProdName.setText(productRecyclerModel.getProdName());
        ivProdAmount.setText(productRecyclerModel.getAmount()+"");
        ivProdAmountCut.setText(productRecyclerModel.getAmountCut()+"");
        ivProdAmountCut.setPaintFlags(ivProdAmountCut.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                productOnClickListener.productOnClick(productRecyclerModel,getAdapterPosition());
            }
        });
    }



}
