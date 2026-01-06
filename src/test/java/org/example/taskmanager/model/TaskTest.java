package org.example.taskmanager.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void markCompleted_shouldSetCompletedTrue() {
        Task task = new Task(1, "Test task", Priority.MEDIUM, null);

        assertFalse(task.isCompleted());
        task.markCompleted();
        assertTrue(task.isCompleted());
    }

    @Test
    void isOverdue_shouldReturnTrueWhenDeadlineInPast() {
        Task task = new Task(
                2,
                "Past deadline task",
                Priority.HIGH,
                new Deadline(LocalDate.now().minusDays(1))
        );

        assertTrue(task.isOverdue());
    }
}

