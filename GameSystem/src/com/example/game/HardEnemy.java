package com.example.game;

public class HardEnemy implements Enemy {
    @Override
    public void attack() {
        System.out.println("HardEnemy attacks with high damage!");
    }
}
