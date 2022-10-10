package ru.mirea.pr_3;

public class MovablePoint implements Movable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "x: " + x + " y: " + y + "\txSpeed: " + xSpeed + " ySpeed: " + ySpeed;
    }

    @Override
    public void moveDown() {
        y-=1;
    }

    @Override
    public void moveUp(){
        y+=1;
    }

    @Override
    public void moveLeft(){
        x-=1;
    }

    @Override
    public void moveRight(){
        x+=1;
    }
}
