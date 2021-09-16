package ru.mirea.task3;

public class Head {
    private String shape;
    private double headWidth;
    private double headHeight;
    public Head(String shape, double headHeight, double headWidth){
        this.shape = shape;
        this.headWidth = headWidth;
        this.headHeight = headHeight;
    }

    @Override
    public String toString() {
        return "Head{" +
                "shape='" + shape + '\'' +
                ", headWidth=" + headWidth +
                ", headHeight=" + headHeight +
                '}';
    }
}
