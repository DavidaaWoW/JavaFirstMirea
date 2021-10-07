package ru.mirea.task14.Alcoholic;

import java.util.*;

public class Alcoholic {
    private Queue first = new ArrayDeque();
    private Queue second = new ArrayDeque();

    public Alcoholic() {
        int temparr[] = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        int b;
        for (int a = 0; a < 5; a++) {
            while(true) {
                b = (int) (Math.random() * 10);
                if (check(temparr, b)) {
                    first.add(b);
                    break;
                }
            }
            while (true) {
                b = (int) (Math.random() * 10);
                if (check(temparr, b)) {
                    second.add(b);
                    break;
                }
            }
        }
    }

    private void play(){
        int counter = 0;
        int move1;
        int move2;
        while(true){

            move1 = (int)first.remove();
            move2 = (int)second.remove();
            if(move1 == 0){
                if(move2 == 9){
                    addCards(move1, move2, true);
                    counter++;
                    if(isEndGame())
                        break;
                    else
                        continue;
                }
            }
            if(move2 == 0){
                if(move1 == 9){
                    addCards(move1, move2, false);
                    counter++;
                    if (isEndGame())
                        break;
                    else
                        continue;
                }
            }
            if(move1 > move2){
                addCards(move1, move2, true);
            }
            else {
                addCards(move1, move2, false);
            }
            counter++;
            if (isEndGame())
                break;
            if (counter>106) {
                System.out.print("botva");
                return;
            }
        }
        if(first.isEmpty()){
            System.out.print("second"+counter);
        }else System.out.print("first"+counter);
    }

    private boolean isEndGame(){
        queuesOut();
        if (first.isEmpty()||second.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }

    private void addCards(int a, int b, boolean num){
        if(num){
            first.add(a);
            first.add(b);
        }
        else{
            second.add(a);
            second.add(b);
        }
    }

    private boolean check(int arr[], int num) {
        for (int a = 0; a < 10; a++) {
            if (arr[a] == num) {
                return false;
            }
        }
        for (int a = 0; ; a++) {
            if (arr[a] == -1) {
                arr[a] = num;
                return true;
            }
        }
    }

    private void queuesOut() {
        System.out.print("First: ");
        Iterator iterator = first.iterator();
        while (iterator.hasNext()) {
            int element = (int)iterator.next();
            System.out.print(element + " ");
        }
        System.out.println("");
        System.out.print("Second: ");
        iterator = second.iterator();
        while (iterator.hasNext()) {
            int element = (int) iterator.next();
            System.out.print(element + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Alcoholic start = new Alcoholic();
        start.queuesOut();
        System.out.println("--------------------");
        start.play();
    }
}