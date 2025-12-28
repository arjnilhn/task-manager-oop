# Design Overview

This project is developed using Object-Oriented Programming principles.

## Planned Classes
- Task: Represents a basic task
- TimedTask: Extends Task with deadline functionality
- Deadline: Encapsulates due date validation
- Project: Groups tasks under a project
- User: Owns projects
- Notification: Represents reminders and alerts

## OOP Principles Used
- Encapsulation: Deadlines and priorities are private and controlled
- Inheritance: TimedTask extends Task
- Interface: Completable interface for task completion
- Polymorphism: Tasks are handled via the base Task type
