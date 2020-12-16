package com.example.flashgoal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    LayoutInflater inflater;
    List<Club> clubs;

    public Adapter(Context ctx, List<Club> clubs){
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
        holder.clubTitle.setText(clubs.get(position).getName());
        Picasso.get().load(clubs.get(position).getImageURL()).into(holder.clubImage);
    }

    @Override
    public int getItemCount() {
        return clubs.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView clubTitle;
        ImageView clubImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            clubTitle = itemView.findViewById(R.id.clubTitle);
            clubImage = itemView.findViewById(R.id.clubImage);

        }
    }
}