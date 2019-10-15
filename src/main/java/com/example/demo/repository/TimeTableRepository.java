package com.example.demo.repository;

import com.example.demo.entity.TimeTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeTableRepository extends JpaRepository<TimeTable,Integer> {
}
