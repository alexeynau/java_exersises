package ru.mirea.lab_3;

public class Pug extends Dog{
    public Pug(String name, int age, String gender) {
        super(name, age, gender, "Pug");
    }

    @Override
    public void sitDown() {
        System.out.println(super.getName() + " is naughty, he is not sitting");
    }
}
