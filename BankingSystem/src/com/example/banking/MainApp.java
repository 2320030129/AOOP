package com.example.banking;

public class MainApp {
    public static void main(String[] args) {
        // Get the single instance of UserSession
        UserSession session = UserSession.getInstance();

        // Perform operations before logging in
        BankingOperations operations = new BankingOperations();
        operations.viewBalance(); // Should prompt to log in
        operations.deposit(100);  // Should prompt to log in
        operations.withdraw(50);  // Should prompt to log in

        // Log in and perform operations again
        session.logIn();
        operations.viewBalance(); // Should work now
        operations.deposit(100);  // Should work now
        operations.withdraw(50);  // Should work now

        // Log out and try operations again
        session.logOut();
        operations.viewBalance(); // Should prompt to log in
        operations.deposit(100);  // Should prompt to log in
        operations.withdraw(50);  // Should prompt to log in
    }
}
