package com.employee;

public class Employee implements Comparable<Employee>, Cloneable {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Override compareTo for natural ordering (by id)
    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.id, other.id);
    }

    // Override clone method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Override toString method
    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }
}
