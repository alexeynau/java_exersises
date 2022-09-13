package ru.mirea.lab_4;

public class Book implements Priceable {
    private int price;
    private String title;

    public Book(int price, String title) {
        this.price = price;
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "price=" + price +
                ", title=" + title +
                '}';
    }

    @Override
    public int getPrice() {
        return price;
    }
}
