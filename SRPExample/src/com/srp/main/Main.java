package com.srp.main;

import com.srp.employee.Employee;
import com.srp.salary.SalaryCalculator;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", "Manager");
        Employee emp2 = new Employee("Bob", "Developer");

        SalaryCalculator salaryCalculator = new SalaryCalculator();

        System.out.println(emp1.getName() + "'s salary: " + salaryCalculator.calculateSalary(emp1));
        System.out.println(emp2.getName() + "'s salary: " + salaryCalculator.calculateSalary(emp2));
    }
}
