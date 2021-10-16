package com.example.paytmmall;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.paytmmall.Product_Recycler.OrderAdapter;
import com.example.paytmmall.Product_Recycler.ProductOnClickListener;
import com.example.paytmmall.Product_Recycler.ProductRecyclerModel;

import java.util.ArrayList;

public class PlacedOrders extends AppCompatActivity implements ProductOnClickListener {

    public static ArrayList<ProductRecyclerModel> orderList = new ArrayList<>();
    private Button go_Home;
    private TextView back;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placed_orders);

        go_Home = findViewById(R.id.orders_Home);
        back = findViewById(R.id.Arrow);
        recyclerView = findViewById(R.id.ordersRecyclerView);

        if (orderList.size() == 0) {
            go_Home.setVisibility(View.VISIBLE);
            go_Home.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PlacedOrders.this, firstPage.class);
                    startActivity(intent);
                }
            });
        } else {

            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PlacedOrders.this, firstPage.class);
                    startActivity(intent);
                }
            });

            setRecyclerView();

        }
    }

    private void setRecyclerView() {
        OrderAdapter orderAdapter = new OrderAdapter(orderList, this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(orderAdapter);

    }

    @Override
    public void productOnClick(ProductRecyclerModel productRecyclerModel, int position) {

    }
}