package ru.mirea.pr_3;

public class TestRectangle {
    public static void main(String[] args) {
        MovableRectangle rect = new MovableRectangle(1,2,-1,-2,10,5);

        System.out.println(rect);
        System.out.println("Points has same speed: " + rect.pointsHasSameSpeed());

        rect.moveDown();
        rect.moveLeft();
        System.out.println(rect);
    }
}
