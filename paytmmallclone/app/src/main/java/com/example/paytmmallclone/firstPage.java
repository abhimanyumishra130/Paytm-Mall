package com.example.paytmmallclone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class firstPage extends AppCompatActivity {

    protected ImageView fpIvMobile, fpIvAllCategories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
        initView();
    }

    private void initView() {
        fpIvMobile = findViewById(R.id.ivMobiles);
        fpIvAllCategories = findViewById(R.id.ivAllCategories);
        fpIvMobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
      /*  Intent intent = new Intent(firstPage.this, );
        startActivity(intent);*/
            }
        });

        fpIvAllCategories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 /*  Intent intent = new Intent(firstPage.this, );
        startActivity(intent);*/
            }
        });

    }
}