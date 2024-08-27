package com.browserhistory;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BrowsingHistorySystem {
    private Deque<String> backStack;
    private Deque<String> forwardStack;
    private String currentPage;

    public BrowsingHistorySystem() {
        backStack = new ArrayDeque<>();
        forwardStack = new ArrayDeque<>();
        currentPage = null;
    }

    // Method to add a new page to the history
    public void visitPage(String url) {
        if (currentPage != null) {
            backStack.push(currentPage);
            forwardStack.clear();
        }
        currentPage = url;
        System.out.println("Current page: " + currentPage);
    }

    // Method to go back to the previous page
    public void goBack() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentPage);
            currentPage = backStack.pop();
            System.out.println("Current page: " + currentPage);
        } else {
            System.out.println("No previous page.");
        }
    }

    // Method to go forward to the next page
    public void goForward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(currentPage);
            currentPage = forwardStack.pop();
            System.out.println("Current page: " + currentPage);
        } else {
            System.out.println("No next page.");
        }
    }

    // Method to display the current page
    public void displayCurrentPage() {
        if (currentPage == null) {
            System.out.println("No current page.");
        } else {
            System.out.println("Current page: " + currentPage);
        }
    }

    // Main method to run the Browsing History System
    public static void main(String[] args) {
        BrowsingHistorySystem system = new BrowsingHistorySystem();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Visit Page");
            System.out.println("2. Go Back");
            System.out.println("3. Go Forward");
            System.out.println("4. Display Current Page");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter URL: ");
                    String url = scanner.nextLine();
                    system.visitPage(url);
                    break;
                case 2:
                    system.goBack();
                    break;
                case 3:
                    system.goForward();
                    break;
                case 4:
                    system.displayCurrentPage();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
