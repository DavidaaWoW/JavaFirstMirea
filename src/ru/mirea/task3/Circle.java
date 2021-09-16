package ru.mirea.task3;

public class Circle {
    private double radius;
    private static final double pi = 3.14;
    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public double getArea(){
        return pi*Math.pow(radius,2);
    }

    public double getLength(){
        return 2*pi*radius;
    }
}
