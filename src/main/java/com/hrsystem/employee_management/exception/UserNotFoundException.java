package com.hrsystem.employee_management.exception;
import com.hrsystem.employee_management.util.Constants;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id) {
        super(Constants.USER_NOT_FOUND_MESSAGE + id);
    }
}
