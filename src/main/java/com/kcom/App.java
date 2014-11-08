package com.kcom;

import com.kcom.backend.datamodel.Event;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App
{
    private static EntityManagerFactory factory;
    private static final String PERSISTENCE_UNIT_NAME = "Events";

    private static EntityManager em;
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        em = factory.createEntityManager();
        Event event = new Event();
        event.setEventName("Schülersportfest");
        event.setEventType("Einzel");
        event.setEndDate("10.10.2014");
        event.setStartDate("10.10.2014");
        em.persist(event);
        em.getTransaction().commit();

        Query query = em.createQuery("select e from Event e");
        List<Event> eventList = query.getResultList();
        for(Event e : eventList) {
            System.out.println(e.toString());
        }
    }
}
