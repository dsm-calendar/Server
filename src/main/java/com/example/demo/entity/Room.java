package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer roomId;

    int iconIndex;
    Integer calendarId;

    public Integer getRoomId() {
        return roomId;
    }

    public int getIconIndex() {
        return iconIndex;
    }

    public Integer getCalendarId() {
        return calendarId;
    }
}
