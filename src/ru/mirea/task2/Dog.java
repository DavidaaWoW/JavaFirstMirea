package ru.mirea.task2;

public class Dog {
    private String name;
    private int age;

    public Dog(){
        name = "";
        age = 0;
    }
    public Dog(String n){
        name = n;
        age = 0;
    }
    public Dog(String n, int a){
        name = n;
        age = a;
    }
    public void setAge(int a){
        age = a;
    }
    public void setName(String n){
        name = n;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void turnToHumanAge(){
        System.out.println(name+"'s age in human years is "+age*7+" years");
    }
}
