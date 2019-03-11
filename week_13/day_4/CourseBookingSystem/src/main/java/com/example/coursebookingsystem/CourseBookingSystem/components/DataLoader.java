package com.example.coursebookingsystem.CourseBookingSystem.components;

import com.example.coursebookingsystem.CourseBookingSystem.models.Booking;
import com.example.coursebookingsystem.CourseBookingSystem.models.Course;
import com.example.coursebookingsystem.CourseBookingSystem.models.Customer;
import com.example.coursebookingsystem.CourseBookingSystem.repositories.BookingRepository;
import com.example.coursebookingsystem.CourseBookingSystem.repositories.CourseRepository;
import com.example.coursebookingsystem.CourseBookingSystem.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args){
        Course course1 = new Course("Programming", "London", 5);
        courseRepository.save(course1);

        Course course2 = new Course("Spanish", "Madrid", 3);
        courseRepository.save(course2);

        Customer customer1 = new Customer("Martin Keown", "Reading", 40);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Perry Groves", "Marlow", 38);
        customerRepository.save(customer2);


        Booking booking1 = new Booking("22-02-2019", course1, customer1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("01-06-2019", course2, customer2);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("11-05-2019", course1, customer2);
        bookingRepository.save(booking3);

    }
}
