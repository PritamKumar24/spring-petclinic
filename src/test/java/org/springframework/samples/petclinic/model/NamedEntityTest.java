package org.springframework.samples.petclinic.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NamedEntityTest {

    @Test
    public void testName() {
        NamedEntity namedEntity = new NamedEntity();
        namedEntity.setName("Test Name");
        assertEquals("Test Name", namedEntity.getName());
    }

    @Test
    public void testToString() {
        NamedEntity namedEntity = new NamedEntity();
        namedEntity.setName("Test Name");
        assertEquals("Test Name", namedEntity.toString());
    }
}

