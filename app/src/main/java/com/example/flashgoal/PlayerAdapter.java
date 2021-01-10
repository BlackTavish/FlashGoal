package com.example.flashgoal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PlayerAdapter extends RecyclerView.Adapter<PlayerAdapter.ViewHolder> {

    LayoutInflater inflater;
    ArrayList<Player> players;

    public PlayerAdapter(Context ctx, ArrayList<Player> players){
        this.inflater = LayoutInflater.from(ctx);
        this.players = players;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.custom_player_list,parent,false);
        return  new PlayerAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            holder.playerName.setText(players.get(position).getPlayerName());
            holder.pos.setText(players.get(position).getPos());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView playerName;
        TextView pos;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            playerName = itemView.findViewById(R.id.playerName);
            pos = itemView.findViewById(R.id.playerPos);
        }
    }
}
