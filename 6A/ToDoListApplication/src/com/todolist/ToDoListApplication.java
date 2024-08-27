package com.todolist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoListApplication {
    private List<String> toDoList;

    public ToDoListApplication() {
        toDoList = new ArrayList<>();
    }

    // Method to add a task
    public void addTask(String task) {
        toDoList.add(task);
        System.out.println("Task added: " + task);
    }

    // Method to update a task's description
    public void updateTask(int index, String newTask) {
        if (index >= 0 && index < toDoList.size()) {
            toDoList.set(index, newTask);
            System.out.println("Task updated at position " + index + ": " + newTask);
        } else {
            System.out.println("Invalid task index.");
        }
    }

    // Method to remove a task by its index
    public void removeTask(int index) {
        if (index >= 0 && index < toDoList.size()) {
            String removedTask = toDoList.remove(index);
            System.out.println("Task removed: " + removedTask);
        } else {
            System.out.println("Invalid task index.");
        }
    }

    // Method to display all tasks
    public void displayTasks() {
        System.out.println("To-Do List:");
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println((i + 1) + ". " + toDoList.get(i));
        }
    }

    // Main method to run the To-Do List Application
    public static void main(String[] args) {
        ToDoListApplication app = new ToDoListApplication();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Add Task");
            System.out.println("2. Update Task");
            System.out.println("3. Remove Task");
            System.out.println("4. Display Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String task = scanner.nextLine();
                    app.addTask(task);
                    break;
                case 2:
                    app.displayTasks();
                    System.out.print("Enter task number to update: ");
                    int updateIndex = scanner.nextInt() - 1;
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new task description: ");
                    String newTask = scanner.nextLine();
                    app.updateTask(updateIndex, newTask);
                    break;
                case 3:
                    app.displayTasks();
                    System.out.print("Enter task number to remove: ");
                    int removeIndex = scanner.nextInt() - 1;
                    scanner.nextLine(); // Consume newline
                    app.removeTask(removeIndex);
                    break;
                case 4:
                    app.displayTasks();
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
