package com.example.flashgoal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView logo_PL,logo_LL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo_PL = findViewById(R.id.PremierLeague);
        logo_PL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPremierLeague();
            }
        });

        logo_LL = findViewById(R.id.LaLiga);
        logo_LL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLaLiga();
            }
        });
    }
    public void openPremierLeague(){
        Intent intent = new Intent(this,PremierLeague.class);
        startActivity(intent);
    }
    public void openLaLiga(){
        Intent intent = new Intent(this,LaLiga.class);
        startActivity(intent);
    }
}