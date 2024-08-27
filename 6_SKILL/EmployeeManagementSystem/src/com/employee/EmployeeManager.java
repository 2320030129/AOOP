package com.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EmployeeManager {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<Employee> employees = new ArrayList<>();

        // Adding employees to the list
        employees.add(new Employee(3, "Alice", 55000));
        employees.add(new Employee(1, "Bob", 45000));
        employees.add(new Employee(2, "Charlie", 65000));

        // Sorting by natural order (id)
        Collections.sort(employees);
        System.out.println("Sorted by ID (Natural Order):");
        for (Employee e : employees) {
            System.out.println(e);
        }

        // Sorting by name
        Collections.sort(employees, new EmployeeNameComparator());
        System.out.println("\nSorted by Name:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        // Sorting by salary
        Collections.sort(employees, new EmployeeSalaryComparator());
        System.out.println("\nSorted by Salary:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        // Cloning an employee
        Employee clonedEmployee = (Employee) employees.get(0).clone();
        System.out.println("\nCloned Employee:");
        System.out.println(clonedEmployee);

        // Iterating through the employee list
        System.out.println("\nIterating through Employee List:");
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
