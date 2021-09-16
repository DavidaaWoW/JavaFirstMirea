package ru.mirea.task2;

public class Shape {
    private double width;
    private double height;
    public Shape(double width, double height){
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getPerimeter(){
        return 2*width+2*height;
    }

    public double getArea(){
        return width*height;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
