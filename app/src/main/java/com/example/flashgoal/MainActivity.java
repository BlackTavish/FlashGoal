package com.example.flashgoal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView logo_PL,logo_LL,logo_L1,logo_SA,logo_BUN;


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

        logo_L1 = findViewById(R.id.Ligue1);
        logo_L1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLigue1();
            }
        });

        logo_SA = findViewById(R.id.SerieA);
        logo_SA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSerieA();
            }
        });

        logo_BUN = findViewById(R.id.Bundesliga);
        logo_BUN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBundesliga();
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

    public void openLigue1(){
        Intent intent = new Intent(this,Ligue.class);
        startActivity(intent);
    }

    public void openSerieA(){
        Intent intent = new Intent(this,SerieA.class);
        startActivity(intent);

    }
    public void openBundesliga(){
        Intent intent = new Intent(this,Bundesliga.class);
        startActivity(intent);
    }
}