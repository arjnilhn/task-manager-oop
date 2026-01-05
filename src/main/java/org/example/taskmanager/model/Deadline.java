package org.example.taskmanager.model;

import java.time.LocalDate;

public class Deadline {

    private LocalDate dueDate;

    public Deadline(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isOverdue() {
        return LocalDate.now().isAfter(dueDate);
    }
}

