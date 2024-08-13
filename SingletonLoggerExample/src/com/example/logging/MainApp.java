package com.example.logging;

public class MainApp {
    public static void main(String[] args) {
        // Getting the single instance of Logger and logging messages
        Logger logger1 = Logger.getInstance();
        logger1.log("This is the first log message.");

        // Getting the same instance of Logger and logging another message
        Logger logger2 = Logger.getInstance();
        logger2.log("This is the second log message.");

        // Checking if both logger1 and logger2 are the same instance
        if (logger1 == logger2) {
            System.out.println("logger1 and logger2 are the same instance.");
        }
    }
}
