
package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RoomMember {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer memberId;

    String userId;
    Integer roomId;

    public Integer getMemberId() {
        return memberId;
    }

    public String getUserId() {
        return userId;
    }

    public Integer getRoomId() {
        return roomId;
    }
}