package com.hrsystem.department.exception;

public class DepartmentNotFoundException extends RuntimeException{

    public DepartmentNotFoundException(Long id){
        super("Could not find the department with id "+id);
    }
}
