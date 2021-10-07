package ru.mirea.task14.Stack;

public class Stack {
    java.util.Stack st = new java.util.Stack();

    private void addToStack(int number){
        st.push(number);
    }

    private int removeFromStack(){
        return (int)st.pop();
    }

    private void stackOut(){
        while(!st.isEmpty()){
            System.out.print(removeFromStack());
        }
    }

    public static void main(String[] args){
        int temp;
        Stack st = new Stack();
        System.out.println("Input: ");
        for(int a = 0; a<10; a++){
            temp = (int)(Math.random()*10);
            System.out.print(temp);
            st.addToStack(temp);
        }
        System.out.println();
        System.out.println("Output: ");
        st.stackOut();
    }
}
