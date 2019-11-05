package com.example.demo.controller;

import com.example.demo.entity.TimeTable;
import com.example.demo.repository.AdminRepository;
import com.example.demo.repository.LoginUserRepository;
import com.example.demo.repository.TimeTableRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.CertifiedService;
import com.example.demo.service.TimeTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TimeTableController {
    @Autowired
    private LoginUserRepository loginUserRepository;
    @Autowired
    private AdminRepository adminRepository;
    @Autowired
    private TimeTableRepository timeTableRepository;
    @Autowired
    private UserRepository userRepository;

    private TimeTableService timeTableService;
    private CertifiedService certifiedService;

    public TimeTableController() {
        this.timeTableService = new TimeTableService();
        this.certifiedService = new CertifiedService();
    }

    @PostMapping(value = "/timeTable/updateTimeTable")
    public List<TimeTable> updateTimeTableRequest(@RequestHeader Integer loginUserId, @RequestBody List<TimeTable> timeTable){
        certifiedService.isLogin(loginUserId,loginUserRepository,userRepository,adminRepository);
        certifiedService.isAdmin(loginUserRepository.findById(loginUserId),adminRepository);

        return timeTableService.updateTimeTable(timeTable,timeTableRepository);
    }
    @GetMapping(value = "/timeTable/readAllTimeTable")
    public List<TimeTable> readAllTimeTableRequest(@RequestHeader Integer loginUserId){
        certifiedService.isLogin(loginUserId,loginUserRepository,userRepository,adminRepository);
        return timeTableService.readAllTimeTable(timeTableRepository);

    }
}