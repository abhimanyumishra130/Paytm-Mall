package com.example.paytmmall;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.paytmmall.Cart_RecyclerView.CartAdapter;
import com.example.paytmmall.Product_Recycler.ProductOnClickListener;
import com.example.paytmmall.Product_Recycler.ProductRecyclerAdapter;
import com.example.paytmmall.Product_Recycler.ProductRecyclerModel;

import java.util.ArrayList;

public class MyOrdersActivity extends AppCompatActivity implements ProductOnClickListener {

    private RecyclerView recyclerView;
    private ImageView back;
    CartAdapter cartAdapter;

    public static ArrayList<ProductRecyclerModel> cartList = new ArrayList<>();
    private Button go_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_orders);
        recyclerView=findViewById(R.id.cartRecyclerView);
        back=findViewById(R.id.arrow);
        go_home=findViewById(R.id.orders_home);

        if(cartList.size()==0) {
            go_home.setVisibility(View.VISIBLE);
            go_home.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MyOrdersActivity.this, firstPage.class);
                    startActivity(intent);
                }
            });
        }else {

            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MyOrdersActivity.this,firstPage.class);
                    startActivity(intent);
                }
            });

            setRecyclerView();

        }
    }

    private void setRecyclerView() {
         cartAdapter = new CartAdapter(cartList,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(cartAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);
        cartAdapter.notifyDataSetChanged();
    }

    @Override
    public void productOnClick(ProductRecyclerModel productRecyclerModel, int position) {
        cartList.remove(position);
        cartAdapter.updateData(cartList);

    }
}