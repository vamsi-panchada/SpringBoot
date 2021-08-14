package com.school.schoolmanagement.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Semester {

    @Id
    private int Semester_id;
    private String Semester_name;
    private Date Semester_start_date;
    private Date Semester_end_date;

    public int getSemester_id() {
        return Semester_id;
    }

    public void setSemester_id(int semester_id) {
        Semester_id = semester_id;
    }

    public String getSemester_name() {
        return Semester_name;
    }

    public void setSemester_name(String semester_name) {
        Semester_name = semester_name;
    }

    public Date getSemester_start_date() {
        return Semester_start_date;
    }

    public void setSemester_start_date(Date semester_start_date) {
        Semester_start_date = semester_start_date;
    }

    public Date getSemester_end_date() {
        return Semester_end_date;
    }

    public void setSemester_end_date(Date semester_end_date) {
        Semester_end_date = semester_end_date;
    }

    @Override
    public String toString() {
        return "Semester{" +
                "Semester_id=" + Semester_id +
                ", Semester_name='" + Semester_name + '\'' +
                ", Semester_start_date=" + Semester_start_date +
                ", Semester_end_date=" + Semester_end_date +
                '}';
    }
}
