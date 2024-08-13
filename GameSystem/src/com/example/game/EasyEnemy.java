package com.example.game;

public class EasyEnemy implements Enemy {
    @Override
    public void attack() {
        System.out.println("EasyEnemy attacks with low damage!");
    }
}
