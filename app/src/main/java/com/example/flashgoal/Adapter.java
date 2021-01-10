package com.example.flashgoal;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import static com.example.flashgoal.PremierLeague.EXTRA_URL;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    LayoutInflater inflater;
    ArrayList<Club> clubs;

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView clubTitle;
        ImageView clubImage;
        public LinearLayout parentLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            clubTitle = itemView.findViewById(R.id.clubTitle);
            clubImage = itemView.findViewById(R.id.clubImage);
            parentLayout = itemView.findViewById(R.id.parentLayout);

        }
    }

    public Adapter(Context ctx, ArrayList<Club> clubs){
        this.inflater = LayoutInflater.from(ctx);
        this.clubs = clubs;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.custom_list_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Club currentItem = clubs.get(position);
        holder.clubTitle.setText(clubs.get(position).getName());
        Picasso.get().load(clubs.get(position).getImageURL()).into(holder.clubImage);
        holder.parentLayout.setOnClickListener((view) ->{
            Intent intent = new Intent(view.getContext(), DetailActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.putExtra("EXTRA_URL", currentItem.getImageURL());
            intent.putExtra("EXTRA_DESC", currentItem.getDesc());
            intent.putExtra("EXTRA_COACH", currentItem.getCoach());
            intent.putExtra("EXTRA_PLAYERS", currentItem.getPlayers());

            for(Player player: currentItem.getPlayers()){
                System.out.println(player.getPlayerName() + " " + player.getPos());
            }


            view.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return clubs.size();
    }


}