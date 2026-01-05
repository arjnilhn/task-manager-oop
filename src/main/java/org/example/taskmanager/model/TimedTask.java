package org.example.taskmanager.model;

public class TimedTask extends Task {

    private int estimatedMinutes;

    public TimedTask(int id,
                     String title,
                     Priority priority,
                     Deadline deadline,
                     int estimatedMinutes) {

        super(id, title, priority, deadline);
        this.estimatedMinutes = estimatedMinutes;
    }

    public int getEstimatedMinutes() {
        return estimatedMinutes;
    }

    public void setEstimatedMinutes(int estimatedMinutes) {
        this.estimatedMinutes = estimatedMinutes;
    }
}
