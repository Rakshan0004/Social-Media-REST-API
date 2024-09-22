
# Social Media REST API

A brief description of what this project does and who it's for

Social Media REST API
Overview
This project is a REST API for a social media platform, built using Java Spring Boot and MySQL. It provides functionalities for user management and post creation, and it leverages Spring Security for authentication. The API allows CRUD operations on resources such as users and posts, making it an ideal backend service for a social media application.

# Features

- **User Management**: Create, retrieve, update, and delete users.

- **Post Management**: Create, retrieve, update, and delete posts for users.

- **Validation**: Input validation using annotations.

- **Spring Security**: Basic authentication implementation for securing API endpoints.

- **Error Handling**: Custom error messages for various exceptions like user not found.

- **Database Integration**: Integrated with MySQL to store user and post data.

# Technologies Used

Java 17

Spring Boot 3.3.3

Spring Security

JPA (Java Persistence API)

MySQL

Maven

Jackson (for JSON processing)

Endpoints

User Endpoints

GET /users: Retrieve all users.

GET /users/{id}: Retrieve a specific user by ID.

POST /users: Create a new user.

PUT /users/{id}: Update an existing user.

DELETE /users/{id}: Delete a user.

Post Endpoints

GET /users/{id}/posts: Retrieve all posts for a user.

POST /users/{id}/posts: Create a new post for a user.

GET /users/{userId}/posts/{postId}: Retrieve a specific post for a user.

DELETE /users/{userId}/posts/{postId}: Delete a specific post.

Installation and Setup

Prerequisites

Java 17+

Maven 3.6+

MySQL Server

Steps to Run Locally

- **Clone the Repository:**


bash

**git clone https:**//github.com/yourusername/social-media-api.git

cd social-media-api

Configure MySQL Database:

**Update the application.properties file located in the src/main/resources folder with your MySQL database details.  **


bash
mvn clean install
mvn spring-boot:run
Access the API: The API will be available at http://localhost:8080.

**Testing**
You can test the API endpoints using tools like Postman or Talend API Tester.
 Below is an example for creating a new user:


POST /users

Content-Type: application/json

{

  "name": "John Doe",

  "birthdate": "1995-05-15"

}

- **Future Enhancements :** - 

-Add OAuth2 authentication.

-Implement pagination for large data sets.

-Enhance error handling with detailed HTTP status codes.

-Add support for file uploads (e.g., profile pictures).
