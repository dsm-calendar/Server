package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "loginuser")
public class LoginUser {

    String userId;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer loginUserId;

    public Integer getLoginUserId() {
        return loginUserId;
    }

    public LoginUser(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }
}
