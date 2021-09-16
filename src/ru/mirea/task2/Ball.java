package ru.mirea.task2;

public class Ball {
    private double height;
    private double elasticity;
    public Ball(double height, double elasticity){
        this.elasticity = elasticity;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getElasticity() {
        return elasticity;
    }

    public int getJumps(){
        int result = 0;
        float multiplier = 1;
        while(height > 1){
            height = height / (multiplier / elasticity);
            multiplier+=0.1;
            result++;
        }
        return result;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "height=" + height +
                ", elasticity=" + elasticity +
                '}';
    }
}
