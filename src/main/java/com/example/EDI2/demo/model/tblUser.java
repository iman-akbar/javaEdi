package com.example.EDI2.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class tblUser {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer userid;

    private String namalengkap;

    private String username;
    private String password;
    private String status;

    public tblUser() {
    }

    public tblUser(Integer userid, String username, String namalengkap, String password, String status) {
        super();
        this.userid = userid;
        this.username = username;
        this.namalengkap = namalengkap;
        this.namalengkap = password;
        this.namalengkap = status;
    }

    public Integer getId() {
        return userid;
    }

    public void setId(Integer userid) {
        this.userid = userid;
    }

    public String getName() {
        return namalengkap;
    }

    public void setName(String namalengkap) {
        this.namalengkap = namalengkap;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
