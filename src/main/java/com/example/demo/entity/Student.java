package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

    @Id
    String id;
    String pw;

    int classOf;
    int iconIndex;
    Integer myCalendarId;

    public Integer getMyCalendarId() {
        return myCalendarId;
    }

    public void setMyCalendarId(Integer myCalendarId) {
        this.myCalendarId = myCalendarId;
    }

    public int getIconIndex() {
        return iconIndex;
    }

    public int getClassOf() {
        return classOf;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw(){return this.pw;}
    public String getId(){return this.id;}
}