package com.example.game;

public class HardGameItemFactory implements GameItemFactory {
    @Override
    public Weapon createWeapon() {
        return new Shield(); // Example weapon for hard difficulty
    }

    @Override
    public PowerUp createPowerUp() {
        return new HealthPotion(); // Example power-up for hard difficulty
    }
}
