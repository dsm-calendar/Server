package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer eventId;

    String eventPoster;
    String eventDetail;
    String startDate;
    String endDate;
    Boolean eventStatus;

    public Event(String eventPoster, String eventDetail, String startDate, String endDate, Boolean eventStatus) {
        this.eventPoster = eventPoster;
        this.eventDetail = eventDetail;
        this.startDate = startDate;
        this.endDate = endDate;
        this.eventStatus = eventStatus;
    }

    public void setEventStatus(Boolean eventStatus) {
        this.eventStatus = eventStatus;
    }

    public Integer getEventId() {
        return eventId;
    }

    public String getEventPoster() {
        return eventPoster;
    }

    public String getEventDetail() {
        return eventDetail;
    }

    public String getStartDate() {
        return startDate;
    }

    public Boolean getEventStatus() {
        return eventStatus;
    }

    public String getEndDate() {
        return endDate;
    }

    public Event() {
    }
}
