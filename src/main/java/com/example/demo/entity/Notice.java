package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Notice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer noticeId;

    String noticeContent;
    String startDate;
    String endDate;

    public Integer getNoticeId() {
        return noticeId;
    }

    public String getNoticeContent() {
        return noticeContent;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }
}
