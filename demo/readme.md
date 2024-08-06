# Spring Boot MVC, Security, and Spring Data JPA Project

This project demonstrates a basic Spring Boot application with MVC, security (JWT-based authentication), and Spring Data JPA. It includes entities for `Student` and `Subject` and supports basic CRUD operations with role-based security.

## Requirements

- JDK 19+
- Maven


Build the Project: 
	mvn clean install
	

Run the Project:
	mvn spring-boot:run


Access the H2 Console:

URL: http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:testdb
User Name: sa
Password: password



Endpoints: 

Authentication-
	POST /authenticate
		Authenticate user and get JWT token
		Request Body:	
		{
  		"username": "admin",
  		"password": "admin123"
		}


Response Body:

{
  "jwt": "token"
}

Students:
POST /students

Create a new student
Request Body:

{
  "name": "John Doe",
  "address": "123 Main St",
  "subjects": [{"name": "Math"}]
}
Headers:
Authorization: Bearer <jwt-token>
GET /students

Get list of all students
Headers:
Authorization: Bearer <jwt-token>


Subjects:
GET /subjects
Get list of all subjects
Headers:
Authorization: Bearer <jwt-token>


Security:
This project uses JWT-based authentication with two roles: student and admin.

Default Users:
admin:
Username: admin
Password: admin123
Role: ROLE_ADMIN
student:
Username: student
Password: student123
Role: ROLE_STUDENT

(I tried working on SECURITY part, but was unable to execute it , apart from that everything is working from my side. )