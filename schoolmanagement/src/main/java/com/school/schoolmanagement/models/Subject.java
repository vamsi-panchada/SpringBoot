package com.school.schoolmanagement.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subject {

    @Id
    private int subject_id;
    private String subject_name;
    private int subject_credit;

    @Override
    public String toString() {
        return "Subject{" +
                "subject_id=" + subject_id +
                ", subject_name='" + subject_name + '\'' +
                ", subject_credit=" + subject_credit +
                '}';
    }

    public int getSubject_credit() {
        return subject_credit;
    }

    public void setSubject_credit(int subject_credit) {
        this.subject_credit = subject_credit;
    }

    public int getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(int subject_id) {
        this.subject_id = subject_id;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

}

