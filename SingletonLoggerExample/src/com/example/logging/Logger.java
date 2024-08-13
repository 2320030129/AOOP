package com.example.logging;

public class Logger {
    // The single instance of Logger
    private static Logger instance;

    // Private constructor to prevent instantiation
    private Logger() {
        // Initialization code, if needed
    }

    // Method to get the single instance of Logger
    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Method to log messages
    public void log(String message) {
        // For simplicity, just print the message to the console
        System.out.println("[LOG] " + message);
    }
}
