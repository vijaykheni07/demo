package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.shreyaspatil.EasyUpiPayment.EasyUpiPayment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EasyUpiPayment easyUpiPayment = new EasyUpiPayment.Builder()
                .with(this)
                .setPayeeVpa("shreyaspatil@upi")
                .setPayeeName("Shreyas Patil")
                .setTransactionId("20190603022401")
                .setTransactionRefId("0120192019060302240")
                .setDescription("For Today's Food")
                .setAmount("90.00")
                .build();
    }
}