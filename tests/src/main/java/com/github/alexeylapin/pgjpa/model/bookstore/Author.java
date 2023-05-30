package com.github.alexeylapin.pgjpa.model.bookstore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@Entity
public class Author {

    @Id
    private Long id;

    private String name;

}
