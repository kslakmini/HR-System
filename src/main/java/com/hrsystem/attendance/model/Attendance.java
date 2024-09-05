package com.hrsystem.attendance.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long employeeId;
    private LocalDate date;
    private Boolean present;

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

    public void setId(Long id) {
        this.id = id;
    }


}
