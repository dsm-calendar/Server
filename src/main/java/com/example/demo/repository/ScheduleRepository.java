package com.example.demo.repository;

import com.example.demo.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScheduleRepository  extends JpaRepository<Schedule,Integer> {
    public List<Schedule> findByCalendarId(Integer calendarId);
}
