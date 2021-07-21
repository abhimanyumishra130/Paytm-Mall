package com.example.paytmmall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

public class MenuActivity extends AppCompatActivity {


    private ImageButton img;
    private ImageButton MyOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        initView();
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, ProductActivity.class);
                startActivity(intent);
            }
        });
        MyOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, MyOrdersActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initView() {
        img=findViewById(R.id.trending);
        MyOrder=findViewById(R.id.my_orders);
    }
}