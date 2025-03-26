package org.springframework.samples.petclinic.owner;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PetValidatorTest {

    private final PetValidator petValidator = new PetValidator();

    @Test
    public void testValidateNameNotEmpty() {
        Pet pet = new Pet();
        pet.setName("");
        Errors errors = new BeanPropertyBindingResult(pet, "pet");
        
        petValidator.validate(pet, errors);
        assertTrue(errors.hasErrors());
        assertEquals("required", errors.getFieldError("name").getCode());
    }

    // Additional tests for other validation rules can be added here
}

