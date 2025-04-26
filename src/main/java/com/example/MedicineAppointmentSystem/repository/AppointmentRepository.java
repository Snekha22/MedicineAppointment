package com.example.MedicineAppointmentSystem.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MedicineAppointmentSystem.entity.Appointment;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    List<Appointment> findByPatientId(Long id);
    List<Appointment> findByDoctorId(Long id);
}