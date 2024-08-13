package com.example.ridesharing;

public class PayPalProcessor implements PaymentProcessor {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new payPal();
    }
}
