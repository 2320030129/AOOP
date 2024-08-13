package com.example.game;

public class HealthPotion implements PowerUp {
    @Override
    public void activate() {
        System.out.println("HealthPotion activated: Restoring health!");
    }
}
