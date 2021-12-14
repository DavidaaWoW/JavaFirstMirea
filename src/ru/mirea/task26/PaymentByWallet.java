package ru.mirea.task26;

public class PaymentByWallet extends Payment{
    public PaymentByWallet(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }
}
