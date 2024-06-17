# OneHub Engineering REST API

## Overview
OneHub Engineering is a RESTful API built with Spring Boot. This project serves as the backend for managing employee data, providing endpoints for CRUD operations.

## Features
- RESTful API endpoints for managing employees
- Validation of input data
- Error handling
- Integration with a database using Spring Data JPA
- Unit and integration tests

## Technologies Used
- Java 11
- Spring Boot 2.5.2
- Spring Data JPA
- Lombok
- JUnit 5
- Mockito
- Maven

## Prerequisites
Before you begin, ensure you have met the following requirements:
- Java 11 installed
- Maven installed
- A database (e.g., MySQL, PostgreSQL) if not using an embedded database

## Setup
1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/onehub-engineering.git
   cd onehub-engineering

## Configure the database
Update the src/main/resources/application.properties file with your database configuration:

spring.datasource.url=jdbc:mysql://localhost:3306/yourdbname
spring.datasource.username=yourusername
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update

## Build the project

```mvn clean install```

## Run the application

```mvn spring-boot:run```

## Usage

The API provides endpoints for managing employees. Below are the available endpoints:

- Create a new employee
  
```POST /api/employees```

    {
        "employeeNo": "123",
        "firstname": "John",
        "surname": "Doe",
        "email": "john.doe@example.com"
    }

This can be run via postman at http://localhost:8080/api/employees

## Using cURL

- Create a new employee

    ```curl -X POST http://localhost:8080/api/employees -H "Content-Type: application/json" -d '{"employeeNo":"123","firstname":"John","surname":"Doe","email":"john.doe@example.com"}'```



