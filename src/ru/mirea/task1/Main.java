package ru.mirea.task1;

public class Main {
    public static void main(String[] args) {
        Sixth arr = new Sixth(10,100);
        arr.createRandArr();
        System.out.println(arr.toString());


        Third arr2 = new Third(arr.getLength(), arr.getArr());
        System.out.println(arr2.getSumm());


        Fourth printArgs = new Fourth();
        printArgs.printArgs(args);

        Fifth fifth = new Fifth();
        fifth.printNumber(10);

        Seventh seventh = new Seventh();
        System.out.println(seventh.getFactorial(5));

    }
}
