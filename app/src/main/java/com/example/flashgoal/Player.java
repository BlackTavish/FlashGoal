package com.example.flashgoal;

import java.io.Serializable;

public class Player implements Serializable {
    private String name;
    private String pos;

    public Player() {
    }

    public Player(String name, String pos) {
        this.name = name;
        this.pos = pos;
    }

    public String getPlayerName() {
        return name;
    }

    public String getPos() {
        return pos;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }
}
