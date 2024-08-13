package com.example.game;

public class Shield implements Weapon {
    @Override
    public void use() {
        System.out.println("Blocking with the shield!");
    }
}
