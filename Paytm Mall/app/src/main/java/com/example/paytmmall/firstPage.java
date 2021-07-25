package com.example.paytmmall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.paytmmall.Product_Recycler.ProductRecyclerModel;

public class firstPage extends AppCompatActivity {

    protected ImageView fpIvMobile, fpIvAllCategories,ivMenu,ivCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
        initView();
    }

    private void initView() {
        fpIvMobile = findViewById(R.id.ivMobiles);
        fpIvAllCategories = findViewById(R.id.ivAllCategories);
        ivMenu=findViewById(R.id.ivMenu);
        ivCart=findViewById(R.id.ivCart);

        ivMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(firstPage.this,MenuActivity.class);
                startActivity(intent);
            }
        });
        fpIvMobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferenceHelper.writeStringPreference(firstPage.this,"prodName","Mobiles");
        Intent intent = new Intent(firstPage.this, ProductViewer_Activity.class);
        startActivity(intent);
            }
        });

        fpIvAllCategories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  Intent intent = new Intent(firstPage.this,MenuActivity.class);
        startActivity(intent);
            }
        });


        ivCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(firstPage.this,MyOrdersActivity.class);
                startActivity(intent);
            }
        });

    }
}