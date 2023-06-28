package com.github.vermucht.smth.repository;

import com.github.vermucht.smth.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}