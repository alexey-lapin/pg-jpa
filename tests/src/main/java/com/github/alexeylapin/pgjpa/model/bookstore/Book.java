package com.github.alexeylapin.pgjpa.model.bookstore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {

    @Id
    private Long id;

    private String title;

}
