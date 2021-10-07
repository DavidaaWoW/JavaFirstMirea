package ru.mirea.task14.Queue;

import java.util.PriorityQueue;

public class Queue {
    private java.util.Queue queue = new PriorityQueue();

    private void addToQueue(int number){
        queue.add(number);
    }

    private int removeFromQueue(){
        return (int)queue.remove();
    }

    private void outQueue(){
        while(!queue.isEmpty()){
            System.out.print(removeFromQueue());
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        int temp;
        System.out.println("Input: ");
        for(int a = 0; a<10; a++){
            temp = (int)(Math.random()*10);
            System.out.print(temp);
            queue.addToQueue(temp);
        }
        System.out.println();
        System.out.println("Output: ");
        queue.outQueue();
    }
}
