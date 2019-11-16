package com.example.demo.entity;

import java.util.List;

public class InRoom {

    List<Schedule> schedules;
    List<RoomMember> roomMembers;
    Room room;

    public InRoom(List<Schedule> schedules, List<RoomMember> roomMembers,Room room) {
        this.schedules = schedules;
        this.roomMembers = roomMembers;
        this.room = room;
    }

    public InRoom() {
    }

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public List<RoomMember> getRoomMembers() {
        return roomMembers;
    }

    public Room getRoom() {
        return room;
    }
}
