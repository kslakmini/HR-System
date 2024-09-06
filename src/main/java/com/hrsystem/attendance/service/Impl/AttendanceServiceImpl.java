package com.hrsystem.attendance.service.Impl;

import com.hrsystem.attendance.exception.AttendanceNotFoundException;
import com.hrsystem.attendance.model.Attendance;
import com.hrsystem.attendance.repository.AttendanceRepository;
import com.hrsystem.attendance.service.AttendanceService;
import com.hrsystem.attendance.utils.AttendanceConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

@Service
public class AttendanceServiceImpl implements AttendanceService {

    @Autowired
    private AttendanceRepository attendanceRepository;

   @Override
    public Attendance createAttendance(Attendance attendance) {
       // Set default values for new attendance records if not provided
       if (attendance.getStatus() == null) {
           attendance.setStatus(AttendanceConstants.DEFAULT_STATUS);
       }
       if (attendance.getCheckInTime() == null) {
           attendance.setCheckInTime(LocalTime.parse(AttendanceConstants.DEFAULT_CHECK_IN_TIME));
       }
       if (attendance.getCheckOutTime() == null) {
           attendance.setCheckOutTime(LocalTime.parse(AttendanceConstants.DEFAULT_CHECK_OUT_TIME));
       }
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
            // Set default values for missing fields in the updated record
            if (updatedAttendance.getStatus() == null) {
                updatedAttendance.setStatus(AttendanceConstants.DEFAULT_STATUS);
            }
            if (updatedAttendance.getCheckInTime() == null) {
                updatedAttendance.setCheckInTime(LocalTime.parse(AttendanceConstants.DEFAULT_CHECK_IN_TIME));
            }
            if (updatedAttendance.getCheckOutTime() == null) {
                updatedAttendance.setCheckOutTime(LocalTime.parse(AttendanceConstants.DEFAULT_CHECK_OUT_TIME));
            }

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
