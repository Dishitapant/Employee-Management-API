package com.example.employeeapi.service;

import com.example.employeeapi.model.Employee;
import com.example.employeeapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// This class handles the business logic of Employee operations
@Service
public class EmployeeService {

    // Autowire the repository to access database methods
    @Autowired
    private EmployeeRepository employeeRepository;

    // This method is used to save a new employee
    // We set the ID to null to make sure a new row is created, not updated
    public Employee saveEmployee(Employee employee) {
        employee.setId(null);  // avoid conflict with existing data
        return employeeRepository.save(employee);
    }

    // Fetch all employees from the database
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Fetch a specific employee by ID
    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    // Update an existing employee (only if it already exists)
    public Employee updateEmployee(Employee employee) {
        // Check if the employee exists by its ID before updating
        if (employee.getId() != null && employeeRepository.existsById(employee.getId())) {
            return employeeRepository.save(employee); // update if exists
        }
        return null; // if not found, return null (can also throw an exception)
    }

    // Delete an employee by ID
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
