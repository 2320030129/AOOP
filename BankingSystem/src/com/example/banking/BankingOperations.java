package com.example.banking;

public class BankingOperations {
    public void viewBalance() {
        UserSession session = UserSession.getInstance();
        if (session.isLoggedIn()) {
            // Perform balance viewing operation
            System.out.println("Viewing balance...");
        } else {
            System.out.println("Please log in to view your balance.");
        }
    }

    public void deposit(double amount) {
        UserSession session = UserSession.getInstance();
        if (session.isLoggedIn()) {
            // Perform deposit operation
            System.out.println("Depositing $" + amount + "...");
        } else {
            System.out.println("Please log in to deposit money.");
        }
    }

    public void withdraw(double amount) {
        UserSession session = UserSession.getInstance();
        if (session.isLoggedIn()) {
            // Perform withdrawal operation
            System.out.println("Withdrawing $" + amount + "...");
        } else {
            System.out.println("Please log in to withdraw money.");
        }
    }
}
