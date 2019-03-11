package com.example.codeclan.pirateservice.repository;

import com.example.codeclan.pirateservice.models.Raid;
import com.example.codeclan.pirateservice.models.Ship;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.util.List;

public class RaidRepositoryImpl implements RaidRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Override
    public List<Ship> findShipsThatHavePiratesNamed(String firstName) {
        List<Ship> results = null;

        Criteria cr = null;
        try {
            Session session = entityManager.unwrap(Session.class);
            cr = session.createCriteria(Ship.class);
            cr.createAlias("pirates", "pirate");
            cr.add(Restrictions.eq("pirate.firstName", firstName));
        } catch (HibernateException e) {
            e.printStackTrace();
        }

        results = cr.list();

        return results;
    }

    @Override
    public List<Raid> findRaidsWithPiratesFromShip(Long id) {
        List<Raid> results = null;
        Criteria cr = null;

        try{
            Session session = entityManager.unwrap(Session.class);
            cr = session.createCriteria(Raid.class);
            cr.createAlias("pirates", "pirate");
            cr.add(Restrictions.eq("pirate.ship.id", id));

        }catch(HibernateException e){
            e.printStackTrace();
        }

        results = cr.list();
        return results;
    }
}
