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

    public void setCalendarId(Integer calendarId) {
        this.calendarId = calendarId;
    }

    int iconIndex;
    Integer calendarId;
    String roomTitle;
    public String getRoomTitle() {
        return roomTitle;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public int getIconIndex() {
        return iconIndex;
    }

    public Integer getCalendarId() {
        return calendarId;
    }

    public Room(int iconIndex, Integer calendarId, String roomTitle) {
        this.iconIndex = iconIndex;
        this.calendarId = calendarId;
        this.roomTitle = roomTitle;
    }

    public Room() {
    }
}
