package ru.mirea.lab_2;

public class Hand {
    private String status = "unbended";
    private String orientation;
    public Hand(String orientation){ this.orientation = orientation; }

    public void bend(){
        status = "bended";
    }
    public void unbend(){
        status = "unbended";
    }

    public String getStatus(){ return orientation + " hand is " + status; }


}
