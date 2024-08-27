package com.employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeManager {
    public static void main(String[] args) {
        // Sample list of employees
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice", 50000.0),
            new Employee(2, "Bob", 60000.0),
            new Employee(3, "Charlie", 70000.0),
            new Employee(4, "David", 80000.0),
            new Employee(5, "Eve", 90000.0),
            new Employee(6, "Frank", 55000.0),
            new Employee(7, "Grace", 75000.0),
            new Employee(8, "Hannah", 85000.0),
            new Employee(9, "Ivy", 95000.0),
            new Employee(10, "Jack", 65000.0)
        );

        // Filtering employees with salary greater than 60000
        System.out.println("Employees with salary greater than 60000:");
        employees.stream()
                 .filter(e -> e.getSalary() > 60000)
                 .forEach(System.out::println);

        // Sorting employees by salary in ascending order
        System.out.println("\nEmployees sorted by salary (ascending):");
        employees.stream()
                 .sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
                 .forEach(System.out::println);

        // Finding the highest salary
        double highestSalary = employees.stream()
                                        .mapToDouble(Employee::getSalary)
                                        .max()
                                        .orElse(0.0);
        System.out.println("\nHighest salary: " + highestSalary);

        // Calculating the average salary
        double averageSalary = employees.stream()
                                        .mapToDouble(Employee::getSalary)
                                        .average()
                                        .orElse(0.0);
        System.out.println("Average salary: " + averageSalary);
    }
}
