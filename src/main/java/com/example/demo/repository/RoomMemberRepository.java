package com.example.demo.repository;

import com.example.demo.entity.RoomMember;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoomMemberRepository extends JpaRepository<RoomMember, Integer> {
    Optional<RoomMember> findByUserIdAndRoomId(String userId, Integer roomId);
}
