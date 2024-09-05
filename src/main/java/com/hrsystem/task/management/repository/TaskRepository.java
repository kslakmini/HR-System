package com.hrsystem.task.management.repository;

import com.hrsystem.task.management.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
