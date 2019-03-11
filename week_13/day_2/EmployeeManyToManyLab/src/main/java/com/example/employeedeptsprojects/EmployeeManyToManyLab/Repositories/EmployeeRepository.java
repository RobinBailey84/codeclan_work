package com.example.employeedeptsprojects.EmployeeManyToManyLab.Repositories;

import com.example.employeedeptsprojects.EmployeeManyToManyLab.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
