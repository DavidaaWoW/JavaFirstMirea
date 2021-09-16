package ru.mirea.task3;

public class Human {
    private double weight;
    private double height;
    private int age;
    private Leg leg;
    private Hand hand;
    private Head head;
    public Human(double weight, double height, int age, Leg leg, Hand hand, Head head){
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.leg = leg;
        this.hand = hand;
        this.head = head;
    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Human{" +
                "weight=" + weight +
                ", height=" + height +
                ", age=" + age +
                ", leg=" + leg.toString() +
                ", hand=" + hand.toString() +
                ", head=" + head.toString() +
                '}';
    }
}
