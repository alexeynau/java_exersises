package ru.mirea.lab_3;

public class LabradorRetriever extends Dog{
    public LabradorRetriever(String name, int age, String gender) {
        super(name, age, gender, "Labrador Retriever");
    }

    @Override
    public void sitDown() {
        System.out.println(super.getName() + "was sitting and he is still sitting");
    }
}
