package com.example.flashgoal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import static com.example.flashgoal.PremierLeague.EXTRA_COACH;
import static com.example.flashgoal.PremierLeague.EXTRA_DESC;
import static com.example.flashgoal.PremierLeague.EXTRA_URL;

public class DetailActivity extends AppCompatActivity {
    private Button playersButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
//        String imageURL = intent.getStringExtra(EXTRA_URL);
//        String desc = intent.getStringExtra(EXTRA_DESC);
//        String coach = intent.getStringExtra(EXTRA_COACH);

        String imageURL = intent.getExtras().getString("EXTRA_URL");
        String desc = intent.getExtras().getString("EXTRA_DESC");
        String coach = intent.getExtras().getString("EXTRA_COACH");
        ArrayList<Player> players = (ArrayList<Player>) intent.getSerializableExtra("EXTRA_PLAYERS");

        //System.out.println(players.size());

        ImageView imageView = findViewById(R.id.img_logo);
        TextView textView = findViewById(R.id.description);
        TextView textView1 = findViewById(R.id.clubCoach);


        Picasso.get().load(imageURL).into(imageView);
        textView.setText(desc);
        textView1.setText(coach);

        playersButton = findViewById(R.id.playersButton);

        playersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(DetailActivity.this, PlayersActivity.class);
                intent2.putExtra("EXTRA_PLAYERS", players);
                startActivity(intent2);
            }
        });


    }
}