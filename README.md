# Task & Project Management Tool

A console-based Java application for creating tasks and organizing them under projects.  
This project was developed for the Object-Oriented Programming course and demonstrates OOP principles, UML diagrams, GitHub workflow, and unit testing.

## Features
- Create tasks with title, priority, and deadline
- Assign tasks to projects
- Mark tasks as completed
- View upcoming (not completed) tasks
- Show simple deadline-based notifications

## OOP Concepts
- **Encapsulation:** `Task` encapsulates `Deadline` and `Priority`
- **Inheritance:** `TimedTask` extends `Task`
- **Interface:** `Completable` is implemented by `Task`

## UML
- Class diagram: `docs/uml/class-diagram.png`
- Use case diagram: `docs/uml/usecase-diagram.png`
- PlantUML use case source: `docs/use-case.puml`

## How to Run
Run the `Main` class:
- `src/main/java/org/example/taskmanager/app/Main.java`

A console menu will appear.

## How to Test
JUnit 5 tests are under `src/test/java`.

Run with Maven:
```bash
mvn test


