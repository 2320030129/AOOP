package com.example.ridesharing;

public class Car implements Vehicle {
    @Override
    public void startRide() {
        System.out.println("Car ride started.");
    }
}
