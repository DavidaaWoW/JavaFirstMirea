package ru.mirea.task5;

public abstract class Dish {
    protected String name;
    protected double durability;
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDurability() {
        return durability;
    }

    public void setDurability(double durability) {
        this.durability = durability;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", durability=" + durability +
                '}';
    }
}
