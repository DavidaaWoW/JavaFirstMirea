package ru.mirea.task14.DoubleList;

import java.util.LinkedList;
import java.util.List;

public class DoubleList {
    List <Double> list = new LinkedList<Double>();

    private void addToList(double number){
        list.add(number);
    }

    private void removeFromList(int index){
        list.remove(index);
    }

    private void outList(){
        for(int a = 0; a<list.toArray().length; a++){
            System.out.print(list.toArray()[a]+ " ");
        }
    }

    public static void main(String[] args) {
        DoubleList list = new DoubleList();
        double temp;
        System.out.println("Input: ");
        for(int a = 0; a<10; a++){
            temp = (Math.random()*10);
            System.out.print(temp+" ");
            list.addToList(temp);
        }
        System.out.println();
        System.out.println("Output: ");
        list.outList();
    }
}
