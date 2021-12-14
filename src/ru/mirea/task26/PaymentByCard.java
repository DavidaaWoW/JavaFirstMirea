package ru.mirea.task26;

public class PaymentByCard extends Payment{
    public PaymentByCard(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }
}
