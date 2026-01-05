package org.example.taskmanager.model;

public class Task implements Completable {

    private final int id;
    private String title;
    private boolean completed;


    private Deadline deadline;
    private Priority priority;

    public Task(int id, String title) {
        this(id, title, Priority.MEDIUM, null);
    }

    public Task(int id, String title, Priority priority, Deadline deadline) {
        this.id = id;
        this.title = title;
        this.priority = (priority == null) ? Priority.MEDIUM : priority;
        this.deadline = deadline;
        this.completed = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Deadline getDeadline() {
        return deadline;
    }

    public void setDeadline(Deadline deadline) {
        this.deadline = deadline;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        if (priority != null) {
            this.priority = priority;
        }
    }

    @Override
    public boolean isCompleted() {
        return completed;
    }

    @Override
    public void markCompleted() {
        this.completed = true;
    }

    public boolean hasDeadline() {
        return deadline != null;
    }

    public boolean isOverdue() {
        return deadline != null && deadline.isOverdue();
    }
}
