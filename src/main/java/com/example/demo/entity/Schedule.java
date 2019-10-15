package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer scheduleId;

    Integer calendarId;

    public Integer getScheduleId() {
        return scheduleId;
    }

    public Integer getCalendarId() {
        return calendarId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setCalendarId(Integer calendarId) {
        this.calendarId = calendarId;
    }

    public String getEndDate() {
        return endDate;
    }

    String startDate;
    String endDate;
}
