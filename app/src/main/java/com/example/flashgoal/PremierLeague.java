package com.example.flashgoal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PremierLeague extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_premier_league);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}