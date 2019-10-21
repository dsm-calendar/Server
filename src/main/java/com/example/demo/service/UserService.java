package com.example.demo.service;

import com.example.demo.entity.Calendar;
import com.example.demo.entity.LoginUser;
import com.example.demo.entity.Student;
import com.example.demo.exception.NotFoundException;
import com.example.demo.exception.NotPwException;
import com.example.demo.exception.UserIsExistsException;
import com.example.demo.repository.AdminRepository;
import com.example.demo.repository.CalendarRepository;
import com.example.demo.repository.LoginUserRepository;
import com.example.demo.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

public class UserService {
    private static Logger logger = LoggerFactory.getLogger(UserService.class);

    public Student join(Student student, UserRepository userRepository, CalendarRepository calendarRepository) {
        logger.info("student: {}", student);
        if(!userRepository.findById(student.getId()).isEmpty()){
            throw new UserIsExistsException("user is already exists");
        }
        Calendar calendar = new Calendar("student");
        Calendar myCalendar = calendarRepository.save(calendar);
        student.setMyCalendarId(myCalendar.getCalendarId());

        return userRepository.save(student);
    }

    public String logout(Integer loginUserId, LoginUserRepository loginUserRepository){
        Optional<LoginUser> u = loginUserRepository.findById(loginUserId);
        loginUserRepository.delete(u.get());
        return "Success logout";
    }

    public LoginUser loginUser(Student student, UserRepository userRepository, LoginUserRepository loginUserRepository, AdminRepository adminRepository, LoginUserRepository loginUserRepository1) {
        Optional<Student> u = userRepository.findById(student.getId());
        if(!u.isPresent()){
            if(!adminRepository.findById(student.getId()).isPresent())
                throw new NotFoundException("user not exists");
        }

        if(!u.get().getPw().equals(student.getPw())){
            //pw not true
            throw  new NotPwException("it is not pw");
        }

        return loginUserRepository.save(new LoginUser(u.get().getId()));
    }

}