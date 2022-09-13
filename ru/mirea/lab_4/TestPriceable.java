package ru.mirea.lab_4;

public class TestPriceable {
    public static void main(String[] args) {
        Book book = new Book(45,"No way");
        Car car = new Car(4500000, "RWhite");

        System.out.println("book price:" + book.getPrice());
        System.out.println("car price:" + car.getPrice());

        System.out.println(book);
        System.out.println(car);
    }



}
