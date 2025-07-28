# StudentManagementSystem

A simple **CRUD-based student management system** built with **Java Spring Boot** and **Spring JDBC**. This application allows users to add, update, delete, and view student records via a command-line interface, connected to a relational database.

> 📌 This is an ideal beginner-friendly project to understand Spring Boot, JDBC, Dependency Injection, and MVC layering.



## 🚀 Features

- ➕ Add a new student
- ✏️ Update existing student details
- ❌ Delete a student by ID
- 📄 View all students in the system
- 🧩 Modular architecture following best practices
- ✅ Uses Spring Boot + Spring JDBC + postgreSQL (or any JDBC-supported RDBMS)

---

## 📂 Project Structure

```bash
src/
├── main/
│   ├── java/org/student/
│   │   ├── Main.java                          # Entry point of the application
│   │   ├── model/
│   │   │   └── Student.java                   # Student entity
|   |   |   └── StudentManagementService       # Student management service entity 
│   │   ├── repository/
│   │   │   └── StudentRepository.java         # Data access using JdbcTemplate
│   │   ├── service/
│   │   │   └── StudentService.java            # Business logic layer
│   │   └── utilities/
│   │       ├── DisplayUserCommands.java                 # Displays CLI prompts
│   │       └── UserInputReader.java       # Reads CLI input
│   └── resources/
│       └── application.properties             # DB configuration
└── test/
    └── java/                                  # (Optional) Unit test cases
