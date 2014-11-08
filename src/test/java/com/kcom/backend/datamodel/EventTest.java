package com.kcom.backend.datamodel;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import java.util.List;

import static org.junit.Assert.*;

public class EventTest {
    private static EntityManagerFactory factory;
    private static final String PERSISTENCE_UNIT_NAME = "Events";

    private EntityManager em;

    @BeforeClass
    public static void setUpClass() {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    }

    @Before
    public void setUp() throws Exception {
        em = factory.createEntityManager();
    }

    @Test
    public void insertIntoDb() {
        Event event = new Event();
        event.setEventName("Schülersportfest");
        event.setEventType("Einzel");
        event.setEndDate("10.10.2014");
        event.setStartDate("10.10.2014");
        em.getTransaction().begin();
        em.persist(event);
        em.getTransaction().commit();

        Query query = em.createQuery("select e from Event e");
        List<Event> eventList = query.getResultList();
        for(Event e : eventList) {
            System.out.println(e.toString());
        }
    }

    @After
    public void tearDown() throws Exception {

    }
}