package org.example.proyectohospitalpost;

import org.example.proyectohospitalpost.entity.Patient;
import org.example.proyectohospitalpost.service.IPatientService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

public class PatientServicesTest {

    public static Long id1;
    public static Patient patient1;

    @Mock
    IPatientService patientService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        id1 = 1L;
        patient1 = new Patient(id1, "luis", "Montero", "Dislexia", LocalDate.now(), "luis@gmail.com");
    }

    @Test
    public void testGetAllPatients() {
        when(patientService.getAllPatients()).thenReturn(Collections.singletonList(patient1));

        List<Patient> patients = patientService.getAllPatients();
        assertNotNull(patients);
        assertEquals(1, patients.size());
        assertEquals(patient1, patients.get(0));
    }
}
