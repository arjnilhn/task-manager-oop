package org.example.taskmanager.app;

import org.example.taskmanager.model.Task;

public class Main {

    public static void main(String[] args) {
        Task task = new Task(1, "Finish OOP project");

        System.out.println("Task completed? " + task.isCompleted());

        task.markCompleted();

        System.out.println("Task completed? " + task.isCompleted());
    }
}

