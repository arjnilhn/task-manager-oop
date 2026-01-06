package org.example.taskmanager.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProjectTest {

    @Test
    void getUpcomingTasks_shouldReturnOnlyNotCompletedTasks() {
        Project project = new Project("Test Project");

        Task t1 = new Task(1, "T1", Priority.LOW,
                new Deadline(LocalDate.now().plusDays(1)));

        Task t2 = new Task(2, "T2", Priority.MEDIUM,
                new Deadline(LocalDate.now().plusDays(2)));

        project.addTask(t1);
        project.addTask(t2);

        t1.markCompleted();

        List<Task> upcoming = project.getUpcomingTasks();

        assertEquals(1, upcoming.size());
        assertEquals(2, upcoming.get(0).getId());
    }
}

