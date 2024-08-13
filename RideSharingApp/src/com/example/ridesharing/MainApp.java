package com.example.ridesharing;

public class MainApp {
    public static void main(String[] args) {
        // Singleton User Authentication
        UserAuthentication auth = UserAuthentication.getInstance();
        auth.login("JohnDoe");

        // Create a Vehicle
        Vehicle vehicle = VehicleFactory.createVehicle("Car");
        vehicle.startRide();

        // Create a Payment Method
        PaymentProcessor processor = new CreditCardProcessor();
        PaymentMethod paymentMethod = processor.createPaymentMethod();
        paymentMethod.pay(50.0);

        // Logout user
        auth.logout();
    }
}
