package com.example.employeedeptsprojects.EmployeeManyToManyLab.Repositories;

import com.example.employeedeptsprojects.EmployeeManyToManyLab.Models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
