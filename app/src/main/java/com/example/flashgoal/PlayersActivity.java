package com.example.flashgoal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class PlayersActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Player> players;
    PlayerAdapter playerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = findViewById(R.id.playersList);
        players = new ArrayList<>();



        extractPlayers();
    }

    private void extractPlayers(){

    }
}