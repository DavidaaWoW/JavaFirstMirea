package ru.mirea.task25;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        RedShapeDecorator redShapeDecorator = new RedShapeDecorator();
        redShapeDecorator.draw();
    }
}
