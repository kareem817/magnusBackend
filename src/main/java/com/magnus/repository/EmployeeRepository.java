package com.magnus.repository;

import com.magnus.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // No extra methods needed for basic CRUD
}
