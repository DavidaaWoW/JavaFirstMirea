package ru.mirea.task6;

public class Butter implements Priceable{
    private double price;
    public Butter(double price){
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
