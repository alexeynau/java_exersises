package ru.mirea.lab_3;

public abstract class Dog {
    private String name;
    private int age;
    private String gender;
    private String breed;

    // Конструктор
    public Dog(String name, int age, String gender, String breed) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.breed = breed;
    }
    // Геттеры
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getBreed() {
        return breed;
    }

    // Абстрактный метод
    public abstract void sitDown();

    @Override
    public String toString() {
        return "Name: " + name + ", Breed: " + breed + "\nAge: " + age + ", Gender: " + gender + "\n";
    }
}
