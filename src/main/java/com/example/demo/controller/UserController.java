package com.example.demo.controller;

import com.example.demo.entity.LoginUser;
import com.example.demo.entity.Student;
import com.example.demo.repository.AdminRepository;
import com.example.demo.repository.CalendarRepository;
import com.example.demo.repository.LoginUserRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.CertifiedService;
import com.example.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private LoginUserRepository loginUserRepository;
    @Autowired
    private AdminRepository adminRepository;
    @Autowired
    private CalendarRepository calendarRepository;

    private UserService userService;
    private CertifiedService certifiedService;
    public UserController() {
        this.userService = new UserService();
        this.certifiedService = new CertifiedService();
    }

    private static Logger logger = LoggerFactory.getLogger("UserController");

    @RequestMapping(method = RequestMethod.POST, path = "/join")
    public String joinRequest(@RequestBody Student student){
        logger.info("joinRequest");
        userService.join(student ,userRepository,calendarRepository);
        return "OK";
    }
    @PostMapping(value = "/loginUser")
    public LoginUser loginUserRequest(@RequestBody Student student){
        return userService.loginUser(student, userRepository,loginUserRepository,adminRepository,loginUserRepository);
    }
    @GetMapping(value = "/logout")
    public void logoutRequest(@RequestHeader Integer loginUserId){
        certifiedService.isLogin(loginUserId,loginUserRepository);
        userService.logout(loginUserId,loginUserRepository);
    }
}
