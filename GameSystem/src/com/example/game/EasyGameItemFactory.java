package com.example.game;

public class EasyGameItemFactory implements GameItemFactory {
    @Override
    public Weapon createWeapon() {
        return new Sword(); // Example weapon for easy difficulty
    }

    @Override
    public PowerUp createPowerUp() {
        return new HealthPotion(); // Example power-up for easy difficulty
    }
}
