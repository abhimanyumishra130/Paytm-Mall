package com.example.paytmmall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class View_Device extends AppCompatActivity {
    private TextView tvBuyNow, tvAddToCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_device);
        initView();
    }

    private void initView() {
        tvBuyNow = findViewById(R.id.BuyNow);
        tvAddToCart = findViewById(R.id.AddCart);
        tvBuyNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(View_Device.this,Address_Activity.class);
                startActivity(intent);
            }
        });
    }
}