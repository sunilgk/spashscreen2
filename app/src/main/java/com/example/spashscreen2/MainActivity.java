package com.example.spashscreen2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Toast.makeText(MainActivity.this, "otp: "+jsonObject.getString("otp"), Toast.LENGTH_SHORT).show();
        
    }
}
