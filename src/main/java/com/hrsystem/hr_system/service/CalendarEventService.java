package com.hrsystem.hr_system.service;

import com.hrsystem.hr_system.model.CalendarEvent;
import com.hrsystem.hr_system.repository.CalendarEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class CalendarEventService {
    @Autowired
    private CalendarEventRepository calendarEventRepository;

    public List<CalendarEvent> getAllEvents() {
        return calendarEventRepository.findAll();
    }

    public CalendarEvent getEventById(Long id) {
        return calendarEventRepository.findById(id).orElse(null);
    }

    public CalendarEvent createEvent(CalendarEvent event) {
        return calendarEventRepository.save(event);
    }

    public CalendarEvent updateEvent(Long id, CalendarEvent event) {
        if (calendarEventRepository.existsById(id)) {

            return calendarEventRepository.save(event);
        }
        return null;
    }

    public void deleteEvent(Long id) {
        calendarEventRepository.deleteById(id);
    }
}
