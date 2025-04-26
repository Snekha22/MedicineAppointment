package com.example.MedicineAppointmentSystem.controller;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import com.example.MedicineAppointmentSystem.entity.User;
import com.example.MedicineAppointmentSystem.repository.MedicationRepository;
import com.example.MedicineAppointmentSystem.repository.UserRepository;

import java.util.Collections;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(MedicationController.class)
public class MedicationControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserRepository userRepo;

    @MockBean
    private MedicationRepository medicationRepo;

    @Test
    @WithMockUser(username = "doctor1", roles = {"DOCTOR"})
    void testAssignFormLoads() throws Exception {
        when(userRepo.findAll()).thenReturn(Collections.emptyList());

        mockMvc.perform(get("/medications/assign"))
                .andExpect(status().isOk())
                .andExpect(view().name("medication_form"))
                .andExpect(model().attributeExists("medication"))
                .andExpect(model().attributeExists("patients"));
    }

    @Test
    @WithMockUser(username = "patient1", roles = {"PATIENT"})
    void testPatientViewMedications() throws Exception {
        User patient = new User();
        patient.setId(1L);
        patient.setUsername("patient1");

        when(userRepo.findByUsername("patient1")).thenReturn(patient);
        when(medicationRepo.findByPatientId(1L)).thenReturn(Collections.emptyList());

        mockMvc.perform(get("/medications/my"))
                .andExpect(status().isOk())
                .andExpect(view().name("medications"))
                .andExpect(model().attributeExists("medications"));
    }

    @Test
    @WithMockUser(username = "doctor1", roles = {"DOCTOR"})
    void testDoctorViewMedications() throws Exception {
        User doctor = new User();
        doctor.setId(2L);
        doctor.setUsername("doctor1");

        when(userRepo.findByUsername("doctor1")).thenReturn(doctor);
        when(medicationRepo.findByDoctorId(2L)).thenReturn(Collections.emptyList());

        mockMvc.perform(get("/medications/doctor"))
                .andExpect(status().isOk())
                .andExpect(view().name("medications"))
                .andExpect(model().attributeExists("medications"));
    }
}
