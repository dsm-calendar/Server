package com.example.demo.service;

import com.example.demo.entity.LoginUser;
import com.example.demo.entity.Student;
import com.example.demo.repository.UserRepository;

import java.util.Optional;

public class MyPageService {

    public Student updateIndex(Student student, UserRepository userRepository, Optional<LoginUser> loginUser) {
        Student user = userRepository.findById(loginUser.get().getUserId()).get();
        user.setIconIndex(student.getIconIndex());
        return userRepository.save(user);
    }
}
