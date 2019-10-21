package com.example.demo.service;

import com.example.demo.entity.Admin;
import com.example.demo.entity.Calendar;
import com.example.demo.entity.LoginUser;
import com.example.demo.exception.NoCertifiedException;
import com.example.demo.repository.AdminRepository;
import com.example.demo.repository.CalendarRepository;
import com.example.demo.repository.LoginUserRepository;
import com.example.demo.repository.RoomMemberRepository;

import java.util.Optional;

public class CertifiedService {

    public void isLogin(Integer loginUserId, LoginUserRepository loginUserRepository) {
        if(loginUserId==null||loginUserRepository.findById(loginUserId).isEmpty()){
            throw new NoCertifiedException("No Certified");
        }
    }

    public void isAdmin(Optional<LoginUser> loginUser, AdminRepository adminRepository) {
        Optional<Admin> admin = adminRepository.findById(loginUser.get().getUserId());
        if(admin.isEmpty()){
            throw new NoCertifiedException("No Certified");
        }
    }

    public void isMember(Optional<LoginUser> loginUser, Integer roomId, RoomMemberRepository roomMemberRepository) {
        if(roomMemberRepository.findByUserIdAndRoomId(loginUser.get().getUserId(),roomId).isPresent()){
            throw new NoCertifiedException("No Certified");
        }
    }
    public void inCalendarIsAdmin(Optional<Calendar> calendar, Optional<LoginUser> loginUser, CalendarRepository calendarRepository, AdminRepository adminRepository){
        if(calendar.get().getCalendarId()==calendarRepository.findByCategory("school").get().getCalendarId()){
            if(adminRepository.findById(loginUser.get().getUserId()).get().getId()!=loginUser.get().getUserId()){
                throw new NoCertifiedException("No Certified");
            }
        }
    }

    public void isRoomAdmin(Optional<LoginUser> loginUser, Integer roomId, RoomMemberRepository roomMemberRepository) {
        if(roomMemberRepository.findByUserId(loginUser.get().getUserId()).get().getMemberRight()!=3){
            throw new NoCertifiedException("No Certified");
        }
    }

    public void isHaveRight(Optional<LoginUser> loginUser, Integer roomId, RoomMemberRepository roomMemberRepository) {
        if(roomMemberRepository.findByUserId(loginUser.get().getUserId()).get().getMemberRight()<2){
            throw new NoCertifiedException("No Certified");
        }
    }
}
