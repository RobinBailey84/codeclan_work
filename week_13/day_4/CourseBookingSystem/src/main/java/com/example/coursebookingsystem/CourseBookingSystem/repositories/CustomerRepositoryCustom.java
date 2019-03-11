package com.example.coursebookingsystem.CourseBookingSystem.repositories;

import com.example.coursebookingsystem.CourseBookingSystem.models.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepositoryCustom {
    List<Customer> findCustomersOnCourse(Long courseId);
}
