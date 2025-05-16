# Hibernate Many-to-Many Association Example
This project demonstrates how to implement a **Many-to-Many** relationship between `Students` and `Courses` using Hibernate ORM.

---

## Overview

- A **Student** can enroll in multiple **Courses**.
- A **Course** can have multiple **Students** enrolled.
- The relationship is implemented using a `Set<Courses>` inside the `Students` entity and vice versa (if mapped).
- The project uses Hibernate’s `Session` and `Transaction` API for persistence.

---

## Technologies Used

- Java
- Hibernate ORM
- Jakarta Persistence API (JPA)
- Relational Database (MySQL/PostgreSQL)
- Maven (optional)

---

## Project Structure

src/
├── main/
│ ├── java/com/rocky/app/
│ │ └── LaunchStandardApp.java # Main class to run the application
│ ├── java/com/rocky/model/
│ │ ├── Students.java # Student entity with Many-to-Many mapping
│ │ └── Courses.java # Course entity
│ └── resources/
│ └── hibernate.cfg.xml # Hibernate configuration file
|
