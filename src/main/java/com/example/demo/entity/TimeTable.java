package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TimeTable {
    @Id
    Integer timeTableIndex;

    String subject;

    public Integer getTimeTableIndex() {
        return timeTableIndex;
    }

    public String getSubject() {
        return subject;
    }
}
