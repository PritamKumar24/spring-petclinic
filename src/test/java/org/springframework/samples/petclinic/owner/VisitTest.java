package org.springframework.samples.petclinic.owner;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VisitTest {

    @Test
    public void testVisitDate() {
        Visit visit = new Visit();
        LocalDate date = LocalDate.now();
        visit.setDate(date);
        assertEquals(date, visit.getDate());
    }

    @Test
    public void testDescription() {
        Visit visit = new Visit();
        visit.setDescription("Check-up");
        assertEquals("Check-up", visit.getDescription());
    }
}

