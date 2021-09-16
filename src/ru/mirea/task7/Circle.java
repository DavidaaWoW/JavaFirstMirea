package ru.mirea.task7;

public class Circle extends Shape{
    protected double radius;

    public Circle(){
        radius = 0.0;
        color = "black";
        filled = false;
    }

    public Circle(double radius){
        this.radius = radius;
        color = "black";
        filled = false;
    }

    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}

