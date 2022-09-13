package ru.mirea.lab_4;

public class Car implements Priceable {
    private int price;
    private String brand;

    public Car(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", brand=" + brand +
                '}';
    }

    @Override
    public int getPrice() {
        return price;
    }
}
