package ru.mirea.task1;

import java.util.Formatter;

public class Fifth {
    public void printNumber(int count){
        Formatter formatter = new Formatter();
        formatter.format("Первые " + count + " чисел гармоничного ряда%n");
        for(int a = 0; a<count; a++){
            formatter.format("%.2f%n", 1./(a+1));
        }
        System.out.println(formatter);
    }
}
