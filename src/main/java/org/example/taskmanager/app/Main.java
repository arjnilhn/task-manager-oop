package org.example.taskmanager.app;

import org.example.taskmanager.model.*;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        User user = new User("slash");
        Project project = new Project("OOP Final Project");
        user.addProject(project);

        int taskIdCounter = 1;

        while (true) {
            System.out.println("\n--- TASK MANAGER MENU ---");
            System.out.println("1. Create task");
            System.out.println("2. Add task to project");
            System.out.println("3. Mark task as completed");
            System.out.println("4. View upcoming tasks");
            System.out.println("0. Exit");
            System.out.print("Choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                System.out.println("Exiting...");
                break;
            }

            switch (choice) {

                case 1:
                    System.out.print("Task title: ");
                    String title = scanner.nextLine();

                    System.out.print("Priority (LOW/MEDIUM/HIGH): ");
                    Priority priority = Priority.valueOf(scanner.nextLine().toUpperCase());

                    System.out.print("Deadline days from now: ");
                    int days = scanner.nextInt();
                    scanner.nextLine();

                    Task task = new Task(
                            taskIdCounter++,
                            title,
                            priority,
                            new Deadline(LocalDate.now().plusDays(days))
                    );

                    project.addTask(task);
                    System.out.println("Task created and added to project.");
                    break;

                case 2:
                    System.out.println("Tasks already added during creation.");
                    break;

                case 3:
                    System.out.print("Enter task id to complete: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    for (Task t : project.getTasks()) {
                        if (t.getId() == id) {
                            t.markCompleted();
                            System.out.println("Task marked as completed.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("\nUpcoming tasks:");
                    for (Task t : project.getUpcomingTasks()) {
                        System.out.println("- " + t.getId() + ": " + t.getTitle()
                                + " [" + t.getPriority() + "]");
                        System.out.println(Notification.generateMessage(t));
                    }
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}
