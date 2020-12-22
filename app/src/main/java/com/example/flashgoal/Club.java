package com.example.flashgoal;

public class Club {
    private String name;
    private String imageURL;
    private String desc;

    public Club(){
    }

    public Club(String name , String imageURL, String desc){
        this.name = name;
        this.imageURL = imageURL;
        this.desc = desc;
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
}
