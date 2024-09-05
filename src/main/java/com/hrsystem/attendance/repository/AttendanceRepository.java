package com.hrsystem.attendance.repository;

import com.hrsystem.attendance.model.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {



    @Override
    List<Attendance> findAll();
}
