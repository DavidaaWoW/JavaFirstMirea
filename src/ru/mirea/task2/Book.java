package ru.mirea.task2;

public class Book {
    private int pageCount;
    private double readingSpeed;
    public Book(int pageCount, double readingSpeed){
        this.pageCount = pageCount;
        this.readingSpeed = readingSpeed;
    }

    public double getReadingSpeed() {
        return readingSpeed;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "pageCount=" + pageCount +
                ", readingSpeed=" + readingSpeed +
                '}';
    }

    public int getTimeCount(){
        double temp = pageCount;
        int result = 0;
        while(temp>0){
            temp = temp-readingSpeed;
            result++;
        }
        return result;
    }
}
