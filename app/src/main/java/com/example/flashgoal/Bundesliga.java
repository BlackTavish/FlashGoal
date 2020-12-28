package com.example.flashgoal;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Bundesliga extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundesliga);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
