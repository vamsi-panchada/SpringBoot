package com.school.schoolmanagement.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Result {
    @Id
    private int result_id;
    private int student_id;
    private int semester_id;
    private int subject_id;
    private int marks;
    private int grade_point;
    private String grade;

    public int getResult_id() {
        return result_id;
    }

    public void setResult_id(int result_id) {
        this.result_id = result_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getSemester_id() {
        return semester_id;
    }

    public void setSemester_id(int semester_id) {
        this.semester_id = semester_id;
    }

    public int getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(int subject_id) {
        this.subject_id = subject_id;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getGrade_point() {
        return grade_point;
    }

    public void setGrade_point(int grade_point) {
        if (100<=marks & 91>=marks){
            this.grade_point = 10;
            this.grade = "S";
        }
        else if (90<=marks & 86>=marks){
            this.grade_point = 9;
            this.grade = "A+";
        }
        else if (85<=marks & 75>=marks){
            this.grade_point = 8;
            this.grade = "A";
        }
        else if (74<=marks & 66>=marks){
            this.grade_point = 7;
            this.grade = "B";
        }
        else if (65<=marks & 55>=marks){
            this.grade_point = 6;
            this.grade = "C";
        }
        else if (54<=marks & 50>=marks){
            this.grade_point = 5;
            this.grade = "D";
        }
        else if (49<=marks & 0>=marks){
            this.grade_point = 0;
            this.grade = "F";
        }
        else{
            this.grade_point = 0;
            this.grade = "Absent";
        }
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
//        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Result{" +
                "result_id=" + result_id +
                ", student_id=" + student_id +
                ", semester_id=" + semester_id +
                ", subject_id=" + subject_id +
                ", marks=" + marks +
                ", grade_point=" + grade_point +
                ", grade='" + grade + '\'' +
                '}';
    }

}
