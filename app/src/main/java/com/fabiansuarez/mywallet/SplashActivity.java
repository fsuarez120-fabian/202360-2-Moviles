package com.fabiansuarez.mywallet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent myIntent = new Intent(SplashActivity.this, CategoryActivity.class);
                startActivity(myIntent);
                finish();

            }
        }, 5000);


    }
}