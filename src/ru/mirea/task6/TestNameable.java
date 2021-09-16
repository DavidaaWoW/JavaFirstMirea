package ru.mirea.task6;

public class TestNameable {
    public static void main(String[] args) {
        Nameable planet = new Planet("Uranus");
        System.out.println(planet.getName());
        Nameable animal = new Animal("Whale");
        System.out.println(animal.getName());
    }
}
