package ru.mirea.task14.Deque;

import java.util.ArrayDeque;

public class Deque {
    private java.util.Deque deque = new ArrayDeque();

    private void addToDeque(int number){
        deque.add(number);
    }

    private int removeFromDeque(){
        return (int)deque.remove();
    }

    private void outDeque(){
        while (!deque.isEmpty()){
            System.out.print(removeFromDeque());
        }
    }

    public static void main(String[] args) {
        Deque deque = new Deque();
        int temp;
        System.out.println("Input: ");
        for(int a = 0; a<10; a++){
            temp = (int)(Math.random()*10);
            System.out.print(temp);
            deque.addToDeque(temp);
        }
        System.out.println();
        System.out.println("Output: ");
        deque.outDeque();
    }
}
