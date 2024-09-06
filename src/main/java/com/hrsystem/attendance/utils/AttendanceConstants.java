package com.hrsystem.attendance.utils;

public class Constants {
    // Database column names
    public static final String ATTENDANCE_TABLE = "attendance";
    public static final String EMPLOYEE_ID_COLUMN = "employee_id";
    public static final String DATE_COLUMN = "date";
    public static final String STATUS_COLUMN = "status";
    public static final String CHECK_IN_TIME_COLUMN = "check_in_time";
    public static final String CHECK_OUT_TIME_COLUMN = "check_out_time";

    // Error messages
    public static final String ERROR_ATTENDANCE_NOT_FOUND = "Attendance record not found.";
    public static final String ERROR_INVALID_EMPLOYEE_ID = "Invalid Employee ID provided.";
    public static final String ERROR_DATE_INVALID = "Invalid date format. Please use YYYY-MM-DD.";
    public static final String ERROR_DUPLICATE_ATTENDANCE = "Attendance record for this date already exists.";

    // Success messages
    public static final String SUCCESS_ATTENDANCE_CREATED = "Attendance record created successfully.";
    public static final String SUCCESS_ATTENDANCE_UPDATED = "Attendance record updated successfully.";
    public static final String SUCCESS_ATTENDANCE_DELETED = "Attendance record deleted successfully.";

    // Validation messages
    public static final String VALIDATION_EMPLOYEE_ID_REQUIRED = "Employee ID is required.";
    public static final String VALIDATION_DATE_REQUIRED = "Date is required.";
    public static final String VALIDATION_STATUS_REQUIRED = "Attendance status is required.";

    // API Endpoints
    public static final String API_BASE_PATH = "/api/v1/attendance";
    public static final String API_GET_ALL = "/all";
    public static final String API_GET_BY_ID = "/{id}";
    public static final String API_CREATE = "/create";
    public static final String API_UPDATE = "/update/{id}";
    public static final String API_DELETE = "/delete/{id}";

    // General constants
    public static final String DATE_FORMAT = "yyyy-MM-dd";
}
