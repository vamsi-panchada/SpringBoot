package com.school.schoolmanagement.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Attednance {

    @Id
    private int attednance_id;
    private int Student_id;
    private Date attednance_date;
    private boolean attednance_status;

    public int getAttednance_id() {
        return attednance_id;
    }

    public void setAttednance_id(int attednance_id) {
        this.attednance_id = attednance_id;
    }

    public int getStudent_id() {
        return Student_id;
    }

    public void setStudent_id(int student_id) {
        Student_id = student_id;
    }

    public Date getAttednance_date() {
        return attednance_date;
    }

    public void setAttednance_date(Date attednance_date) {
        this.attednance_date = attednance_date;
    }

    public boolean isAttednance_status() {
        return attednance_status;
    }

    public void setAttednace_status(boolean attednace_status) {
        this.attednance_status = attednace_status;
    }

    @Override
    public String toString() {
        return "Attednance{" +
                "attednance_id=" + attednance_id +
                ", Student_id=" + Student_id +
                ", attednance_date=" + attednance_date +
                ", attednace_status=" + attednance_status +
                '}';
    }

}
