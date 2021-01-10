package com.example.flashgoal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class PlayersAdapter extends RecyclerView.Adapter<PlayersAdapter.PlayerViewHolder>{
    ArrayList<Player> mPlayers = new ArrayList<>();

    public static class PlayerViewHolder extends RecyclerView.ViewHolder{
        public TextView playerName;
        public TextView playerPos;

        public PlayerViewHolder(@NonNull View itemView) {
            super(itemView);
            playerName = itemView.findViewById(R.id.playeNameTV);
            playerPos = itemView.findViewById(R.id.playerPosTV);
        }
    }

    public PlayersAdapter(ArrayList<Player> players){
        mPlayers = players;
    };

    @NonNull
    @Override
    public PlayerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.players_item, parent, false);
        PlayerViewHolder pvh = new PlayerViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(@NonNull PlayerViewHolder holder, int position) {
        Player currentPlayer = mPlayers.get(position);

        holder.playerName.setText(currentPlayer.getPlayerName());
        holder.playerPos.setText(currentPlayer.getPos());
    }

    @Override
    public int getItemCount() {
        return mPlayers.size();
    }
}