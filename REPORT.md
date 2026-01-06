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


## 3. Implemented Features

### Minimum Features
- Create task with title, priority, and deadline
- Assign tasks to projects
- Mark tasks as completed
- View upcoming (not completed) tasks

### Optional Features
- Priority levels implemented using an enum
- Deadline-based reminders using a Notification class

---

## 4. UML Diagrams
UML diagrams were created to visualize the system design.

- **Class Diagram:** `docs/uml/class-diagram.png`
- **Use Case Diagram:** `docs/uml/usecase-diagram.png`

The use case was also defined textually using PlantUML in `docs/use-case.puml`.

---

## 5. Unit Testing
Unit tests were written using JUnit 5 to verify the core logic of the application.

- `TaskTest` checks task completion and overdue detection
- `ProjectTest` checks filtering of upcoming tasks

All tests are located under `src/test/java` and can be executed via the IDE or Maven.

---

## 6. How to Run the Application
The application can be run by executing the `Main` class.  
A console menu will appear, allowing the user to interact with the system.

---

## 7. GitHub Workflow
The project was developed incrementally using Git and GitHub.  
Commits were made with meaningful messages, and progress was tracked using a Kanban board created with GitHub Projects.

---

## 8. Conclusion
This project demonstrates a clean object-oriented design combined with basic project management practices. The use of UML diagrams, unit tests, and version control helped ensure clarity, correctness, and maintainability.


