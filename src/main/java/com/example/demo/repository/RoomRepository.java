package com.example.demo.repository;

import com.example.demo.entity.Room;
import com.example.demo.entity.RoomMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room,Integer> {
    RoomMember findByCalendarId(Integer calendarId);
}
