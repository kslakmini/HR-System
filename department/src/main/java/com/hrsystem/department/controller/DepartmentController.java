package com.hrsystem.department.controller;

import com.hrsystem.department.exception.DepartmentNotFoundException;
import com.hrsystem.department.model.Department;
import com.hrsystem.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

//creating a department
    @PostMapping("/department")
    Department newDepartment(@RequestBody Department newDepartment) {
        return departmentRepository.save(newDepartment);
    }
//getting all the created departments as a list
    @GetMapping("/departments")
    List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }
//getting a department by getting it with  own id.
    @GetMapping("/department/{id}")
    Department getDepartmentById(@PathVariable Long id) {
        return departmentRepository.findById(id)
                .orElseThrow(() -> new DepartmentNotFoundException(id));

    }

//Editing a department by getting it with own id
    @PutMapping("/department/{id}")
    Department updateDepartment(@RequestBody Department newDepartment, @PathVariable Long id) {
        return departmentRepository.findById(id)
                .map(department -> {
                    department.setName(newDepartment.getName());
                    department.setEmail(newDepartment.getEmail());
                    department.setType(newDepartment.getType());
                    department.setProject(newDepartment.getProject());
                    return departmentRepository.save(department);
                }).orElseThrow(() -> new DepartmentNotFoundException(id));
    }

//deleting a department with it own id


    @DeleteMapping("/department/{id}")
    String deleteDepartment(@PathVariable Long id) {
        if (!departmentRepository.existsById(id)) {
            throw new DepartmentNotFoundException(id);
        }

        departmentRepository.deleteById(id);
        return "Department with ID " + id + " has been deleted successfully.";
    }



}
