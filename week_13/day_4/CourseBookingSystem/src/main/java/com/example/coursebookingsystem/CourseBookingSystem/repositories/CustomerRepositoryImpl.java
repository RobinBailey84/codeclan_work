package com.example.coursebookingsystem.CourseBookingSystem.repositories;

import com.example.coursebookingsystem.CourseBookingSystem.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    @Override
    public List<Customer> findCustomersOnCourse(Long courseId) {
        List <Customer> results = null;

        Session session = entityManager.unwrap(Session.class);
        Criteria cr = null;
        try {
            cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "booking");
//            cr.createAlias("booking.course", "course");
            cr.add(Restrictions.eq("booking.course.id", courseId));
        } catch (Exception e) {
            e.printStackTrace();
        }
        results = cr.list();

        return results;
    }


}
