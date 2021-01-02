package com.example.flashgoal;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class SerieA extends AppCompatActivity implements Adapter.OnItemClickListener{

    public static final String EXTRA_URL = "image_url";
    public static  final String EXTRA_DESC = "description";
    public static  final String EXTRA_COACH= "coach";

    RecyclerView recyclerView;
    List<Club> clubs;
    private static String JSON_URL = "http://10.0.2.2:3000/clubsSA";
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seriea);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = findViewById(R.id.clubsList);
        clubs = new ArrayList<>();
        extractClubs();
    }

    private void extractClubs(){
        RequestQueue queue = Volley.newRequestQueue(this);
        final JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, JSON_URL, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                for (int i = 0; i < response.length(); i++) {
                    try {
                        JSONObject clubsObject = response.getJSONObject(i);

                        Club club = new Club();
                        club.setName(clubsObject.getString("name").toString());
                        club.setImageURL(clubsObject.getString("image_url").toString());
                        club.setDesc(clubsObject.getString("description").toString());
                        club.setCoach(clubsObject.getString("coach").toString());

                        clubs.add(club);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                }

                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                adapter = new Adapter(getApplicationContext(),clubs);
                recyclerView.setAdapter(adapter);
                adapter.setOnItemClickListener(SerieA.this);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("tag", "onErrorResponse: "+ error.getMessage());
            }
        });

        queue.add(jsonArrayRequest);
    }

    @Override
    public void onItemClick(int position) {
        Intent detailIntent = new Intent(this,DetailActivity.class);
        Club clickedItem = clubs.get(position);

        detailIntent.putExtra(EXTRA_URL,clickedItem.getImageURL());
        detailIntent.putExtra(EXTRA_DESC,clickedItem.getDesc());
        detailIntent.putExtra(EXTRA_COACH,clickedItem.getCoach());

        startActivity(detailIntent);
    }
}
