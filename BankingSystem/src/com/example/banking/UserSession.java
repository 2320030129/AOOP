package com.example.banking;

public class UserSession {
    // The single instance of UserSession
    private static UserSession instance;

    // User login state
    private boolean loggedIn;

    // Private constructor to prevent instantiation
    private UserSession() {
        this.loggedIn = false; // Initial state is logged out
    }

    // Method to get the single instance of UserSession
    public static synchronized UserSession getInstance() {
        if (instance == null) {
            instance = new UserSession();
        }
        return instance;
    }

    // Method to log in
    public void logIn() {
        this.loggedIn = true;
        System.out.println("User logged in.");
    }

    // Method to log out
    public void logOut() {
        this.loggedIn = false;
        System.out.println("User logged out.");
    }

    // Method to check if the user is logged in
    public boolean isLoggedIn() {
        return this.loggedIn;
    }
}
