package com.example.paytmmall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class TransactionAddress extends AppCompatActivity {

    private Button goToPay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_address);

        goToPay= findViewById(R.id.goToPay);

        goToPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TransactionAddress.this,ProceedToPayPage.class);
                startActivity(intent);
            }
        });
    }


    public void onRadioButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radio_button_home:
                if (checked)
                    break;
            case R.id.radio_button_Office:
                if (checked)
                    break;
        }

    }
}