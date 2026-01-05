package org.example.taskmanager.model;

public class Notification {

    public static String generateMessage(Task task) {

        if (task == null || !task.hasDeadline()) {
            return "No deadline information.";
        }

        if (task.isOverdue()) {
            return "⚠ Task '" + task.getTitle() + "' is OVERDUE!";
        }

        return "⏰ Task '" + task.getTitle() + "' has an upcoming deadline.";
    }
}
