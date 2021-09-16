package ru.mirea.task3;

public class TestHuman {
    public static void main(String[] args) {
        Human human = new Human(70,170,35, new Leg(2,40,10),new Hand(2,30,5),new Head("Round", 20,20));
        System.out.println(human.toString());
    }
}
