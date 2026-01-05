package org.example.taskmanager.model;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String username;
    private List<Project> projects;

    public User(String username) {
        this.username = username;
        this.projects = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void addProject(Project project) {
        if (project != null) {
            projects.add(project);
        }
    }

    public List<Project> getProjects() {
        return projects;
    }

    public Project findProjectByName(String name) {
        for (Project p : projects) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }
}

