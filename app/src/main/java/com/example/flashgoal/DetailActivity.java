package com.example.flashgoal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import static com.example.flashgoal.PremierLeague.EXTRA_DESC;
import static com.example.flashgoal.PremierLeague.EXTRA_URL;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        String imageURL = intent.getStringExtra(EXTRA_URL);
        String desc = intent.getStringExtra(EXTRA_DESC);

        ImageView imageView = findViewById(R.id.img_logo);
        TextView textView = findViewById(R.id.description);


        Picasso.get().load(imageURL).fit().centerInside().into(imageView);
        textView.setText(desc);
    }
}