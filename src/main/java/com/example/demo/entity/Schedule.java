package com.example.demo.entity;



import javax.persistence.*;

@Entity
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer scheduleId;

    String scheduleTitle;
    @Column(name = "calendar_id")
    Integer calendarId;
    String startDate;
    String endDate;
    String scheduleContent;
    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setSchedule(String scheduleTitle, Integer calendarId, String startDate, String endDate, String scheduleContent) {
        this.scheduleTitle = scheduleTitle;
        this.calendarId = calendarId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.scheduleContent = scheduleContent;
    }

    public Schedule() {
    }

    public Schedule(String scheduleTitle, Integer calendarId, String startDate, String endDate, String scheduleContent) {
        this.scheduleTitle = scheduleTitle;
        this.calendarId = calendarId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.scheduleContent = scheduleContent;
    }

    public String getScheduleTitle() {
        return scheduleTitle;
    }

    public String getScheduleContent() {
        return scheduleContent;
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
}
