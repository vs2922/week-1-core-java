package models;

public class Task {
    private String taskId;
    private String description;
    private String assignee;
    private boolean isCompleted;

    public Task(String taskId, String description, String assignee, boolean isCompleted) {
        this.taskId = taskId;
        this.description = description;
        this.assignee = assignee;
        this.isCompleted = isCompleted;
    }

    public void markAsComplete() {
        this.isCompleted = true;
        System.out.println("Task " + taskId + " marked as completed.");
    }

    @Override
    public String toString() {
        return "Task ID: " + taskId + ", Description: " + description + ", Assignee: " + assignee + ", Completed: " + isCompleted;
    }
}