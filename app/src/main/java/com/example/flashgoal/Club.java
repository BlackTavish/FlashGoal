package com.example.flashgoal;

import java.util.ArrayList;

public class Club {
    private String name;
    private String imageURL;
    private String desc;
    private String coach;
    private ArrayList<Player> players;

    public Club(){
    }

    public Club(String name , String imageURL, String desc,String coach, ArrayList<Player> players){
        this.name = name;
        this.imageURL = imageURL;
        this.desc = desc;
        this.coach = coach;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getDesc(){
        return desc;
    }

    public void setDesc(String desc){
        this.desc = desc;
    }

    public String getCoach(){
        return coach;
    }

    public void setCoach(String coach){
        this.coach = coach;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
}
