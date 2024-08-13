package com.example.auction;

public class Bidder implements Observer {
    private String name;

    public Bidder(String name) {
        this.name = name;
    }

    @Override
    public void update(String event) {
        System.out.println("Notification for " + name + ": " + event);
    }

    public String getName() {
        return name;
    }
}
