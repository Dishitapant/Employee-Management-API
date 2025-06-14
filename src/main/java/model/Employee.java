package com.example.employeeapi.model;

import jakarta.persistence.*;

// This class is mapped to a database table using JPA
@Entity
public class Employee {

    // Primary key with auto-increment
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Employee name
    private String name;

    // Department the employee belongs to
    private String department;

    // Employee's salary
    private double salary;

    // Default constructor (needed by JPA)
    public Employee() {}

    // Constructor to quickly create an employee object with values
    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getter and setter methods for each field

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
