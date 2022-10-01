package ru.mirea.lab_2;

public class TestHuman {
    public static void main(String[] args) {
        Human human1 = new Human("Bill", 42, "Male");
        Human human2 = new Human("Helen", 21, "Female");


        human1.getLeftHand().bend();
        human1.getRightHand().bend();
        System.out.println(human1);
        human1.greet();
        human1.poseInfo();
        System.out.println();

        human2.getLeftLeg().bend();
        human2.getRightLeg().bend();
        System.out.println(human2);
        human2.greet();
        human2.poseInfo();
        System.out.println();

        human1.getLeftHand().unbend();
        human1.poseInfo();

    }
}
