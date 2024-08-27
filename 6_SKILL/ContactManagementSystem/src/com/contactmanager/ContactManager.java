package com.contactmanager;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;

public class ContactManager {
    private Set<Contact> contactSet;
    private Map<String, Contact> contactMap;

    public ContactManager() {
        contactSet = new HashSet<>();
        contactMap = new HashMap<>();
    }

    // Add a contact
    public void addContact(Contact contact) {
        if (contactSet.add(contact)) {
            contactMap.put(contact.getName(), contact);
            System.out.println("Contact added: " + contact);
        } else {
            System.out.println("Contact with this name already exists.");
        }
    }

    // Remove a contact by name
    public void removeContact(String name) {
        Contact contact = contactMap.remove(name);
        if (contact != null) {
            contactSet.remove(contact);
            System.out.println("Contact removed: " + contact);
        } else {
            System.out.println("Contact not found.");
        }
    }

    // Update a contact's phone number
    public void updateContact(String name, String newPhoneNumber) {
        Contact contact = contactMap.get(name);
        if (contact != null) {
            contact.setPhoneNumber(newPhoneNumber);
            System.out.println("Contact updated: " + contact);
        } else {
            System.out.println("Contact not found.");
        }
    }

    // Display all contacts
    public void displayContacts() {
        if (contactSet.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            System.out.println("Contacts:");
            for (Contact contact : contactSet) {
                System.out.println(contact);
            }
        }
    }

    // Main method to interact with the ContactManager
    public static void main(String[] args) {
        ContactManager manager = new ContactManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Contact");
            System.out.println("2. Remove Contact");
            System.out.println("3. Update Contact");
            System.out.println("4. Display Contacts");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter contact name: ");
                    String nameToAdd = scanner.nextLine();
                    System.out.print("Enter contact phone number: ");
                    String phoneNumberToAdd = scanner.nextLine();
                    manager.addContact(new Contact(nameToAdd, phoneNumberToAdd));
                    break;
                case 2:
                    System.out.print("Enter contact name to remove: ");
                    String nameToRemove = scanner.nextLine();
                    manager.removeContact(nameToRemove);
                    break;
                case 3:
                    System.out.print("Enter contact name to update: ");
                    String nameToUpdate = scanner.nextLine();
                    System.out.print("Enter new phone number: ");
                    String newPhoneNumber = scanner.nextLine();
                    manager.updateContact(nameToUpdate, newPhoneNumber);
                    break;
                case 4:
                    manager.displayContacts();
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
