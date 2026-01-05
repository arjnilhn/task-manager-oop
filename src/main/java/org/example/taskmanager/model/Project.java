package org.example.taskmanager.model;

import java.util.ArrayList;
import java.util.List;

public class Project {

    private String name;
    private List<Task> tasks;

    public Project(String name) {
        this.name = name;
        this.tasks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addTask(Task task) {
        if (task != null) {
            tasks.add(task);
        }
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public List<Task> getUpcomingTasks() {
        List<Task> upcoming = new ArrayList<>();
        for (Task task : tasks) {
            if (!task.isCompleted()) {
                upcoming.add(task);
            }
        }
        return upcoming;
    }
}
