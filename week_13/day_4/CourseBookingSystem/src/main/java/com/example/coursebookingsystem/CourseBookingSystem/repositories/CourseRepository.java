package com.example.coursebookingsystem.CourseBookingSystem.repositories;

import com.example.coursebookingsystem.CourseBookingSystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom{

    List<Course> findCourseByStarRating(int rating);
}
