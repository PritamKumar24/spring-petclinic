package org.springframework.samples.petclinic.vet;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VetControllerTest {

    @Mock
    private VetRepository vetRepository;

    @InjectMocks
    private VetController vetController;

    public VetControllerTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testShowVetList() {
        String view = vetController.showVetList(1, new Model());
        assertEquals("vets/vetList", view);
    }
}
```