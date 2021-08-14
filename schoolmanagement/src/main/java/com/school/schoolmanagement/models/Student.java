package com.school.schoolmanagement.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
public class Student {

    @Id
    private int student_id;
    private int class_id;
    private String student_name;
    private String student_email;
    private Date student_dob;
    private int student_age;
    private String student_contact;
    private String student_gender;

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_email() {
        return student_email;
    }

    public void setStudent_email(String student_email) {
        this.student_email = student_email;
    }

    public Date getStudent_dob() {
        return student_dob;
    }

    public void setStudent_dob(Date student_dob) {
        this.student_dob = student_dob;
    }

    public int getStudent_age() {
        return student_age;
    }

    public void setStudent_age(int student_age) {

        this.student_age = Period.between(student_dob.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), LocalDate.now()).getYears();
    }

    public String getStudent_contact() {
        return student_contact;
    }

    public void setStudent_contact(String student_contact) {
        this.student_contact = student_contact;
    }

    public String getStudent_gender() {
        return student_gender;
    }

    public void setStudent_gender(String student_gender) {
        this.student_gender = student_gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", class_id=" + class_id +
                ", student_name='" + student_name + '\'' +
                ", student_email='" + student_email + '\'' +
                ", student_dob=" + student_dob +
                ", student_age=" + student_age +
                ", student_contact='" + student_contact + '\'' +
                ", student_gender='" + student_gender + '\'' +
                '}';
    }

}
