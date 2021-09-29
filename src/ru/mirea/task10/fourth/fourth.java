package ru.mirea.task10.fourth;

import java.util.Scanner;

public class fourth {
    private int k;
    private int s;
    private int start;
    private int result = 0;
    private int constant;
    private int currSum;
    private int temp;
    public fourth(int k, int s){
        this.k = k;
        this.s = s;
        start = (int) Math.pow(10,k-1);
        constant = start;
    }

    private int getSumm(){
        if(start == constant*10){
            return result;
        }
        currSum = 0;
        temp = start;
        while (temp>0){
            currSum += temp%10;
            temp /= 10;
            if(currSum>s){
                break;
            }
        }
        if(currSum == s){
            result++;
            System.out.println("Process: "+start);
        }
        start++;
        return getSumm();
    }


    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int s = in.nextInt();
        fourth summ = new fourth(k,s);
        System.out.println("Result: "+summ.getSumm());
    }

}
