package ru.mirea.task26;

import java.util.Scanner;

public class OnlineWallet implements PaymentStrategy{
    private String email;
    private String phone;
    private enum Wallets{
        Paypal, Qiwi, Payoneer, WebMoney, YandexMoney;
    }
    Wallets wallet;
    @Override
    public void pay() {
        System.out.print("Был совершён платёж через " + wallet);
        if(wallet == Wallets.Paypal || wallet == Wallets.Payoneer){
            System.out.println(" по почте " + email);
        }
        else {
            System.out.println(" по номеру телефона " + phone);
        }
    }

    @Override
    public void getData() {
        System.out.println("Please select wallet");
        System.out.println("1. Paypal");
        System.out.println("2. Qiwi");
        System.out.println("3. Payoneer");
        System.out.println("4. WebMoney");
        System.out.println("5. YandexMoney");
        Scanner scanner = new Scanner(System.in);
        String in = scanner.next();
        int num;
        try {
            num = Integer.parseInt(in);
        }
        catch (Exception ex){
            System.out.println("Введите число!");
            return;
        }
        switch (num){
            case 1:
                wallet = Wallets.Paypal;
                System.out.println("Введите mail");
                in = scanner.next();
                email = in;
                break;
            case 2:
                wallet = Wallets.Qiwi;
                System.out.println("Введите телефон");
                in = scanner.next();
                phone = scanner.next();
                break;
            case 3:
                wallet = Wallets.Payoneer;
                System.out.println("Введите mail");
                in = scanner.next();
                email = in;
                break;
            case 4:
                wallet = Wallets.WebMoney;
                System.out.println("Введите телефон");
                in = scanner.next();
                phone = scanner.next();
                break;
            case 5:
                wallet = Wallets.YandexMoney;
                System.out.println("Введите телефон");
                in = scanner.next();
                phone = scanner.next();
                break;
            default:
                System.out.println("Введено неправильное число!");
                return;
        }
        pay();
    }
}
