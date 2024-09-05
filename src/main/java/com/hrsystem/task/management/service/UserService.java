package com.hrsystem.task.management.service;
import com.hrsystem.task.management.model.User;

import java.util.List;
import java.util.Optional;
public interface UserService {
    List<User> getAllUsers();
    Optional<User> findById(Long id);
    User save(User user);
    User updateUser(Long id, User updatedUser);
    void deleteById(Long id);
}
