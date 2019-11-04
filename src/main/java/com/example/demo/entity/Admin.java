package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {

        @Id
        String id;

        String pw;

    public String getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }

    public Admin() {
    }
}
