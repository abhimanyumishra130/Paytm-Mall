package com.example.paytmmall;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.paytmmall.Product_Recycler.ProductOnClickListener;
import com.example.paytmmall.Product_Recycler.ProductRecyclerAdapter;
import com.example.paytmmall.Product_Recycler.ProductRecyclerModel;

import java.util.ArrayList;

public class ProductViewer_Activity extends AppCompatActivity implements ProductOnClickListener {

    private TextView pageTitle;
    private ImageView back,toCart;

    private RecyclerView recyclerView;
    private ArrayList<ProductRecyclerModel> prodList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_viewer);
        initView();
        buildList();
        pageView();
        setRecyclerView();

        toCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductViewer_Activity.this,MyOrdersActivity.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductViewer_Activity.this,MenuActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initView() {
        toCart=findViewById(R.id.cart);
        recyclerView = findViewById(R.id.productView_recycler);
        pageTitle=findViewById(R.id.heading);
        back=findViewById(R.id.arrow);
    }

    private void pageView() {
        String str = SharedPreferenceHelper.getStringPreference(ProductViewer_Activity.this,"prodName");
        pageTitle.setText(str);

    }

    private void setRecyclerView() {
        ProductRecyclerAdapter adapter = new ProductRecyclerAdapter(prodList,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void buildList() {
        for(int i=0; i<20; i++){
            int prod = SharedPreferenceHelper.getIntegerPreference(ProductViewer_Activity.this,"prodImg");
            String str = SharedPreferenceHelper.getStringPreference(ProductViewer_Activity.this,"prodName");
            ProductRecyclerModel first = new ProductRecyclerModel(prod,str,8499,9999);
            prodList.add(first);
        }
    }

    @Override
    public void productOnClick(ProductRecyclerModel productRecyclerModel, int position) {
        String str = productRecyclerModel.getProdName()+"  "+position;
        SharedPreferenceHelper.writeIntegerPreference(ProductViewer_Activity.this,"prodImgId",productRecyclerModel.getImgId());
        SharedPreferenceHelper.writeStringPreference(ProductViewer_Activity.this,"prodNameId",productRecyclerModel.getProdName());
        SharedPreferenceHelper.writeIntegerPreference(ProductViewer_Activity.this,"prodAmount",productRecyclerModel.getAmount());
        SharedPreferenceHelper.writeIntegerPreference(ProductViewer_Activity.this,"prodAmountCut",productRecyclerModel.getAmountCut());
        Intent intent = new Intent(ProductViewer_Activity.this,View_Device.class);
        startActivity(intent);
    }
}