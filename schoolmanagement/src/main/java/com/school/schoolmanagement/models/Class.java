package com.school.schoolmanagement.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;

@Entity
public class Class {

    @Id
    private int class_id;
    private String class_name;
    private int session_id;

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public int getSession_id() {
        return session_id;
    }

    public void setSession_id(int session_id) {
        this.session_id = session_id;
    }

    @Override
    public String toString() {
        return "Class{" +
                "class_id=" + class_id +
                ", class_name=" + class_name +
                ", session_id=" + session_id +
                '}';
    }

}
