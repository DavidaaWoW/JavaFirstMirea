package ru.mirea.task3;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(20.5);
        System.out.println(circle.toString());
        System.out.println(circle.getArea());
        System.out.println(circle.getLength());
    }
}
