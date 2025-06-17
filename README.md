Employee Management API
A Spring Boot-based RESTful API to manage employee records. This project uses Oracle 21c XE as the backend database and demonstrates integration with the Oracle Native Client (OCI) for improved performance and better database feature support.

🔧 Tech Stack
Java 17

Spring Boot 3.5.0

Spring Data JPA

HikariCP

Oracle 21c XE (Connected via Native/OCI driver)

springdoc-openapi (Swagger UI)

📌 Features
Add new employees

View all employees

Update employee details

Delete employees

Auto-generated API documentation (Swagger UI)

Native Oracle OCI driver integration

🚀 Getting Started
Prerequisites
Oracle 21c XE installed and running
Oracle Instant Client installed (for OCI)
Java 17
Maven

# Swagger
springdoc.api-docs.enabled=true
springdoc.swagger-ui.path=/swagger-ui.html

📂 API Endpoints
Method	Endpoint	Description
GET	/employees	List all employees
POST	/employees	Create a new employee
PUT	/employees/{id}	Update an employee
DELETE	/employees/{id}	Delete an employee

Access Swagger UI at:
👉 http://localhost:8080/swagger-ui.html

🧪 Run the App
bash
Copy
Edit
mvn clean install
mvn spring-boot:run
📦 Build & Deploy
To build:

bash
Copy
Edit
mvn clean package
Executable JAR will be located at:

bash
Copy
Edit
target/employeeapi-0.0.1-SNAPSHOT.jar
📁 Repository Structure
css
Copy
Edit
employeeapi/
├── src/main/java/com/example/employeeapi/
│   ├── controller/
│   ├── model/
│   ├── repository/
│   ├── service/
│   └── EmployeeApiApplication.java
├── src/main/resources/
│   └── application.properties
└── pom.xml
✅ Completed Tasks
 Create GET & POST API

 Add PUT & DELETE API

 Integrate Swagger (springdoc-openapi)

 Switch from Thin to Native OCI Driver

 Successfully connect Spring Boot to Oracle via OCI

✍️ Author
Dishita Pant
B.Tech CSE - College of Engineering Roorkee

