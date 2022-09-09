package ru.mirea.lab_2;

public class Leg {
    private String status = "unbended";
    private String orientation;
    public Leg(String orientation){ this.orientation = orientation; }

    public void bend(){
        status = "bended";
    }
    public void unbend(){
        status = "unbended";
    }

    public String getStatus(){ return orientation + " leg is " + status; }
}
