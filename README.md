# 🎓 Student Portal – Spring Boot REST API

A **Student Portal REST API** built using **Spring Boot, Spring Data JPA, and MySQL**.
This application provides RESTful APIs to perform CRUD operations and partial updates on student information.

---

## 🚀 Features

* ➕ Add a new student
* 📋 Get all students
* 🔍 Get student by ID
* 🔎 Search students by first name
* ✏️ Update complete student details
* 🗑️ Delete a student
* 🔄 Partially update student details
* 💾 MySQL database integration
* 🔗 RESTful API architecture
* 🧪 API testing using Postman

---

## 🛠️ Technologies Used

| Technology      | Usage                 |
| --------------- | --------------------- |
| Java 25         | Programming Language  |
| Spring Boot     | Backend Framework     |
| Spring Web      | REST API Development  |
| Spring Data JPA | Database Operations   |
| Hibernate       | ORM                   |
| MySQL           | Database              |
| Maven           | Dependency Management |
| Postman         | API Testing           |
| Git & GitHub    | Version Control       |

---

## 📂 Project Structure

```text
StudentPortal
│
├── src
│   └── main
│       ├── java
│       │   └── com.example.student
│       │       │
│       │       ├── StudentPortalApplication.java
│       │       │
│       │       ├── controller
│       │       │   └── StudentController.java
│       │       │
│       │       ├── service
│       │       │   └── StudentService.java
│       │       │
│       │       ├── repository
│       │       │   └── StudentRepository.java
│       │       │
│       │       └── entity
│       │           └── Student.java
│       │
│       └── resources
│           └── application.properties
│
├── pom.xml
└── README.md
```

---

## 🗄️ Database

The project uses **MySQL** as the database.

### Database Creation

```sql
CREATE DATABASE studentdb;
```

### Student Table

```text
Student
--------------------------------
sid          Primary Key
fname        First Name
lname        Last Name
email        Email
phone        Phone Number
course       Course
city         City
```

---

## ⚙️ Configuration

Configure your MySQL database in:

```text
src/main/resources/application.properties
```

Example:

```properties
server.port=9988

spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

> **Note:** Do not upload your actual database password to GitHub. Use your local password or environment variables.

---

# 🔗 REST API Endpoints

Base URL:

```text
http://localhost:9988
```

---

## 1️⃣ Add Student

### POST

```text
http://localhost:9988/student/ss
```

### Request Body

```json
{
    "fname": "Manikanta",
    "lname": "Reddy",
    "email": "manikanta@gmail.com",
    "phone": "9876543210",
    "course": "Java",
    "city": "Hyderabad"
}
```

This API adds a new student to the database.

---

## 2️⃣ Get All Students

### GET

```text
http://localhost:9988/student/all
```

Returns all student records from the database.

### Example Response

```json
[
    {
        "sid": 1,
        "fname": "Manikanta",
        "lname": "Reddy",
        "email": "manikanta@gmail.com",
        "phone": "9876543210",
        "course": "Java",
        "city": "Hyderabad"
    }
]
```

---

## 3️⃣ Get Student By ID

### GET

```text
http://localhost:9988/student/std/4
```

Returns the student whose `sid` is `4`.

---

## 4️⃣ Get Student By First Name

### GET

```text
http://localhost:9988/student/fname/manikanta
```

Returns student details based on the first name.

---

## 5️⃣ Update Student

### PUT

```text
http://localhost:9988/student/update/3
```

Updates the complete details of the student whose `sid` is `3`.

### Request Body

```json
{
    "fname": "Manikanta",
    "lname": "Reddy",
    "email": "mani@gmail.com",
    "phone": "9999999999",
    "course": "Spring Boot",
    "city": "Hyderabad"
}
```

---

## 6️⃣ Delete Student

### DELETE

```text
http://localhost:9988/student/delete/8
```

Deletes the student whose `sid` is `8`.

---

## 7️⃣ Partial Update Student

### PATCH

```text
http://localhost:9988/student/pu/7
```

Updates only the fields provided in the request body.

### Example

```json
{
    "email": "newemail@gmail.com"
}
```

Another example:

```json
{
    "city": "Bangalore",
    "course": "Spring Boot"
}
```

Only the specified fields are updated.

---

# 📊 API Summary

| Operation         | HTTP Method | Endpoint                 |
| ----------------- | ----------- | ------------------------ |
| Add Student       | `POST`      | `/student/ss`            |
| Get All Students  | `GET`       | `/student/all`           |
| Get Student By ID | `GET`       | `/student/std/{sid}`     |
| Get By First Name | `GET`       | `/student/fname/{fname}` |
| Update Student    | `PUT`       | `/student/update/{sid}`  |
| Delete Student    | `DELETE`    | `/student/delete/{sid}`  |
| Partial Update    | `PATCH`     | `/student/pu/{sid}`      |

---

# 🔄 Application Architecture

```text
                  Client / Postman
                         │
                         ▼
                ┌─────────────────┐
                │   Controller    │
                └────────┬────────┘
                         │
                         ▼
                ┌─────────────────┐
                │     Service     │
                └────────┬────────┘
                         │
                         ▼
                ┌─────────────────┐
                │   Repository    │
                └────────┬────────┘
                         │
                         ▼
                ┌─────────────────┐
                │      MySQL      │
                └─────────────────┘
```

---

# ▶️ How to Run the Project

### Step 1: Clone the Repository

```bash
git clone <your-github-repository-url>
```

### Step 2: Open the Project

Open the project using:

* IntelliJ IDEA
* Eclipse
* Spring Tool Suite
* VS Code

### Step 3: Create MySQL Database

```sql
CREATE DATABASE studentdb;
```

### Step 4: Configure Database

Update:

```text
application.properties
```

with your MySQL username and password.

### Step 5: Run the Application

Run:

```text
StudentPortalApplication.java
```

The application starts at:

```text
http://localhost:9988
```

### Step 6: Test Using Postman

Use the API endpoints listed above to test the application.

---

# 🧪 API Testing

The REST APIs can be tested using **Postman**.

Example:

```text
GET http://localhost:9988/student/all
```

```text
GET http://localhost:9988/student/std/4
```

```text
GET http://localhost:9988/student/fname/manikanta
```

---

# 🔮 Future Enhancements

* Add input validation using `@Valid`
* Add global exception handling
* Add DTOs
* Add pagination and sorting
* Add Swagger/OpenAPI documentation
* Add Spring Security
* Add authentication and authorization
* Add frontend using React or Angular
* Add unit and integration testing

---

# 👨‍💻 Author

**Mahendra Reddy**

---

## ⭐ Project

If you find this project useful, please consider giving it a ⭐ on GitHub.
