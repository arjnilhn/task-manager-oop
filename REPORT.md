# OOP Final Project Report
## Task & Project Management Tool

**Course:** Object Oriented Programming  
**Language:** Java  
**Build Tool:** Maven  
**Testing Framework:** JUnit 5

---

## 1. Overview
This project is a console-based Task and Project Management Tool developed to demonstrate object-oriented programming principles. The system allows users to create tasks, organize them under projects, mark tasks as completed, and view upcoming tasks through a simple console menu.

The project follows a structured software development workflow including UML design, unit testing, and version control using Git and GitHub.

---

## 2. Object-Oriented Design
The application is designed using core OOP concepts such as encapsulation, inheritance, and interfaces.

### Encapsulation
The `Task` class encapsulates task-related data such as title, completion status, priority, and deadline. The `Deadline` class encapsulates date-related logic and provides overdue checking functionality.

### Inheritance
The `TimedTask` class extends the `Task` class and adds an additional attribute for estimated completion time, demonstrating inheritance.

### Interface
The `Completable` interface defines common behavior for completable entities. The `Task` class implements this interface to ensure consistent completion logic.

---



