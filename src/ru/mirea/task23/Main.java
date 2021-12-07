package ru.mirea.task23;

import java.util.Objects;

public class Main {
    private int width;
    private int height;
    private int uniqueID;
    public Main(int width, int height, int uniqueID){
        this.height = height;
        this.width = width;
        this.uniqueID = uniqueID;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getUniqueID() {
        return uniqueID;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setUniqueID(int uniqueID) {
        this.uniqueID = uniqueID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Main main = (Main) o;
        return uniqueID == main.uniqueID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(uniqueID);
    }

    public static void main(String[] args) {
        Main obj1 = new Main(10,10,1000);
        Main obj2 = new Main(10,20,1001);
        Main obj3 = new Main(20,10,1002);
        Main obj4 = new Main(10,10,1003);
        Main obj5 = new Main(10,10,1000);
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj3.hashCode());
        System.out.println(obj4.hashCode());
        System.out.println(obj5.hashCode());
        System.out.println("Сравнение obj1 и obj2: " + obj1.equals(obj2));
        System.out.println("Сравнение obj1 и obj3: " + obj1.equals(obj3));
        System.out.println("Сравнение obj1 и obj4: " + obj1.equals(obj4));
        System.out.println("Сравнение obj1 и obj5: " + obj1.equals(obj5));
    }
}
