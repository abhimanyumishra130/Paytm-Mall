package com.example.paytmmall;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ProductActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<ProductModel> productModelList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        recyclerView=findViewById(R.id.prod_recyclerView);
        BuildListTrending();
        setRecyclerViewTrending();

    }

    private void setRecyclerViewTrending() {
        ProductAdapter adapter = new ProductAdapter(productModelList);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,3);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(gridLayoutManager);
    }

    private void BuildListTrending() {
        for(int i=0; i<10; i++){
            ProductModel prod = new ProductModel(R.drawable.electronics,"electronics");
            productModelList.add(prod);
        }
    }
}