package com.srp.salary;

import com.srp.employee.Employee;

public class SalaryCalculator {
    public double calculateSalary(Employee employee) {
        double baseSalary = 30000; // base salary for all roles
        if (employee.getRole().equalsIgnoreCase("Manager")) {
            return baseSalary * 1.5;
        } else if (employee.getRole().equalsIgnoreCase("Developer")) {
            return baseSalary * 1.2;
        } else {
            return baseSalary;
        }
    }
}
