package ru.mirea.task1;

public class Fourth {
    public void printArgs(String[] args){
        System.out.println(args.length);
        for(int a = 0; a<args.length; a++){
            System.out.println("Argument "+a+": "+args[a]);
        }
    }
}
