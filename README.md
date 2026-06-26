# 🚀 Employee Management System

> A secure **Employee Management REST API** built using **Spring Boot**, **Spring Security (JWT)**, **Spring Data JPA**, and **Hibernate**. The application enables secure employee management through JWT-based authentication and role-based authorization while following a clean layered architecture.

---

## 📖 Overview

The Employee Management System is a backend REST API designed to demonstrate modern Java backend development practices.

It provides secure authentication, role-based access control, and CRUD operations for employee management while following industry-standard architecture and coding practices.

This project is part of my backend development portfolio and is continuously enhanced with production-ready features.

---

## ✨ Features

### Security

* JWT Authentication
* Role-Based Authorization
* Protected REST APIs
* Stateless Authentication

### Employee Management

* Create Employee
* View Employee
* Update Employee
* Delete Employee

### Backend Features

* Spring Boot REST API
* Spring Data JPA
* Hibernate ORM
* DTO Pattern
* Global Exception Handling
* Validation
* Layered Architecture

---

## 🛠 Tech Stack

| Category        | Technology                 |
| --------------- | -------------------------- |
| Language        | Java 21                    |
| Framework       | Spring Boot                |
| Security        | Spring Security, JWT       |
| ORM             | Spring Data JPA, Hibernate |
| Database        | H2 Database                |
| Build Tool      | Maven                      |
| Testing         | Postman                    |
| Version Control | Git & GitHub               |

---

## 🏛 Architecture

```text
                Client

                   │

              HTTP Request

                   │

       Spring Security Filter

                   │

        JWT Authentication

                   │

             REST Controller

                   │

                Service

                   │

              Repository

                   │

              H2 Database
```

---

## 📂 Project Structure

```text
src
└── main
    ├── java
    │   ├── controller
    │   ├── service
    │   ├── repository
    │   ├── entity
    │   ├── dto
    │   ├── security
    │   ├── config
    │   ├── exception
    │   └── EmployeeManagementApplication
    │
    └── resources
        ├── application.properties
        └── static
```

---

## 🔐 Authentication Flow

```text
User Login
      │
      ▼
Spring Security
      │
      ▼
Authentication Manager
      │
      ▼
JWT Generated
      │
      ▼
Client Stores Token
      │
      ▼
Authorization Header
      │
      ▼
JWT Validation Filter
      │
      ▼
Protected REST API
```

---

## 📡 REST API Endpoints

### Authentication

| Method | Endpoint         | Description       |
| ------ | ---------------- | ----------------- |
| POST   | `/auth/register` | Register User     |
| POST   | `/auth/login`    | Authenticate User |

### Employee APIs

| Method | Endpoint          |
| ------ | ----------------- |
| GET    | `/employees`      |
| GET    | `/employees/{id}` |
| POST   | `/employees`      |
| PUT    | `/employees/{id}` |
| DELETE | `/employees/{id}` |

---

## 🚀 Getting Started

### Clone Repository

```bash
git clone https://github.com/yashodhargk7-debug/employee-management-system.git
```

### Navigate to Project

```bash
cd employee-management-system
```

### Run Application

```bash
mvn spring-boot:run
```

Application runs at

```text
http://localhost:8080
```

---

## 📸 Screenshots

Screenshots will be added after integrating Swagger/OpenAPI and the frontend interface.

---

## 📈 Project Roadmap

### Completed

* ✅ CRUD Operations
* ✅ Spring Security
* ✅ JWT Authentication
* ✅ Role-Based Authorization
* ✅ DTO Pattern
* ✅ Exception Handling
* ✅ Layered Architecture

### Upcoming

* ⏳ Swagger / OpenAPI
* ⏳ OAuth2 Login (Google/GitHub)
* ⏳ PostgreSQL Migration
* ⏳ Logging
* ⏳ Docker
* ⏳ Cloud Deployment
* ⏳ Unit Testing
* ⏳ Integration Testing

---

## 📚 Key Concepts Practiced

* REST API Development
* Spring Boot
* Spring Security
* JWT Authentication
* Spring Data JPA
* Hibernate
* DTO Mapping
* Dependency Injection
* Exception Handling
* Layered Architecture
* Git & GitHub

---

## 👨‍💻 Author

**Yashodhar G K**

Java Backend Developer

GitHub: https://github.com/yashodhargk7-debug

---

## ⭐ Support

If you found this project useful, consider giving it a ⭐ on GitHub.
