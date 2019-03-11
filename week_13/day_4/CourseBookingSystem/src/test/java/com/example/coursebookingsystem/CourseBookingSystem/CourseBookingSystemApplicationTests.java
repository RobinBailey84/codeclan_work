package com.example.coursebookingsystem.CourseBookingSystem;

import com.example.coursebookingsystem.CourseBookingSystem.models.Booking;
import com.example.coursebookingsystem.CourseBookingSystem.models.Course;
import com.example.coursebookingsystem.CourseBookingSystem.models.Customer;
import com.example.coursebookingsystem.CourseBookingSystem.repositories.BookingRepository;
import com.example.coursebookingsystem.CourseBookingSystem.repositories.CourseRepository;
import com.example.coursebookingsystem.CourseBookingSystem.repositories.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseBookingSystemApplicationTests {

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canGetCourseByRating() {
		List<Course> results = courseRepository.findCourseByStarRating(5);
		assertEquals(1, results.size());
	}

	@Test
	public void canGetBookingByDate() {
		List<Booking> results = bookingRepository.findBookingByDate("01-06-2019");
		assertEquals(1, results.size());
	}

	@Test
	public void canGetCustomersOnCourse() {
		List<Customer> results = customerRepository.findCustomersOnCourse(1L);
		assertEquals(2, results.size());
	}

	@Test
	public void canGetCoursesFromCustomer() {
		List<Course> results = courseRepository.findCourseByCustomer(2L);
		assertEquals(2, results.size());
	}
}
