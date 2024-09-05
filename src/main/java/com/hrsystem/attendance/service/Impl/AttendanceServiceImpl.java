package com.hrsystem.attendance.service.Impl;

import com.hrsystem.attendance.exception.AttendanceNotFoundException;
import com.hrsystem.attendance.model.Attendance;
import com.hrsystem.attendance.repository.AttendanceRepository;
import com.hrsystem.attendance.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AttendanceServiceImpl implements AttendanceService {

    @Autowired
    private AttendanceRepository attendanceRepository;

   @Override
    public Attendance createAttendance(Attendance attendance) {
        return attendanceRepository.save(attendance);
    }

    @Override
    public Optional<Attendance> getAttendanceById(Long id) {
        return Optional.ofNullable(attendanceRepository.findById(id)
                .orElseThrow(() -> new AttendanceNotFoundException("Attendance record not found with ID: " + id)));
    }

    @Override
    public List<Attendance> getAllAttendances() {
        return attendanceRepository.findAll();
    }

    @Override
    public Attendance updateAttendance(Long id, Attendance updatedAttendance) {
        if (attendanceRepository.existsById(id)) {
            updatedAttendance.setId(id);
            return attendanceRepository.save(updatedAttendance);
        } else {
            throw new AttendanceNotFoundException("Cannot update. Attendance record not found with ID: " + id);
        }
    }

    @Override
    public void deleteAttendance(Long id) {
        if (attendanceRepository.existsById(id)) {
            attendanceRepository.deleteById(id);
        } else {
            throw new AttendanceNotFoundException("Cannot delete. Attendance record not found with ID: " + id);
        }
    }
}
