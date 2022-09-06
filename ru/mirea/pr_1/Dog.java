package ru.mirea.pr_1;

public class Dog {
    private String name;
    private int age;


    // Конструкторы
    public Dog(){
        name = "Puppy";
        age = 0;
    }

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Dog(String name){
        this.name = name;
        age = 0;
    }

    // Сеттеры
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    // Геттеры
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    // Прочие методы
    public String toString(){
        return "Name: " + name + "\nAge: " + age;
    }

    public void intoHumanAge(){
        System.out.println(name + "`s age in human years is " + age*7 + " years");
    }

    public void bark() { System.out.println(name + " says: \"woof!\""); }
}
