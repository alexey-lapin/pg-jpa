package com.github.alexeylapin.pgjpa;

import com.github.alexeylapin.pgjpa.model.Author;
import org.junit.jupiter.api.Test;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.sql.ResultSet;

import static org.assertj.core.api.Assertions.assertThat;

public class DummyTest {

    @Test
    void name1() {
//        Persistence.createEntityManagerFactory("test-postgres");

        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>(DockerImageName.parse("postgres:15"))) {
            postgres.start();

//            ResultSet resultSet = performQuery(postgres, "SELECT 1");
//            int resultSetInt = resultSet.getInt(1);
//            assertThat(resultSetInt).as("A basic SELECT query succeeds").isEqualTo(1);
//            assertHasCorrectExposedAndLivenessCheckPorts(postgres);
        }
    }

    @Test
    void name2() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test-h2");
        try {
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            Author author = new Author();
            author.setId(1L);
            em.persist(author);
            em.getTransaction().commit();
        } finally {
            emf.close();
        }
    }

}
