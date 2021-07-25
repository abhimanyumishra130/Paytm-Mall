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
        String str = SharedPreferenceHelper.getStringPreference(ProductViewer_Activity.this,"prodName");
        if(str.equals("Mobiles")){
            for(int i=0; i<2; i++) {
                ProductRecyclerModel mob1 = new ProductRecyclerModel(R.drawable.mob1, "real me 6 Pro", 12000, 10000);
                prodList.add(mob1);

                ProductRecyclerModel mob2 = new ProductRecyclerModel(R.drawable.mob2, "real me 5 Pro", 11000, 9000);
                prodList.add(mob2);

                ProductRecyclerModel mob3 = new ProductRecyclerModel(R.drawable.mob3, "real me 6 ", 11000, 10000);
                prodList.add(mob3);

                ProductRecyclerModel mob4 = new ProductRecyclerModel(R.drawable.mob4, "real me 5 ", 10000, 8000);
                prodList.add(mob4);

                ProductRecyclerModel mob5 = new ProductRecyclerModel(R.drawable.mob5, "redmi 6 Pro", 14000, 13000);
                prodList.add(mob5);

                ProductRecyclerModel mob6 = new ProductRecyclerModel(R.drawable.mob6, "redmi me 6 ", 12000, 11000);
                prodList.add(mob6);

                ProductRecyclerModel mob7 = new ProductRecyclerModel(R.drawable.mob7, "samsung galaxy note 6 Pro", 20000, 18000);
                prodList.add(mob7);

                ProductRecyclerModel mob8 = new ProductRecyclerModel(R.drawable.mob8, "samsung galaxy note 6", 18000, 17000);
                prodList.add(mob8);

                ProductRecyclerModel mob9 = new ProductRecyclerModel(R.drawable.mob9, "vivo v5 11", 18000, 15000);
                prodList.add(mob9);

                ProductRecyclerModel mob10 = new ProductRecyclerModel(R.drawable.mob10, "real me 7 Pro", 18000, 15500);
                prodList.add(mob10);
            }
        }else if(str.equals("Tablets")){
            for(int i=0; i<2; i++) {
                ProductRecyclerModel tablet1 = new ProductRecyclerModel(R.drawable.tab1, "lenovo yoga smart Tablet with The google assistant", 35000, 21500);
                prodList.add(tablet1);

                ProductRecyclerModel tablet2 = new ProductRecyclerModel(R.drawable.tab2, "Samsung galaxy Tab A7 3GB RAM 64GB ROM", 21000, 18000);
                prodList.add(tablet2);

                ProductRecyclerModel tablet3 = new ProductRecyclerModel(R.drawable.tab3, "I KALL N14 4G Single Sim Calling Tablet with Android 9.0 Pie", 8999, 6999);
                prodList.add(tablet3);

                ProductRecyclerModel tablet5 = new ProductRecyclerModel(R.drawable.tab5, "Apple iPad pro 2020", 116900, 107000);
                prodList.add(tablet5);

                ProductRecyclerModel tablet4 = new ProductRecyclerModel(R.drawable.tab5, "I KALL N14 4G Single Sim Calling Tablet", 8000, 7500);
                prodList.add(tablet4);

                ProductRecyclerModel tablet6 = new ProductRecyclerModel(R.drawable.tab6, "yoga series 272864 8GB RAM", 18000, 15500);
                prodList.add(tablet6);

                ProductRecyclerModel tablet7 = new ProductRecyclerModel(R.drawable.tab7, "lenovo G3 v5 8GB RAM 64GB ROM", 45000, 35500);
                prodList.add(tablet7);

                ProductRecyclerModel tablet8 = new ProductRecyclerModel(R.drawable.tab2, "Amazon BO7FQ4Q7mb All New Kindle", 29000, 25500);
                prodList.add(tablet8);

                ProductRecyclerModel tablet9 = new ProductRecyclerModel(R.drawable.tab9, "iBall Slide Cleo", 34000, 26500);
                prodList.add(tablet9);

                ProductRecyclerModel tablet10 = new ProductRecyclerModel(R.drawable.tab10, "Lenovo M10 FHD Plus", 25000, 20000);
                prodList.add(tablet10);
            }
        }else if(str.equals("Portable Speakers")){
            for(int i=0; i<3; i++) {
                ProductRecyclerModel speakers1 = new ProductRecyclerModel(R.drawable.speaker1, "Zebronic Zee Count 764 Wires Bluetooth", 5000, 3000);
                prodList.add(speakers1);

                ProductRecyclerModel speakers2 = new ProductRecyclerModel(R.drawable.speaker2, "BOAT stone 645 bluetooth portable", 5000, 3000);
                prodList.add(speakers2);

                ProductRecyclerModel speakers3 = new ProductRecyclerModel(R.drawable.speaker10, "Pickada S106W54  764 Wires Bluetooth", 5000, 3000);
                prodList.add(speakers3);

                ProductRecyclerModel speakers4 = new ProductRecyclerModel(R.drawable.speaker3, "ARYAN LOGISTIC GT-5 Bluetooth ", 5000, 3000);
                prodList.add(speakers4);

                ProductRecyclerModel speakers5 = new ProductRecyclerModel(R.drawable.speaker4, "I Kall hf65 Bluetooth", 5000, 3000);
                prodList.add(speakers5);

                ProductRecyclerModel speakers6 = new ProductRecyclerModel(R.drawable.speaker5, "Portinics sound quality Wireless Bluetooth", 5000, 3000);
                prodList.add(speakers6);

                ProductRecyclerModel speakers7 = new ProductRecyclerModel(R.drawable.speaker6, "Zebronic Zee Count 764 Wires Bluetooth", 5000, 3000);
                prodList.add(speakers7);

                ProductRecyclerModel speakers8 = new ProductRecyclerModel(R.drawable.speaker7, "ARYAN LOGISTIC GT-5 Bluetooth", 5000, 3000);
                prodList.add(speakers8);

                ProductRecyclerModel speakers9 = new ProductRecyclerModel(R.drawable.speaker8, "I Kall hf65 Bluetooth", 5000, 3000);
                prodList.add(speakers9);

                ProductRecyclerModel speakers10 = new ProductRecyclerModel(R.drawable.speaker9, "Portinics sound quality Wireless Bluetooth", 5000, 3000);
                prodList.add(speakers10);
            }
        }else{
            for(int i=0;i<20;i++) {
                ProductRecyclerModel product = new ProductRecyclerModel(SharedPreferenceHelper.getIntegerPreference(ProductViewer_Activity.this, "prodImg"), str, 5000, 3000);
                prodList.add(product);
            }
        }
    }

    @Override
    public void productOnClick(ProductRecyclerModel productRecyclerModel, int position) {
        String str = productRecyclerModel.getProdName()+"  "+position;
        SharedPreferenceHelper.writeIntegerPreference(ProductViewer_Activity.this,"prodImgId",productRecyclerModel.getImgId());
        SharedPreferenceHelper.writeStringPreference(ProductViewer_Activity.this,"prodNameId",productRecyclerModel.getProdName());
        SharedPreferenceHelper.writeIntegerPreference(ProductViewer_Activity.this,"prodAmount",productRecyclerModel.getAmount());
        SharedPreferenceHelper.writeIntegerPreference(ProductViewer_Activity.this,"prodAmountCut",productRecyclerModel.getAmountCut());
        Intent intent = new Intent(ProductViewer_Activity.this,View_Devices.class);
        startActivity(intent);
    }
}