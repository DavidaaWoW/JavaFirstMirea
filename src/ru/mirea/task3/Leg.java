package ru.mirea.task3;

public class Leg{
    private int count;
    public double legHeight;
    public double legWidth;

    public Leg(int count, double legHeight, double legWidth){
        this.count = count;
        this.legHeight = legHeight;
        this.legWidth = legWidth;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "count=" + count +
                ", legHeight=" + legHeight +
                ", legWidth=" + legWidth +
                '}';
    }
}
