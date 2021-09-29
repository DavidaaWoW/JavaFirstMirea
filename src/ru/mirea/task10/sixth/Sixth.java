package ru.mirea.task10.sixth;

import java.util.Scanner;

public class Sixth {
    private int n;
    private int divider;

    private Sixth(int n){
        this.n = n;
        divider = 2;
    }

    private String isSimple(){
        if(divider == n){
            return "YES";
        }
        if(n%divider == 0){
            System.out.println("Divides by: " +divider);
            return "NO";
        }

        divider++;
        return isSimple();
    }
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Sixth simple = new Sixth(n);
        System.out.println(simple.isSimple());
    }
}
