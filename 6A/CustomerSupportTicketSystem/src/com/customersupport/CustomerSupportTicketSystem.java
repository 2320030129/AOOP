package com.customersupport;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CustomerSupportTicketSystem {
    private Queue<String> ticketQueue;

    public CustomerSupportTicketSystem() {
        ticketQueue = new LinkedList<>();
    }

    // Method to add a new ticket to the queue
    public void addTicket(String ticket) {
        ticketQueue.add(ticket);
        System.out.println("Ticket added: " + ticket);
    }

    // Method to process (remove) the next ticket in line
    public void processTicket() {
        if (!ticketQueue.isEmpty()) {
            String processedTicket = ticketQueue.poll();
            System.out.println("Ticket processed: " + processedTicket);
        } else {
            System.out.println("No tickets to process.");
        }
    }

    // Method to display all pending tickets
    public void displayTickets() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No pending tickets.");
        } else {
            System.out.println("Pending tickets:");
            for (String ticket : ticketQueue) {
                System.out.println(ticket);
            }
        }
    }

    // Main method to run the Customer Support Ticket System
    public static void main(String[] args) {
        CustomerSupportTicketSystem system = new CustomerSupportTicketSystem();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Add Ticket");
            System.out.println("2. Process Ticket");
            System.out.println("3. Display Tickets");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ticket description: ");
                    String ticket = scanner.nextLine();
                    system.addTicket(ticket);
                    break;
                case 2:
                    system.processTicket();
                    break;
                case 3:
                    system.displayTickets();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
