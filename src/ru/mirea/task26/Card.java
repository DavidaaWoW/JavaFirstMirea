package ru.mirea.task26;

import java.util.Scanner;

public class Card implements PaymentStrategy{
    private int cardNum;
    private String date;
    private int CVV;
    @Override
    public void pay() {
        System.out.println("Был совершён платёж по номеру карты " + cardNum);
    }

    @Override
    public void getData() {
        System.out.println("Пожалуйста введите номер карты");
        Scanner scanner = new Scanner(System.in);
        cardNum = scanner.nextInt();
        System.out.println("Пожалуйста введите срок годности карты");
        date = scanner.next();
        System.out.println("Пожалуйста введите CVV код");
        CVV = scanner.nextInt();
        pay();
    }
}
