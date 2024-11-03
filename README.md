# User Registration Application

This is a simple user registration application built with Spring Boot and MySQL. The application allows users to register with their details, which are then stored in a MySQL database.

## Features

- User registration with validation
- Password encryption
- RESTful API for user registration
- MySQL database integration

## Prerequisites

- JDK 11 or later
- Maven
- MySQL Server
- Postman or any API testing tool

## Setup

### 1. Clone the Repository

git clone https://github.com/yourusername/user-registration-app.git
cd user-registration-app

### 2. Configure MySQL Database
Create a new database in MySQL:
CREATE DATABASE user_registration;
Update the application.properties file with your MySQL credentials:

## properties
- spring.datasource.url=jdbc:mysql://localhost:3306/user_registration
- spring.datasource.username=your_username
- spring.datasource.password=your_password
- spring.jpa.hibernate.ddl-auto=update
- spring.jpa.show-sql=true

### 3. Build the Application
Make sure you have Maven installed, then run:
mvn clean install

### 4. Run the Application
You can run the application using:
mvn spring-boot:run
Alternatively, you can run the UserRegistrationApplication class directly from your IDE.

### 5. Testing the Registration API
Use Postman or any other API testing tool to send a POST request to register a new user:

## URL:
http://localhost:8080/api/register

Request Body:
json
{
    "username": "john_doe",
    "email": "john@example.com",
    "password": "password123"
}
Response:
json
{
    "message": "User registered successfully!"
}

## Database Schema
The application uses the following schema for the users table:
sql
CREATE TABLE users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    email VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

# Dependencies
- Spring Web
- Spring Data JPA
- Spring Security
- MySQL Driver


# License
This project is licensed under the MIT License - see the LICENSE file for details.

# Contributing
Feel free to fork the repository and submit a pull request. Any contributions are welcome!

# Acknowledgements
- Spring Boot Documentation
- MySQL Documentation
- sql

Feel free to adjust any sections or add additional information specific to your project!

