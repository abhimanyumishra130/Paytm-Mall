package com.example.paytmmall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.paytmmall.Product_Recycler.ProductRecyclerModel;

public class ProceedToPayPage extends AppCompatActivity {

    private TextView decrease, increase;
    private Button nextPage;
    private static TextView totalCount;
    int counter = 1;
    String val;


    private TextView name, ogPrice, cutPrice,totalPrice,mrp,sellingPrice;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proceed_to_pay_page);

        initView();
        setData();


        increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isGreaterthanOne()) {
                    decrease.setTextColor(Color.parseColor("#47C3F1"));
                } else {
                    decrease.setTextColor(Color.parseColor("#000000"));
                }

                counter++;
                val = Integer.toString(counter);
                totalCount.setText(val + "");
                int total = SharedPreferenceHelper.getIntegerPreference(ProceedToPayPage.this,"prodAmountCut");
                totalPrice.setText((total+19)*counter+"");
            }
        });


        decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isGreaterthanOne()) {
                    decrease.setTextColor(Color.parseColor("#47C3F1"));
                } else {
                    decrease.setTextColor(Color.parseColor("#000000"));
                }

                counter--;
                val = Integer.toString(counter);
                totalCount.setText(val + "");
                int total = SharedPreferenceHelper.getIntegerPreference(ProceedToPayPage.this,"prodAmountCut");
                totalPrice.setText((total+19)*counter+"");


            }
        });

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int img =SharedPreferenceHelper.getIntegerPreference(ProceedToPayPage.this,"prodImgId");
                String name = SharedPreferenceHelper.getStringPreference(ProceedToPayPage.this,"prodNameId");
                int amount =SharedPreferenceHelper.getIntegerPreference(ProceedToPayPage.this,"prodAmount");
                int amountCut = SharedPreferenceHelper.getIntegerPreference(ProceedToPayPage.this,"prodAmountCut");

                ProductRecyclerModel productRecyclerModel = new ProductRecyclerModel(img,name,amount,amountCut);
                PlacedOrders.orderList.add(productRecyclerModel);




                Intent intent = new Intent(ProceedToPayPage.this,SuccessfulPayment.class);
                startActivity(intent);
            }
        });

    }

    private void setData() {
        img.setImageResource(SharedPreferenceHelper.getIntegerPreference(ProceedToPayPage.this,"prodImgId"));
        name.setText(SharedPreferenceHelper.getStringPreference(ProceedToPayPage.this,"prodNameId"));
        ogPrice.setText(SharedPreferenceHelper.getIntegerPreference(ProceedToPayPage.this,"prodAmount")+"");
        cutPrice.setText(SharedPreferenceHelper.getIntegerPreference(ProceedToPayPage.this,"prodAmountCut")+"");
        int total = SharedPreferenceHelper.getIntegerPreference(ProceedToPayPage.this,"prodAmountCut");
        totalPrice.setText((total+19)*counter+"");



        mrp.setText(SharedPreferenceHelper.getIntegerPreference(ProceedToPayPage.this,"prodAmount")+"");
        sellingPrice.setText(SharedPreferenceHelper.getIntegerPreference(ProceedToPayPage.this,"prodAmountCut")+"");
    }

    private void initView() {

        img=findViewById(R.id.Image);
        name= findViewById(R.id.Title);
        ogPrice=findViewById(R.id.amountCut);
        ogPrice.setPaintFlags(ogPrice.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        cutPrice=findViewById(R.id.amount);
        totalPrice=findViewById(R.id.totalPrice);
        mrp=findViewById(R.id.MRP);
        sellingPrice=findViewById(R.id.sellingPrice);
        nextPage=findViewById(R.id.proceed_to_pay_button);

        decrease = findViewById(R.id.decrease);
        increase = findViewById(R.id.increase);
        totalCount = findViewById(R.id.count);
    }

    public static boolean isGreaterthanOne() {
        if (Integer.parseInt(totalCount.getText().toString()) > 0) {
            return true;
        }
        return false;
    }
}