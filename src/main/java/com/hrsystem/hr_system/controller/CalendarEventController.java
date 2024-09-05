package com.hrsystem.hr_system.controller;

import com.hrsystem.hr_system.model.CalendarEvent;
import com.hrsystem.hr_system.service.CalendarEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class CalendarEventController {
    @Autowired
    private CalendarEventService calendarEventService;

    @GetMapping
    public List<CalendarEvent> getAllEvents() {
        return calendarEventService.getAllEvents();
    }

    @GetMapping("/{id}")
    public CalendarEvent getEventById(@PathVariable Long id) {
        return calendarEventService.getEventById(id);
    }

    @PostMapping
    public CalendarEvent createEvent(@RequestBody CalendarEvent event) {
        return calendarEventService.createEvent(event);
    }

    @PutMapping("/{id}")
    public CalendarEvent updateEvent(@PathVariable Long id, @RequestBody CalendarEvent event) {
        return calendarEventService.updateEvent(id, event);
    }

    @DeleteMapping("/{id}")
    public void deleteEvent(@PathVariable Long id) {
        calendarEventService.deleteEvent(id);
    }
}