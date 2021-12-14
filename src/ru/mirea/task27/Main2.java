package ru.mirea.task27;

import java.util.ArrayList;
import java.util.HashMap;

public class Main2 {
    public static void main(String[] args) {
        HashMap <String, ArrayList<String>> map = new HashMap<>();
        ArrayList <String> list = new ArrayList<>();
        ArrayList <String> list1 = new ArrayList<>();
        ArrayList <String> list2 = new ArrayList<>();
        list.add("Moscow");
        list.add("St. Petersburg");
        list.add("Volgograd");
        list.add("Perm");
        list.add("Yakutsk");
        map.put("Russia", list);
        list1.add("Chicago");
        list1.add("Baltimore");
        list1.add("Denver");
        list1.add("San Diego");
        list1.add("St. Louis");
        list1.add("Atlanta");
        map.put("USA", list1);
        list2.add("Rome");
        list2.add("Florencia");
        list2.add("Palermo");
        list2.add("Milan");
        list2.add("Venice");
        list2.add("Naples");
        map.put("Italy", list2);
        System.out.println(map);
    }
}
