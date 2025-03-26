package org.springframework.samples.petclinic.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BaseEntityTest {

    @Test
    public void testIsNew() {
        BaseEntity baseEntity = new BaseEntity();
        assertTrue(baseEntity.isNew());

        baseEntity.setId(1);
        assertFalse(baseEntity.isNew());
    }

    @Test
    public void testGetId() {
        BaseEntity baseEntity = new BaseEntity();
        baseEntity.setId(1);
        assertEquals(1, baseEntity.getId());
    }
}

