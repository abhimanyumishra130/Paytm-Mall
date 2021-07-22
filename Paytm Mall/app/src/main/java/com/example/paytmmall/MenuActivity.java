package com.example.paytmmall;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

public class MenuActivity extends AppCompatActivity {


    private ImageButton trending,electronics;
    private ImageButton MyOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        initView();
        trending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferenceHelper.writeStringPreference(MenuActivity.this,"categories","Trending");
                ProdActivity prodActivity = new ProdActivity();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearLayout,prodActivity);
                transaction.commit();
            }
        });
        MyOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, MyOrdersActivity.class);
                startActivity(intent);
            }
        });
        electronics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferenceHelper.writeStringPreference(MenuActivity.this,"categories","Electronic");
                ProdActivity prodActivity = new ProdActivity();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearLayout,prodActivity);
                transaction.commit();
            }
        });
    }

    private void initView() {
        trending=findViewById(R.id.trending);
        MyOrder=findViewById(R.id.my_orders);
        electronics=findViewById(R.id.electronics);
    }
}