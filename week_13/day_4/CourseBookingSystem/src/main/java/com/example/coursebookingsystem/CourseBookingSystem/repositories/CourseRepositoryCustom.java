package com.example.coursebookingsystem.CourseBookingSystem.repositories;

import com.example.coursebookingsystem.CourseBookingSystem.models.Course;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepositoryCustom {

    List<Course> findCourseByCustomer(Long customerId);
}
