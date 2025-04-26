package com.example.MedicineAppointmentSystem.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MedicineAppointmentSystem.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}