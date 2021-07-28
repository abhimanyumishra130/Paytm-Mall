package com.example.paytmmall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;

public class TransactionAddress extends AppCompatActivity {

    private Button goToPay;
    private ImageView ivBack;
    private EditText ivName,ivNumber,ivPin,ivHomeNo,ivLocality;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_address);
        initView();

        goToPay = findViewById(R.id.goToPay);
        ivBack = findViewById(R.id.ivBackArrow);

        goToPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isName() && isNumber() && isPinCode() && isHomeNo() && isLocality()) {
                    Intent intent = new Intent(TransactionAddress.this, ProceedToPayPage.class);
                    startActivity(intent);
                }
            }
        });
        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TransactionAddress.this, View_Devices.class);
                startActivity(intent);
            }
        });

    }

    private boolean isLocality() {

        if(ivLocality.getText().toString().length()!=0){
            return true;
        }else{
            ivLocality.setError("This section can not be empty");
        }
        return false;
    }

    private boolean isHomeNo() {
        if(ivHomeNo.getText().toString().length()!=0){
            return true;
        }else{
            ivHomeNo.setError("This section can not be empty");
        }
        return false;
    }

    private boolean isPinCode() {
        if(ivPin.getText().toString().length()==6){
            return true;
        }else{
            ivPin.setError("Enter valid pin code");
        }
        return false;

    }

    private boolean isNumber() {
        if(ivNumber.getText().toString().length()==10){
            return true;
        }else{
            ivNumber.setError("Enter valid number");
        }
        return false;
    }

    private boolean isName() {
        if(ivName.getText().toString().length()!=0){
            return true;
        }else{
            ivName.setError("Enter your name");
        }
        return false;
    }

    private void initView() {
        ivName=findViewById(R.id.IvName);
        ivNumber=findViewById(R.id.IvNumber);
        ivPin=findViewById(R.id.IvPincode);
        ivHomeNo=findViewById(R.id.IvHomeNo);
        ivLocality=findViewById(R.id.IvLocality);
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