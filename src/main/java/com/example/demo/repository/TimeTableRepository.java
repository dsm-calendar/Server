package com.example.demo.repository;

import com.example.demo.entity.TimeTable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TimeTableRepository extends JpaRepository<TimeTable,Integer> {
    List<TimeTable> findByTimeTableIndexBetween(Integer substring, Integer str2);
}
