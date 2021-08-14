package com.school.schoolmanagement.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Univ_user {

    @Id
    private int user_id;
    private String user_name;
    private String user_password;
    private int user_role_id;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public int getUser_role() {
        return user_role_id;
    }

    public void setUser_role(int user_role_id) {
        this.user_role_id = user_role_id;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_role='" + user_role_id + '\'' +
                '}';
    }
}
