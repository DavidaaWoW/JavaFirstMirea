package ru.mirea.task29;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        double dollar = 73.56;
        double euro = 82.89;
        double hryvnia = 2.73;
        double gbp = 96.98;
        CurrencyInfo info = new CurrencyInfo(dollar, euro, hryvnia, gbp);
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\User\\Desktop\\save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(info);
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\User\\Desktop\\save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        CurrencyInfo newInfo = (CurrencyInfo) objectInputStream.readObject();

        System.out.println(newInfo);
    }
}
