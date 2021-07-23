package com.example.paytmmall;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MenuActivity extends AppCompatActivity {


    private ImageView trending, electronics, men_fashion, women_fashion, mobile_devices, home_kitchen, appliance, grocery, toys_kids;
    private ImageButton cancel;
    private ImageView myOrders;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        initView();
        SharedPreferenceHelper.writeStringPreference(MenuActivity.this, "categories", "Trending");
        ProdActivity prodActivity = new ProdActivity();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.linearLayout, prodActivity);
        transaction.commit();

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, firstPage.class);
                startActivity(intent);
            }
        });

        trending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferenceHelper.writeStringPreference(MenuActivity.this, "categories", "Trending");
                ProdActivity prodActivity = new ProdActivity();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearLayout, prodActivity);
                transaction.commit();
            }
        });

        electronics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferenceHelper.writeStringPreference(MenuActivity.this, "categories", "Electronic");
                ProdActivity prodActivity = new ProdActivity();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearLayout, prodActivity);
                transaction.commit();
            }
        });
        men_fashion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferenceHelper.writeStringPreference(MenuActivity.this, "categories", "Men Fashion");
                ProdActivity prodActivity = new ProdActivity();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearLayout, prodActivity);
                transaction.commit();
            }
        });
        women_fashion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferenceHelper.writeStringPreference(MenuActivity.this, "categories", "Women Fashion");
                ProdActivity prodActivity = new ProdActivity();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearLayout, prodActivity);
                transaction.commit();
            }
        });
        mobile_devices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferenceHelper.writeStringPreference(MenuActivity.this, "categories", "Mobile Accessories");
                ProdActivity prodActivity = new ProdActivity();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearLayout, prodActivity);
                transaction.commit();
            }
        });
        home_kitchen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferenceHelper.writeStringPreference(MenuActivity.this, "categories", "Home kitchen");
                ProdActivity prodActivity = new ProdActivity();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearLayout, prodActivity);
                transaction.commit();
            }
        });
        appliance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferenceHelper.writeStringPreference(MenuActivity.this, "categories", "Appliance");
                ProdActivity prodActivity = new ProdActivity();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearLayout, prodActivity);
                transaction.commit();
            }
        });
        grocery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferenceHelper.writeStringPreference(MenuActivity.this, "categories", "Grocery");
                ProdActivity prodActivity = new ProdActivity();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearLayout, prodActivity);
                transaction.commit();
            }
        });
        toys_kids.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferenceHelper.writeStringPreference(MenuActivity.this, "categories", "Toys Kids");
                ProdActivity prodActivity = new ProdActivity();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearLayout, prodActivity);
                transaction.commit();
            }
        });


        myOrders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, MyOrdersActivity.class);
                startActivity(intent);
            }
        });

    }

    private void initView() {
        cancel = findViewById(R.id.cancel);
        myOrders = findViewById(R.id.my_orders);

        trending = findViewById(R.id.trending);
        electronics = findViewById(R.id.electronics);
        men_fashion = findViewById(R.id.mens_fashion);
        women_fashion = findViewById(R.id.women_fashion);
        mobile_devices = findViewById(R.id.mobile);
        home_kitchen = findViewById(R.id.kitchen);
        appliance = findViewById(R.id.appliance);
        grocery = findViewById(R.id.grocery);
        toys_kids = findViewById(R.id.toys);
    }
}