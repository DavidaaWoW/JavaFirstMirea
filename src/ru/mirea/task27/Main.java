package ru.mirea.task27;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap <String, String> map = new HashMap<>();
        map.put("Surname1", "Name1");
        map.put("Surname2", "Name2");
        map.put("Surname3", "Name3");
        map.put("Surname4", "Name2");
        map.put("Surname5", "Name3");
        map.put("Surname6", "Name4");
        map.put("Surname7", "Name5");
        map.put("Surname8", "Name3");
        map.put("Surname9", "Name1");
        map.put("Surname10", "Name6");
        System.out.println(map);
        Set newSet = new HashSet();
        HashMap <String, String> newMap = new HashMap<>();
        map.entrySet().forEach(entry->{
            if(!newSet.contains(entry.getValue())){
                newSet.add(entry.getValue());
                newMap.put(entry.getKey(), entry.getValue());
            }
        });
        System.out.println(newMap);
    }
}
