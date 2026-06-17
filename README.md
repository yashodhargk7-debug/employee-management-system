# Employee Management System

A Spring Boot REST API for managing employees with role-based access control.

## Features
- Employee CRUD Operations
- Spring Security Authentication
- Role Based Authorization (ADMIN / USER)
- BCrypt Password Encryption
- H2 Database
- REST APIs

## Tech Stack
- Java 21
- Spring Boot
- Spring Security
- Spring Data JPA
- H2 Database
- Maven

## API Endpoints

### Authentication
POST /auth/register

### Employees
GET /employees
POST /employees
PUT /employees/{id}
DELETE /employees/{id}

<img width="1631" height="958" alt="Screenshot 2026-06-17 070157" src="https://github.com/user-attachments/assets/2a854da6-0b96-4f27-8347-2d04204cfcdf" />


## How to Run

### Prerequisites

- Java 21
- Maven

### Steps

1. Clone the repository

```bash
git clone https://github.com/yashodhargk7-debug/employee-management-system.git
```

2. Navigate to the project folder

```bash
cd employee-management-system
```

3. Run the application

```bash
mvn spring-boot:run
```

4. The application will start on

```text
http://localhost:8081
```

### H2 Database Console

Open:

```text
http://localhost:8081/h2-console
```

Use:

```text
Username: sa
Password:
```

### API Endpoints

#### Authentication

```text
POST /auth/register
```

#### Employees

```text
GET /employees
POST /employees
PUT /employees/{id}
DELETE /employees/{id}
```

## Author
Yashodhar G K
