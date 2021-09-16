package ru.mirea.task7;

public class Rectangle extends Shape{
    protected double width;
    protected double length;
    public Rectangle(){
        color = "black";
        filled = false;
        width = 0.0;
        length = 0.0;
    }

    public Rectangle(double width, double length){
        color = "black";
        filled = false;
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        this.color = color;
        this.filled = filled;
        this.length = length;
        this.width = width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return 2*width+2*length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
