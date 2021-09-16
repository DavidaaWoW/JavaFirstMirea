package ru.mirea.task1;

public class Third {
    private int[] arr;
    public Third(int length, int[] array){
        this.arr = new int[length];
        this.arr = array;
    }

    public int getSumm(){
        int result = 0;
        for(int a = 0; a<arr.length; a++){
            result+=arr[a];
        }
        return result;
    }
}
