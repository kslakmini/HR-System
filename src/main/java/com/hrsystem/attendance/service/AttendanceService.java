package com.hrsystem.attendance.service;

import com.hrsystem.attendance.model.Attendance;

import java.util.List;
import java.util.Optional;

public interface AttendanceService {
    Attendance createAttendance(Attendance attendance);

    Optional<Attendance> getAttendanceById(Long id);

    List<Attendance> getAllAttendances();

    Attendance updateAttendance(Long id, Attendance updatedAttendance);

    void deleteAttendance(Long id);
}
