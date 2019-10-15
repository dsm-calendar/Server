package com.example.demo.repository;

import com.example.demo.entity.Calendar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CalendarRepository extends JpaRepository<Calendar,Integer> {
    public Optional<Calendar> findByCategory(String category);
}
