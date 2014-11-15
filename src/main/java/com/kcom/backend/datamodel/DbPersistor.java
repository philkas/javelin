package com.kcom.backend.datamodel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by pika on 09.11.14.
 */
public class DbPersistor {
    private static EntityManagerFactory factory;
    private static final String PERSISTENCE_UNIT_NAME = "Events";

    private static EntityManager em;

    private static EntityManagerFactory getFactory() {
        if(factory == null) {
            factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        }
        return factory;
    }

    public static EntityManager getEntityManager() {
        if(em == null) {
            em = factory.createEntityManager();
        }
        return em;
    }

    public static void doTransaction(final Object object) {
        EntityManager entityManager = getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(object);
        entityManager.getTransaction().commit();
    }
}
