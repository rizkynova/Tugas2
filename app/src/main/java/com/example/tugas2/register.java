package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().setTitle("Register");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_header);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        setContentView(R.layout.activity_register);
    }
}
