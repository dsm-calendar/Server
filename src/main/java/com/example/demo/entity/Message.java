package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer messageId;

    Boolean isHaveDialog;
    String toUserId;
    Date sendDateNow;
    Integer roomId;
    Integer eventId;
    int type;

    public Message(Boolean isHaveDialog, String toUserId, Date sendDateNow, Integer roomId, Integer eventId, int type) {
        this.isHaveDialog = isHaveDialog;
        this.toUserId = toUserId;
        this.sendDateNow = sendDateNow;
        this.roomId = roomId;
        this.eventId = eventId;
        this.type = type;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public Boolean getHaveDialog() {
        return isHaveDialog;
    }

    public Date getSendDateNow() {
        return sendDateNow;
    }

    public Integer getEventId() {
        return eventId;
    }

    public int getType() {
        return type;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public String getToUserId() {
        return toUserId;
    }

    public Message() {
    }
}
