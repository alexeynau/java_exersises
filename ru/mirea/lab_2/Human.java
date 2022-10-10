package ru.mirea.lab_2;

public class Human {
    private String name;
    private int age;
    private String gender;
    private Head head = new Head();
    private Hand leftHand = new Hand("left");
    private Hand rightHand = new Hand("right");
    private Leg leftLeg = new Leg("left");
    private Leg rightLeg = new Leg("right");

    // Конструктор
    public Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public Hand getLeftHand() {
        return leftHand;
    }

    public Hand getRightHand() {
        return rightHand;
    }

    public Leg getLeftLeg() {
        return leftLeg;
    }

    public Leg getRightLeg() {
        return rightLeg;
    }

    // Прочие методы
    public void greet() {
        head.say("Hello!");
    }

    public void poseInfo() {
        System.out.println(name + "`s pose:");
        System.out.println(leftHand.getStatus());
        System.out.println(rightHand.getStatus());
        System.out.println(leftLeg.getStatus());
        System.out.println(rightLeg.getStatus());
    }

    public String toString() {
        return "Name: " + name + "\tAge: " + age + "\tGender: " + gender;
    }
}
