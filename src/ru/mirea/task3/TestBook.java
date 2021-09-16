package ru.mirea.task3;

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book("TestBook", "TestAuthor", 1000,1000);
        System.out.println(book.toString());
    }
}
