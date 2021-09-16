package ru.mirea.task3;

public class Book {
    private String name;
    private String author;
    private int year;
    private int pageCount;
    public Book(String name, String author, int year, int pageCount){
        this.author = author;
        this.name = name;
        this.year = year;
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", pageCount=" + pageCount +
                '}';
    }
}
