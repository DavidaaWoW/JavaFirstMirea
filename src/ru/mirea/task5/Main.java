package ru.mirea.task5;

public class Main {
    public static void main(String[] args) {
        Dish fork = new Fork();
        System.out.println(fork.toString());
        Dish plate = new Plate();
        System.out.println(plate.toString());
        Dog bulldog = new Bulldog("Bobik", 5);
        System.out.println(bulldog.toString());
        Dog terrier = new Terrier("Sharik", 3);
        System.out.println(terrier.toString());
        Furniture chair = new Chair();
        System.out.println(chair.toString());
        Furniture bed = new Bed();
        System.out.println(bed.toString());
    }
}
