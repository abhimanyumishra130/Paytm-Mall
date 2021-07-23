package com.example.paytmmall;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;

public class firstPage extends AppCompatActivity {

    protected ImageView fpIvMobile, fpIvAllCategories, ivMenu, ivCart;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
        initView();
        slideView();

    }

    private void initView() {
        fpIvMobile = findViewById(R.id.ivMobiles);
        fpIvAllCategories = findViewById(R.id.ivAllCategories);
        ivMenu = findViewById(R.id.ivMenu);
        ivCart = findViewById(R.id.ivCart);

        ivMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(firstPage.this, MenuActivity.class);
                startActivity(intent);
            }
        });
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
                Intent intent = new Intent(firstPage.this, MenuActivity.class);
                startActivity(intent);
            }
        });


        ivCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(firstPage.this, MyOrdersActivity.class);
                startActivity(intent);
            }
        });

    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)


    private void slideView() {

        ArrayList<SliderData> sliderDataArrayList = new ArrayList<>();


        SliderView sliderView = findViewById(R.id.slider);

        sliderDataArrayList.add(new SliderData(R.drawable.first_offer_));
        sliderDataArrayList.add(new SliderData(R.drawable.third_offer_));
        sliderDataArrayList.add(new SliderData(R.drawable.fourth_offer_));
        sliderDataArrayList.add(new SliderData(R.drawable.fifth_offer_));
        sliderDataArrayList.add(new SliderData(R.drawable.second_offers_));

        SliderAdapter adapter = new SliderAdapter(this, sliderDataArrayList);
        sliderView.setAutoCycleDirection(SliderView.LAYOUT_DIRECTION_LTR);
        sliderView.setSliderAdapter(adapter);
        sliderView.setScrollTimeInSec(2);

        sliderView.setAutoCycle(true);
        sliderView.startAutoCycle();


    }

}