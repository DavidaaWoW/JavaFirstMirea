package ru.mirea.task7;

public class Square extends Rectangle{
    public Square(){
        width = 0.0;
        length = 0.0;
        color = "black";
        filled = false;
    }

    public Square(double side){
        width = side;
        length = side;
        color = "black";
        filled = false;
    }

    public Square(double side, String color, boolean filled){
        width = side;
        length = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return this.length;
    }

    public void setSide(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + width +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
