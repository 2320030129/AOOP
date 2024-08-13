package com.example.ridesharing;

public class CreditCardProcessor implements PaymentProcessor {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new CreditCard();
    }
}
