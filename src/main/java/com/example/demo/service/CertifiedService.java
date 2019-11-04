package com.example.demo.service;

import com.example.demo.entity.Admin;
import com.example.demo.entity.Calendar;
import com.example.demo.entity.LoginUser;
import com.example.demo.entity.RoomMember;
import com.example.demo.exception.IsNotUserException;
import com.example.demo.exception.NoCertifiedException;
import com.example.demo.exception.NotFoundException;
import com.example.demo.repository.*;

import java.util.Optional;

public class CertifiedService {

    public void isAdmin(Optional<LoginUser> loginUser, AdminRepository adminRepository) {
        Optional<Admin> admin = adminRepository.findById(loginUser.get().getUserId());
        if(admin.isEmpty()){
            throw new NoCertifiedException("No Certified");
        }
    }

    public Optional<RoomMember> isMember(Optional<LoginUser> loginUser, Integer calendarId, RoomMemberRepository roomMemberRepository, RoomRepository roomRepository) {
        Optional<RoomMember> roomMember = roomMemberRepository.findByRoomIdAndUserId(roomRepository.findByCalendarId(calendarId).getRoomId(), loginUser.get().getUserId());
        if(roomMember.isEmpty()){
            throw  new NoCertifiedException(("No Certified"));
        }
        return roomMember;
    }

    public void isHaveMemberRight(Optional<RoomMember> roomMember) {
        if(roomMember.get().getMemberRight()<2){
            throw new NoCertifiedException("No Certified");
        }
    }

    public void isRoomAdmin(int memberRight) {
        if(memberRight<3){
            throw new NoCertifiedException("No Certified");
        }
    }

    public void isMessageUser(Integer loginUserId, LoginUserRepository loginUserRepository, MessageRepository messageRepository, Integer messageId) {
        //System.out.println(loginUserRepository.findById(loginUserId).get().getUserId());
        System.out.println(messageId);
        if(messageRepository.findById(messageId).isEmpty()){
            throw new NotFoundException("Not found");
        }
        System.out.println(messageRepository.findById(messageId).get().getToUserId());
        if(!(messageRepository.findById(messageId).get().getToUserId().equals(loginUserRepository.findById(loginUserId).get().getUserId()))){
            throw new NoCertifiedException("No Certified");
        }
    }

    public void isHaveCalendar(String userId, UserRepository userRepository, Calendar isCalendar) {
        if(!isCalendar.getCalendarId().equals(userRepository.findById(userId).get().getMyCalendarId())){
            throw new NoCertifiedException("No Certified");
        }
    }

    public void isLogin(Integer loginUserId, LoginUserRepository loginUserRepository, UserRepository userRepository, AdminRepository adminRepository) {
        Optional<LoginUser> loginUser = loginUserRepository.findById(loginUserId);
        if(loginUserId==null||loginUserRepository.findById(loginUserId).isEmpty()){
            throw new NoCertifiedException("No Certified");
        }
        if(userRepository.findById(loginUser.get().getUserId()).isEmpty()||adminRepository.findById(loginUser.get().getUserId()).isEmpty()){
            throw new IsNotUserException("is not User");
        }
    }

    /*public void isRoomAdmin(Optional<LoginUser> loginUser, Integer roomId, RoomMemberRepository roomMemberRepository) {
         if(roomMemberRepository.findByUserIdAndRoomId(loginUser.get().getUserId(),roomId).get(0).getMemberRight()>3){
             throw new NoCertifiedException("No Certified");
         }
    }*/
}
