package com.example.game;

public class GameState {
    private static GameState instance;
    private int currentLevel;
    private String difficulty;

    private GameState() {
        currentLevel = 1;
        difficulty = "Easy";
    }

    public static synchronized GameState getInstance() {
        if (instance == null) {
            instance = new GameState();
        }
        return instance;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int level) {
        this.currentLevel = level;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public void nextLevel() {
        currentLevel++;
    }
}
