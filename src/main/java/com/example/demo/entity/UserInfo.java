package com.example.demo.entity;


public class UserInfo {
    String id;

    int classOf;
    int iconIndex;
    Integer myCalendarId;
    Integer loginUserId;
    Boolean isAdmin;

    public UserInfo(String id, int classOf, int iconIndex, Integer myCalendarId, Integer loginUserId, Boolean isAdmin) {
        this.id = id;
        this.classOf = classOf;
        this.iconIndex = iconIndex;
        this.myCalendarId = myCalendarId;
        this.loginUserId = loginUserId;
        this.isAdmin = isAdmin;
    }


    public String getId() {
        return id;
    }

    public int getClassOf() {
        return classOf;
    }

    public int getIconIndex() {
        return iconIndex;
    }

    public Integer getMyCalendarId() {
        return myCalendarId;
    }

    public Integer getLoginUserId() {
        return loginUserId;
    }
}
