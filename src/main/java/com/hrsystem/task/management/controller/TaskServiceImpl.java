package com.hrsystem.task.management.controller;

import com.hrsystem.task.management.model.Task;
import com.hrsystem.task.management.repository.TaskRepository;
import com.hrsystem.task.management.service.TaskService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public List<Task> getAllTasks() {
        // Fetch all tasks from the repository
        return taskRepository.findAll();
    }

    @Override
    public Optional<Task> findById(Long id) {
        // Find task by ID
        return taskRepository.findById(id);
    }

    @Override
    public Task save(Task task) {
        // Save a new task to the repository
        return taskRepository.save(task);
    }

    @Override
    public Task updateTask(Long id, Task updatedTask) {
        // Update the task if it exists
        return taskRepository.findById(id).map(task -> {
            task.setTitle(updatedTask.getTitle());
            task.setAssignee(updatedTask.getAssignee());
            task.setStatus(updatedTask.getStatus());
            task.setDescription(updatedTask.getDescription());
            return taskRepository.save(task);
        }).orElse(null); // Return null if the task doesn't exist
    }

    @Override
    public void deleteById(Long id) {
        // Delete a task by its ID
        taskRepository.deleteById(id);
    }
}
