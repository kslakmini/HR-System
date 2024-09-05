package com.hrsystem.task.management.model;

/**
 * It includes details such as the task ID, title, assignee, status,
 * description, and priority.
 */
public class Task {
    private Long id;

    /**
     * The title of the task.
     */
    private String title;

    /**
     * The person to whom the task is assigned.
     */
    private String assignee;

    /**
     * The current status of the task.
     */
    private String status;

    /**
     * A detailed description of the task.
     */
    private String description;

    /**
     * The priority level of the task (e.g., high, medium, low).
     */
    private String priority;

    /**
     * Default constructor.
     * Initializes a new instance of the {@code Task} class.
     */
    public Task() {}

    /**
     * Parameterized constructor.
     * Initializes a new instance of the {@code Task} class with the specified details.
     * @param id The unique identifier for the task.
     * @param title The title of the task.
     * @param assignee The person to whom the task is assigned.
     * @param status The current status of the task.
     * @param description A detailed description of the task.
     * @param priority The priority level of the task.
     */
    public Task(Long id, String title, String assignee, String status, String description, String priority) {
        this.id = id;
        this.title = title;
        this.assignee = assignee;
        this.status = status;
        this.description = description;
        this.priority = priority;
    }

    /**
     * Gets the unique identifier for the task.
     * @return The unique identifier for the task.
     */
    public Long getId() { return id; }

    /**
     * Sets the unique identifier for the task.
     * @param id The unique identifier for the task.
     */
    public void setId(Long id) { this.id = id; }

    /**
     * Gets the title of the task.
     * @return The title of the task.
     */
    public String getTitle() { return title; }

    /**
     * Sets the title of the task.
     * @param title The title of the task.
     */
    public void setTitle(String title) { this.title = title; }

    /**
     * Gets the person to whom the task is assigned.
     * @return The assignee of the task.
     */
    public String getAssignee() { return assignee; }

    /**
     * Sets the person to whom the task is assigned.
     * @param assignee The assignee of the task.
     */
    public void setAssignee(String assignee) { this.assignee = assignee; }

    /**
     * Gets the current status of the task.
     * @return The status of the task.
     */
    public String getStatus() { return status; }

    /**
     * Sets the current status of the task.
     * @param status The status of the task.
     */
    public void setStatus(String status) { this.status = status; }

    /**
     * Gets a detailed description of the task.
     * @return The description of the task.
     */
    public String getDescription() { return description; }

    /**
     * Sets a detailed description of the task.
     * @param description The description of the task.
     */
    public void setDescription(String description) { this.description = description; }

    /**
     * Gets the priority level of the task.
     * @return The priority of the task.
     */
    public String getPriority() { return priority; }

    /**
     * Sets the priority level of the task.
     * @param priority The priority of the task.
     */
    public void setPriority(String priority) { this.priority = priority; }
}
