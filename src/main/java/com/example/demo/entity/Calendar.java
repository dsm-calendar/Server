package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Calendar {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer calendarId;

    String category;

    public Integer getCalendarId() {
        return calendarId;
    }

    public Calendar() {

    }

    public String getCategory() {
        return category;
    }
}
