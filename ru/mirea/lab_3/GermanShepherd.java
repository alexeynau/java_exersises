package ru.mirea.lab_3;

public class GermanShepherd extends Dog{

    public GermanShepherd(String name, int age, String gender){
        super(name, age, gender, "German Shepherd");
    }

    @Override
    public void sitDown() {
        System.out.println(super.getName() + " is sitting now");
    }
}
