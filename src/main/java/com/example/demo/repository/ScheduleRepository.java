package com.example.demo.repository;

import com.example.demo.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ScheduleRepository  extends JpaRepository<Schedule,Integer> {

    @Query(value = "select schedule from Schedule schedule where schedule.calendarId = ?1 and schedule.startDate = ?2")
    List<Schedule> findByCalendarIdAndStartDate(Integer calendarId, String date);

    @Query(value = "select schedule from Schedule schedule where schedule.calendarId = ?1 and schedule.startDate <= ?2 and schedule.endDate >= ?3")
    List<Schedule> findByCalendarIdAndStartDateAfterAndEndDateBefore(Integer calendarId, String date, String date1);
    List<Schedule> findByCalendarId(Integer calendarId);

    List<Schedule> findByCalendarIdAndStartDateAndStartDateBetweenAndEndDateBefore(Integer myCalendarId, String date11, String date1, String s, String date);
}
