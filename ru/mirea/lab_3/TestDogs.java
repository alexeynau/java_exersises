package ru.mirea.lab_3;

public class TestDogs {
    public static void main(String[] args) {
        GermanShepherd dog1 = new GermanShepherd("Bill", 3, "Male");
        LabradorRetriever dog2 = new LabradorRetriever("Alyx", 1, "Female");
        Pug dog3 = new Pug("John", 2, "Male");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.sitDown();
        dog2.sitDown();
        dog3.sitDown();
    }



}
