package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer messageId;

    String messageText;

    int isHaveDialog;
    String toUserId;
    String fromWho;

    public Integer getMessageId() {
        return messageId;
    }

    public String getMessageText() {
        return messageText;
    }

    public int getIsHaveDialog() {
        return isHaveDialog;
    }

    public String getToUserId() {
        return toUserId;
    }

    public String getFromWho() {
        return fromWho;
    }
}
