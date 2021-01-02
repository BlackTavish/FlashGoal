package com.example.flashgoal;

public class Club {
    private String name;
    private String imageURL;
    private String desc;
    private String coach;

    public Club(){
    }

    public Club(String name , String imageURL, String desc,String coach){
        this.name = name;
        this.imageURL = imageURL;
        this.desc = desc;
        this.coach = coach;
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
}
