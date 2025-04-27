## 🏥 Medicine Appointment System

A complete Spring Boot application for managing patient registrations, appointments, and medicines.
It provides role-based access (admin, patient, doctor), appointment scheduling, medication management, and API documentation with Swagger.

---
## ✨ Features

- Patient registration and login

- Admin management dashboard

- Book, view, update, and cancel appointments

- Manage medication records

- Role-based authentication and authorization

- Pastel-themed frontend UI (Thymeleaf + Tailwind CSS)

- API Documentation with Swagger UI

- Unit and integration testing

---

## 🛠️ Tech Stack

- Backend: Spring Boot, Spring Security, Spring Data JPA

- Frontend: Thymeleaf, Tailwind CSS

- Database: MySQL

- API Documentation: Swagger (Springfox)

- Testing: JUnit, Mockito

---

## 📂 Project Structure

```
src/main/java/com/medicineappointmentsystem
├── controller
│   ├── AppointmentController.java
│   ├── AuthController.java
│   └── MedicationController.java
├── model
│   ├── Appointment.java
│   ├── Medication.java
│   └── User.java
├── repository
│   ├── AppointmentRepository.java
│   ├── MedicationRepository.java
│   └── UserRepository.java
├── service
│   ├── AppointmentService.java
│   ├── MedicationService.java
│   └── UserService.java
├── config
│   └── SecurityConfig.java
└── MedicineAppointmentSystemApplication.java
```
Frontend templates:
```
src/main/resources/templates
├── login.html
├── register.html
├── dashboard.html
├── appointment_list.html
├── appointment_form.html
├── medication_list.html
├── medication_form.html
```

---
## 🚀 Getting Started
## Prerequisites

- Java 17+

- Maven

- MySQL Server
  
---

## Database Setup

Create a database named:
```
CREATE DATABASE medicine_appointment_system;
```

Update application.properties:
```
spring.datasource.url=jdbc:mysql://localhost:3306/medicine_appointment_system
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
springdoc.api-docs.enabled=true
```
---

## Run the App
```
# Build the project
mvn clean install

# Run the project
mvn spring-boot:run
```

## Visit:

- Frontend: ``` http://localhost:8080/```

- Swagger API Docs:``` http://localhost:8080/swagger-ui/index.html ```

---

## 🔒 Authentication

- Roles: ADMIN, PATIENT, DOCTOR

- JWT Authentication (optional depending on config)

- Passwords are securely encoded using BCrypt
---

## 📃 API Documentation

- Auto-generated with Swagger.

- Available at:
```http://localhost:8080/swagger-ui/index.html```
---

## Output

![Screenshot 2025-04-27 090507](https://github.com/user-attachments/assets/973b6720-b621-4787-99d3-6ecfff22d44f)

![image](https://github.com/user-attachments/assets/a522a91d-efe4-4a71-8704-44ca35198d61)

![Screenshot 2025-04-27 090540](https://github.com/user-attachments/assets/3de5e084-224e-40d5-a1b1-bcc82470f567)

![Screenshot 2025-04-27 090610](https://github.com/user-attachments/assets/0421a58f-1c23-40ac-88d5-3723fc9a8c0d)

![image](https://github.com/user-attachments/assets/c9ace4b0-230a-493a-a03d-6d9aea66b656)

![image](https://github.com/user-attachments/assets/f3b4d72a-ce6e-481c-837b-74434cb9b178)

![image](https://github.com/user-attachments/assets/14168d0e-44ce-4151-b5c1-2004be745e53)

![image](https://github.com/user-attachments/assets/d78c2b9b-f113-4afe-8aa2-9a5ed1b569f9)

![image](https://github.com/user-attachments/assets/551db9b3-9aa1-4d29-bb5c-f50f5c6bc418)

![image](https://github.com/user-attachments/assets/6fde0134-7473-4498-8c59-ca9d24dd1e7d)

![image](https://github.com/user-attachments/assets/a60c209d-8e81-4358-b08e-8073353c49ea)




















