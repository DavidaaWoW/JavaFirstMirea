package ru.mirea.task1;

import java.util.Arrays;

public class Sixth {
    private int[] arr;
    private int max;
    public Sixth(int length, int max){
        arr = new int[length];
        this.max = max;
    }
    public void createRandArr(){
        for(int a = 0; a<arr.length; a++){
            arr[a] = (int)(Math.random() * max);
        }
    }

    public int[] getArr() {
        return arr;
    }

    public int getMax() {
        return max;
    }

    public int getLength(){
        return arr.length;
    }

    @Override
    public String toString() {
        return "Sixth{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
