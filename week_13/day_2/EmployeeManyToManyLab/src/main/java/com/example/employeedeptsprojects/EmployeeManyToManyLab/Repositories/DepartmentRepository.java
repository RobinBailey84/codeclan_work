package com.example.employeedeptsprojects.EmployeeManyToManyLab.Repositories;

import com.example.employeedeptsprojects.EmployeeManyToManyLab.Models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
