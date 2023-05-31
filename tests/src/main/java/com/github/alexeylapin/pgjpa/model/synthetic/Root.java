package com.github.alexeylapin.pgjpa.model.synthetic;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@Entity
public class Root {

    @Id
    private Long id;

    private String name;

    @OneToOne
    private Orange orange;

}
