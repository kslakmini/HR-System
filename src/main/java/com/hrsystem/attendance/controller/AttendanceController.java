package com.hrsystem.attendance.controller;

import com.hrsystem.attendance.service.Impl.AttendanceServiceImpl;
import com.hrsystem.attendance.model.Attendance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/attendances")
public class AttendanceController {

    @Autowired
    private AttendanceServiceImpl attendanceService;

    // Create a new attendance record
    @PostMapping
    public ResponseEntity<Attendance> createAttendance(@RequestBody Attendance attendance) {
        Attendance newAttendance = attendanceService.createAttendance(attendance);
        return ResponseEntity.ok(newAttendance);
    }

    // Get a specific attendance record by ID
    @GetMapping("/{id}")
    public ResponseEntity<Attendance> getAttendanceById(@PathVariable Long id) {
        Optional<Attendance> attendance = attendanceService.getAttendanceById(id);
        return attendance.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Get all attendance records
    @GetMapping
    public List<Attendance> getAllAttendances() {
        return attendanceService.getAllAttendances();
    }

    // Update an existing attendance record by ID
    @PutMapping("/{id}")
    public ResponseEntity<Attendance> updateAttendance(
            @PathVariable Long id,
            @RequestBody Attendance updatedAttendance) {
        Attendance attendance = attendanceService.updateAttendance(id, updatedAttendance);
        if (attendance != null) {
            return ResponseEntity.ok(attendance);
        }
        return ResponseEntity.notFound().build();
    }

    // Delete an attendance record by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAttendance(@PathVariable Long id) {
        attendanceService.deleteAttendance(id);
        return ResponseEntity.noContent().build();
    }
}
