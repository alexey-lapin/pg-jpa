package com.github.alexeylapin.pgjpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.function.Consumer;

public interface Support {

    String PU_TEST_H2 = "test-h2";

    static void doInTransaction(String pu, Consumer<EntityManager> action) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(pu);
        try {
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            action.accept(em);
            em.getTransaction().commit();
        } finally {
            emf.close();
        }
    }

}
