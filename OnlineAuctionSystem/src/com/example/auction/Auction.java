package com.example.auction;

import java.util.ArrayList;
import java.util.List;

public class Auction implements Subject {
    private List<Observer> observers;
    private String itemName;

    public Auction(String itemName) {
        this.itemName = itemName;
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String event) {
        for (Observer observer : observers) {
            observer.update(event);
        }
    }

    public void startBidding() {
        notifyObservers("Bidding started for " + itemName);
    }

    public void endBidding() {
        notifyObservers("Bidding ended for " + itemName);
    }

    public void itemAvailable() {
        notifyObservers(itemName + " is now available for bidding.");
    }
}
