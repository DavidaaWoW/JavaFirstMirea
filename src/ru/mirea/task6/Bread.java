package ru.mirea.task6;

public class Bread implements Priceable{
    private double price;
    public Bread(double price){
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
