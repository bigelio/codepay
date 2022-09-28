package com.codepay.mycodepay.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String userName;
    private String password;
    private Boolean active;
    private String roles;
    public int getId() {
        return id;
    }
    public String getUserName() {
        return userName;
    }
    public String getPassword() {
        return password;
    }
    public Boolean getActive() {
        return active;
    }
    public String getRoles() {
        return roles;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setActive(Boolean active) {
        this.active = active;
    }
    public void setRoles(String roles) {
        this.roles = roles;
    }

}
