package ru.mirea.task15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Second {
    public static void main(String[] args) {
        File file = new File("text.txt");
        try(FileReader reader = new FileReader(file)){
            BufferedReader buf = new BufferedReader(reader);
            String str = "";
            str = buf.readLine();
            while (!str.equals("")){
                System.out.println(str);
                str = buf.readLine();
            }
        }
        catch (Exception io){
            System.out.println(io.getMessage());
        }
    }
}
