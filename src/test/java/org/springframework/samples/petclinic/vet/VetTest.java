package org.springframework.samples.petclinic.vet;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VetTest {

    @Test
    public void testSpecialty() {
        Vet vet = new Vet();
        Specialty specialty = new Specialty();
        specialty.setName("Dentistry");
        vet.addSpecialty(specialty);
        assertEquals(1, vet.getNrOfSpecialties());
    }
}

