package com.github.alexeylapin.pgjpa.synthetic;

import com.github.alexeylapin.pgjpa.model.synthetic.Orange;
import com.github.alexeylapin.pgjpa.model.synthetic.Root;
import org.junit.jupiter.api.Test;

import static com.github.alexeylapin.pgjpa.Support.PU_TEST_H2;
import static com.github.alexeylapin.pgjpa.Support.doInTransaction;

public class RootTest {

    @Test
    void name() {
        doInTransaction(PU_TEST_H2, em -> {
            Orange orange1 = new Orange().setId(1L).setName("orange-1");
            Root root = new Root().setId(1L).setName("root-1").setOrange(orange1);

            em.persist(root);

        });
    }

}
