package com.school.schoolmanagement.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Teacher {

    @Id
    private int teacher_id;
    private String teacher_name;
    private String techer_email;
    private String teacher_gender;
    private String teacher_subject_id;
    private Date teacher_join_date;
    private Date teacher_dob;
    private String teacher_contact;

    public int getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public String getTecher_email() {
        return techer_email;
    }

    public void setTecher_email(String techer_email) {
        this.techer_email = techer_email;
    }

    public String getTeacher_gender() {
        return teacher_gender;
    }

    public void setTeacher_gender(String teacher_gender) {
        this.teacher_gender = teacher_gender;
    }

    public String getTeacher_subject_id() {
        return teacher_subject_id;
    }

    public void setTeacher_subject_id(String teacher_subject_id) {
        this.teacher_subject_id = teacher_subject_id;
    }

    public Date getTeacher_join_date() {
        return teacher_join_date;
    }

    public void setTeacher_join_date(Date teacher_join_date) {
        this.teacher_join_date = teacher_join_date;
    }

    public Date getTeacher_dob() {
        return teacher_dob;
    }

    public void setTeacher_dob(Date teacher_dob) {
        this.teacher_dob = teacher_dob;
    }

    public String getTeacher_contact() {
        return teacher_contact;
    }

    public void setTeacher_contact(String teacher_contact) {
        this.teacher_contact = teacher_contact;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacher_id=" + teacher_id +
                ", teacher_name='" + teacher_name + '\'' +
                ", techer_email='" + techer_email + '\'' +
                ", teacher_gender='" + teacher_gender + '\'' +
                ", teacher_subject_id='" + teacher_subject_id + '\'' +
                ", teacher_join_date=" + teacher_join_date +
                ", teacher_dob=" + teacher_dob +
                ", teacher_contact='" + teacher_contact + '\'' +
                '}';
    }

}
