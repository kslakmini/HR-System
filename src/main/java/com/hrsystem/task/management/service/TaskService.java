package com.hrsystem.task.management.service;

import com.hrsystem.task.management.model.Task;

import java.util.List;
import java.util.Optional;

public interface TaskService {
    List<Task> getAllTasks();

    Optional<Task> findById(Long id);

    Task save(Task task);

    Task updateTask(Long id, Task updatedTask);

    void deleteById(Long id);
}
