package ru.mirea.task7;

public class SecondTest {
    public static void main(String[] args) {
        MovableCircle first = new MovableCircle(1, 1, 2, 1, 3);
        System.out.println(first.toString());
        first.moveRight();
        System.out.println(first.toString());
        first.moveUp();
        System.out.println(first.toString());
        first.moveLeft();
        System.out.println(first.toString());
    }
}
