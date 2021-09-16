package ru.mirea.task6;

public class PriceableTest {
    public static void main(String[] args) {
        Priceable obj;
        obj = new Bread(2.5);
        System.out.println(obj.getPrice());
        obj = new Butter(5.3);
        System.out.println(obj.getPrice());
    }
}
