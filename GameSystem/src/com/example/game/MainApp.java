package com.example.game;

public class MainApp {
    public static void main(String[] args) {
        // Singleton GameState instance
        GameState gameState = GameState.getInstance();
        System.out.println("Current Level: " + gameState.getCurrentLevel());
        System.out.println("Difficulty: " + gameState.getDifficulty());

        // Create enemies based on difficulty
        EnemyFactory enemyFactory = EnemyFactory.getFactory(gameState.getDifficulty());
        Enemy enemy = enemyFactory.createEnemy();
        enemy.attack();

        // Create items based on difficulty
        GameItemFactory itemFactory = getGameItemFactory(gameState.getDifficulty());
        Weapon weapon = itemFactory.createWeapon();
        PowerUp powerUp = itemFactory.createPowerUp();

        weapon.use();
        powerUp.activate();

        // Change game state and retry
        gameState.setDifficulty("Hard");
        gameState.nextLevel();
        System.out.println("\nLevel Up!");
        System.out.println("Current Level: " + gameState.getCurrentLevel());
        System.out.println("Difficulty: " + gameState.getDifficulty());

        // Create enemies and items for the new difficulty
        enemyFactory = EnemyFactory.getFactory(gameState.getDifficulty());
        enemy = enemyFactory.createEnemy();
        enemy.attack();

        itemFactory = getGameItemFactory(gameState.getDifficulty());
        weapon = itemFactory.createWeapon();
        powerUp = itemFactory.createPowerUp();

        weapon.use();
        powerUp.activate();
    }

    private static GameItemFactory getGameItemFactory(String difficulty) {
        switch (difficulty) {
            case "Easy":
                return new EasyGameItemFactory();
            case "Hard":
                return new HardGameItemFactory();
            default:
                throw new IllegalArgumentException("Unknown difficulty level");
        }
    }
}
