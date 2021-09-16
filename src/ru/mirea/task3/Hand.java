package ru.mirea.task3;

public class Hand {
    private int count;
    private double handWidth;
    private double handHeight;

    public Hand(int count, double handHeight, double handWidth){
        this.count = count;
        this.handHeight = handHeight;
        this.handWidth = handWidth;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "count=" + count +
                ", handWidth=" + handWidth +
                ", handHeight=" + handHeight +
                '}';
    }
}
