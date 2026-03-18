 College Attendance Portal (SQL-Based)

A web-based **College Attendance Management System** developed using **HTML, CSS, JavaScript, Java (Servlet), and MySQL**.
This project focuses on efficiently recording and managing student attendance with data stored and handled using an SQL database.

-- Project Overview

The **College Attendance Portal** is designed to simplify attendance tracking in colleges.
It provides a user-friendly dashboard where attendance can be marked and stored directly in a **MySQL database**, ensuring structured and reliable data management.

-- Features

*  Mark attendance (Present / Absent)
*  SQL-based data storage using MySQL
*  Fast backend processing with Java Servlets
*  Colorful and interactive dashboard UI
*  Basic attendance summary display

-- Technologies Used

*  Frontend: HTML, CSS, JavaScript
*  Backend: Java (Servlet)
*  Database: MySQL (SQL-based)
*  Server: Apache Tomcat
*  IDE: VS Code

-- Database Configuration

```sql
CREATE DATABASE attendance_db;

USE attendance_db;

CREATE TABLE attendance (
    name VARCHAR(50),
    regno VARCHAR(20),
    status VARCHAR(10)
);
```

-- Setup Instructions

1. Install Java JDK, MySQL, and Apache Tomcat
2. Clone this repository
3. Configure database credentials in `AttendanceServlet.java`
4. Add MySQL Connector JAR file to project
5. Deploy project on Tomcat server
6. Run in browser:
   http://localhost:8080/attendance-portal/dashboard.html

-- Output

* User-friendly attendance dashboard
* Attendance data stored in SQL database
* Instant confirmation after submission
