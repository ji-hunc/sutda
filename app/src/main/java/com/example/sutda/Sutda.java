package com.example.sutda;

public class Sutda {
    // field
    private String month;
    private int score;


    // instructor
    public Sutda(String month, int score) {
        this.month = month;
        this.score = score;
    }


    // method
    public String getMonth() {
        return month;
    }
    public int getScore() {
        return score;
    }
}
