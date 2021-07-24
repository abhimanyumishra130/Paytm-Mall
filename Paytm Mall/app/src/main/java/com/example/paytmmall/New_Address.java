package com.example.paytmmall;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.widget.EditText;

public class New_Address extends AppCompatActivity {
    private EditText etFullName,etMobileNumber,etPincode,etHouseNumber,etRoadArea;
    private CardView cvContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_address);
        initView();
    }

    private void initView() {
        etFullName = findViewById(R.id.etName);
        etMobileNumber = findViewById(R.id.etMobileNumber);
        etPincode = findViewById(R.id.etPincode);
        etHouseNumber = findViewById(R.id.etHouseNumber);
        etRoadArea = findViewById(R.id.etLocality);
        cvContinue = findViewById(R.id.cvContinueAddNew);
    }
}