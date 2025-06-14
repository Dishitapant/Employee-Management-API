package com.example.employeeapi.repository;

import com.example.employeeapi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

// This interface is used to interact with the database for Employee entity
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Custom SQL query (native query) to fetch all employees from the employee table
    // We use nativeQuery = true to run plain SQL instead of JPQL
    @Query(value = "SELECT * FROM employee", nativeQuery = true)
    List<Employee> findAllNative();
}
