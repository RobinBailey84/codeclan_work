package com.example.coursebookingsystem.CourseBookingSystem.repositories;

import com.example.coursebookingsystem.CourseBookingSystem.models.Course;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CourseRepositoryImpl implements CourseRepositoryCustom{

    @Autowired
    EntityManager entityManager;

    @Transactional
    @Override
    public List<Course> findCourseByCustomer(Long customerId) {
        List<Course> results = null;

        Session session = entityManager.unwrap(Session.class);
        Criteria cr = null;

        try {
            cr = session.createCriteria(Course.class);
            cr.createAlias("bookings", "booking");
//            cr.createAlias("booking.customer", "customer");
            cr.add(Restrictions.eq("booking.customer.id", customerId));
        } catch (Exception e) {
            e.printStackTrace();
        }

        results = cr.list();
        return results;
    }
}
