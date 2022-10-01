package ru.mirea.pr_1;

public class TestDog {
    public static void main(String[] args){
        Dog d1 = new Dog();
        Dog d2 = new Dog("Bill", 6);
        Dog d3 = new Dog("Genzel");

        d1.setName("Saira");
        d1.setAge(3);
        d3.setAge(2);
        System.out.println(d1);

        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();

        d2.bark();
    }

}
