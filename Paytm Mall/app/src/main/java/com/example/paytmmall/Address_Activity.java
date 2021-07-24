package com.example.paytmmall;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Address_Activity extends AppCompatActivity {

    private CardView cvContinue;
    private ImageView ivBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);
        initView();
    }

    private void initView() {
        cvContinue = findViewById(R.id.cvContinue);
        ivBack = findViewById(R.id.ivBackAddress);
        cvContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Intent intent = new Intent(Address_Activity.this,);
              //  startActivity(intent);
            }
        });
        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent intent = new Intent(Address_Activity.this,View_Device.class);
                 startActivity(intent);
            }
        });
    }
}