package ru.mirea.task15;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        File file = new File("text.txt");
        Scanner scanner = new Scanner(System.in);
        try(FileWriter write = new FileWriter(file)){
            while(true){
                System.out.println("Введите строку, выход -1");
                String str = scanner.next();
                if(str.equals("-1"))
                    break;
                else
                    System.out.println(str);
                write.write(str);
                write.write("\n");
                write.flush();
            }
        }
        catch (IOException io){
            System.out.println(io.getMessage());
        }
    }
}
