# Spring Boot REST API with MongoDB

This project demonstrates a simple REST API built with Spring Boot, using MongoDB as the database. It provides endpoints for managing student data.

## Features

* **CRUD operations for students:** Create, Read, Update, and Delete student records.
* **MongoDB integration:** Uses Spring Data MongoDB for easy interaction with MongoDB.
* **RESTful API:** Exposes API endpoints following RESTful principles.
* **CORS enabled:** Allows cross-origin requests from a specified origin (currently `http://localhost:8080`).

## Technologies Used

* **Spring Boot:** Framework for building stand-alone, production-ready Spring applications.
* **Spring Data MongoDB:** Simplifies data access for MongoDB.
* **MongoDB:** NoSQL document database.
* **Lombok:** Reduces boilerplate code with annotations.

## Prerequisites

* **Java Development Kit (JDK):** Version 17 or higher.
* **MongoDB:**  Installed and running.
* **IDE:**  Such as IntelliJ IDEA or Eclipse.

## Getting Started

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/your-username/your-repository-name.git](https://github.com/your-username/your-repository-name.git)

2.  **Configure MongoDB connection:**

    - Update the `application.properties` or `application.yml` file with your MongoDB connection details (host, port, database name, username, password).

3.  **Build and run the application:**


    ./mvnw spring-boot:run


## API Endpoints

* **GET /api/v1/students:**  Retrieves a list of all students.
* **POST /api/v1/students:** Creates a new student.
* **GET /api/v1/students/{id}:** Retrieves a student by ID.
* **PUT /api/v1/students/{id}:** Updates a student by ID.
* **DELETE /api/v1/students/{id}:** Deletes a student by ID.

## Example Usage

You can use tools like Postman or curl to test the API endpoints.

**Get all students:**

curl http://localhost:8080/api/v1/students

## Contributing

Contributions are welcome\! Feel free to open issues or submit pull requests.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.