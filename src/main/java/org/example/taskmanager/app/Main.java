package org.example.taskmanager.app;

import org.example.taskmanager.model.Deadline;
import org.example.taskmanager.model.Priority;
import org.example.taskmanager.model.Task;
import org.example.taskmanager.model.TimedTask;
import org.example.taskmanager.model.Project;
import org.example.taskmanager.model.User;
import org.example.taskmanager.model.Notification;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Task task1 = new Task(
                1,
                "Finish OOP project",
                Priority.HIGH,
                new Deadline(LocalDate.now().plusDays(3))
        );

        TimedTask task2 = new TimedTask(
                2,
                "Study for exam",
                Priority.MEDIUM,
                new Deadline(LocalDate.now().plusDays(1)),
                120
        );

        System.out.println("Task 1:");
        System.out.println("Title: " + task1.getTitle());
        System.out.println("Priority: " + task1.getPriority());
        System.out.println("Overdue? " + task1.isOverdue());
        System.out.println("Completed? " + task1.isCompleted());

        System.out.println("\nTask 2 (TimedTask):");
        System.out.println("Title: " + task2.getTitle());
        System.out.println("Priority: " + task2.getPriority());
        System.out.println("Estimated minutes: " + task2.getEstimatedMinutes());

        task1.markCompleted();
        System.out.println("\nTask 1 completed? " + task1.isCompleted());
        Project project = new Project("OOP Final Project");

        project.addTask(task1);
        project.addTask(task2);

        System.out.println("\nUpcoming tasks in project:");
        for (Task t : project.getUpcomingTasks()) {
            System.out.println("- " + t.getTitle());
            User user = new User("jeff");
            user.addProject(project);

            System.out.println("\nUser: " + user.getUsername());
            System.out.println("Projects count: " + user.getProjects().size());
            System.out.println("\nNotifications:");
            System.out.println(Notification.generateMessage(task1));
            System.out.println(Notification.generateMessage(task2));


        }

    }
}

