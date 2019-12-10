package com.example.demo.repository;

import com.example.demo.entity.InvitedMember;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface InvitedMemberRepository extends JpaRepository<InvitedMember,Integer>{

    List<InvitedMember> findByRoomId(Integer roomId);

    Optional<InvitedMember> findByRoomIdAndUserId(Integer roomId, String userId);
}
