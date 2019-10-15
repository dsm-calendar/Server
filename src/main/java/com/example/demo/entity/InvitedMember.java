package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class InvitedMember {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer invitedUserId;

    String userId;
    Integer roomId;

    public Integer getInvitedUserId() {
        return invitedUserId;
    }

    public String getUserId() {
        return userId;
    }

    public Integer getRoomId() {
        return roomId;
    }
}
