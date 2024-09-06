package com.hrsystem.attendance.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long employeeId;
    private LocalDate date;
    private Boolean present;
    private String status;
    private LocalTime checkInTime;
    private LocalTime checkOutTime;

    public Long getId() {

        return id;
    }
    public Long getEmployeeId() {

        return employeeId;
    }
    public LocalDate getDate() {

        return date;
    }
    public Boolean getPresent() {

        return  present;
    }
    public String getStatus() {

        return status;
    }

    public LocalTime getCheckInTime() {
        return checkInTime;
    }

    public LocalTime getCheckOutTime() {
        return checkOutTime;
    }


    public void setId(Long id) {

        this.id = id;
    }
    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setPresent(Boolean present) {
        this.present = present;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCheckInTime(LocalTime checkInTime) {
        this.checkInTime = checkInTime;
    }

    public void setCheckOutTime(LocalTime checkOutTime) {
        this.checkOutTime = checkOutTime;
    }


}
