package ru.mirea.task10.fifth;

import java.util.Scanner;

public class Fifth {

    private int N;
    private int summ;

    public Fifth(int N){
        this.N = N;
        summ = 0;
    }

    private int getSumm(){
        if(N<1){
            return summ;
        }
        summ += N%10;
        N /= 10;
        return getSumm();
    }

    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        Fifth summ = new Fifth(N);
        System.out.println(summ.getSumm());
    }
}
