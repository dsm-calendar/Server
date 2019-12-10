package com.example.demo.repository;

import com.example.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Student,String> {
    Student findByClassOf(int classOf);

    Student findByIsAdmin(boolean b);
}
