package ru.mirea.task5;

public abstract class Furniture {
    protected String name;
    protected float price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
