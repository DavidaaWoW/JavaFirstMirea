package ru.mirea.task26;

public class Main {
    public static void main(String[] args) {
        Payment payment = new PaymentByWallet(new OnlineWallet());
        Payment payment1 = new PaymentByCard(new Card());
        payment.pay();
        payment1.pay();

    }
}
