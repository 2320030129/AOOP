package com.example.ridesharing;

public class UserAuthentication {
    private static UserAuthentication instance;
    private boolean isLoggedIn;
    private String username;

    private UserAuthentication() {
        isLoggedIn = false;
    }

    public static synchronized UserAuthentication getInstance() {
        if (instance == null) {
            instance = new UserAuthentication();
        }
        return instance;
    }

    public void login(String username) {
        this.username = username;
        isLoggedIn = true;
        System.out.println(username + " logged in successfully.");
    }

    public void logout() {
        isLoggedIn = false;
        username = null;
        System.out.println("User logged out.");
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public String getUsername() {
        return username;
    }
}
