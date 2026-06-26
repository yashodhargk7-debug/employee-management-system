Employee Management System

A secure RESTful Employee Management System built using Spring Boot.

------------------------------------------------

Features

✔ JWT Authentication

✔ Role-Based Authorization

✔ CRUD Operations

✔ Spring Security

✔ Spring Data JPA

✔ Exception Handling

✔ DTO Mapping

✔ Validation

✔ H2 Database

------------------------------------------------

Tech Stack

Java

Spring Boot

Spring Security

Spring Data JPA

Hibernate

JWT

Maven

H2 Database

------------------------------------------------

Project Structure

Controller

↓

Service

↓

Repository

↓

Database

------------------------------------------------

Authentication Flow

Login

↓

JWT Generated

↓

Client stores JWT

↓

JWT sent in Authorization Header

↓

Spring Security validates token

↓

Request reaches Controller

------------------------------------------------

API Endpoints

POST /api/auth/login

POST /api/auth/register

GET /api/employees

POST /api/employees

PUT /api/employees/{id}

DELETE /api/employees/{id}

------------------------------------------------

How to Run

1. Clone Repository

2. Open in IntelliJ IDEA

3. Run

4. Open Swagger (later)

------------------------------------------------


Author

Yashodhar G K
