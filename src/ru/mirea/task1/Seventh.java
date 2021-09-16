package ru.mirea.task1;

public class Seventh {
    public int getFactorial(int number){
        int result = 1;
        for( ; number>1; number--){
            result*=number;
        }
        return result;
    }
}
