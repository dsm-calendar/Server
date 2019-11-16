package com.example.demo.entity;

import java.util.List;

public class InMain {
    List<Event> eventList;
    List<Notice>notices;
    List<TimeTable> timeTables;

    public InMain(List<Event> eventList, List<Notice> notices, List<TimeTable> timeTables) {
        this.eventList = eventList;
        this.notices = notices;
        this.timeTables = timeTables;
    }
}
