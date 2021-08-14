package com.school.schoolmanagement.service;

import com.school.schoolmanagement.models.*;
import com.school.schoolmanagement.models.Class;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class AppService{

    JdbcTemplate jdbcTemplate;

    @Autowired
    public AppService(DataSource dataSource){
        jdbcTemplate = new JdbcTemplate(dataSource);
    }


    public void addAttednance(Attednance attednance) {
        String query = "INSERT INTO attednance(attednace_id, attednace_date, attednance_status, student_id) VALUES (nextval('attednance_sequence'),?,?,?);";
        jdbcTemplate.update(query, new Object[]{attednance.getAttednance_date(),attednance.isAttednance_status(),attednance.getStudent_id()});
    }


    public void addClass(Class classes) {
        String query = "INSERT INTO class(class_id, class_name, session_id) values(nextval('class_sequence'),?,?);";
        jdbcTemplate.update(query, new Object[]{classes.getClass_name(), classes.getSession_id()});
    }


    public void addResult(Result result) {
        String query = "INSERT INTO result(result_id, grade, grade_point, marks, semester_id, student_id, subject_id) values (nextval('result_sequence'),?,?,?,?,?,?);";
        jdbcTemplate.update(query, new Object[]{result.getGrade(), result.getGrade_point(), result.getMarks(), result.getSemester_id(), result.getStudent_id(), result.getSubject_id()});
    }


    public void addSemester(Semester semester) {
        String query = "INSERT INTO semester(semester_id, semester_name, semester_start_date, semester_end_date) values (nextval('semester_sequence'),?,?,?);";
        jdbcTemplate.update(query, new Object[]{semester.getSemester_name(), semester.getSemester_start_date(), semester.getSemester_end_date()});
    }


    public void addSession(Session session) {
        String query = "INSERT INTO session(session_id, session_name) values(nextval('session_sequence'),?);";
        jdbcTemplate.update(query, new Object[] {session.getSession_name()});
    }


    public void addSubject(Subject subject) {
        String query = "INSERT INTO subject(subject_id, subject_name, subject_credit) values(nextval('subject_sequence'),?,?);";
        jdbcTemplate.update(query, new Object[]{subject.getSubject_name(), subject.getSubject_credit()});
    }


    public void addStudent(Student student) {
        String query = "INSERT INTO student(student_id, class_id, student_age, student_dob, student_contact, student_email, student_gender, student_name), values(nextval('student_sequence'),?,?,?,?,?,?,?);";
        jdbcTemplate.update(query, new Object[]{student.getClass_id(), student.getStudent_age(), student.getStudent_dob(), student.getStudent_contact(), student.getStudent_email(), student.getStudent_gender(), student.getStudent_name()});
    }


    public void addTeacher(Teacher teacher) {
        String query = "INSERT INTO teacher(teacher_id, teacher_contact, teacher_dob, teacher_gender, teacher_join_date, teacher_subject_id, teacher_name, teacher_email) values(nextval('teacher_sequence'),?,?,?,?,?,?,?);";
        jdbcTemplate.update(query, new Object[]{teacher.getTeacher_contact(), teacher.getTeacher_dob(), teacher.getTeacher_gender(), teacher.getTeacher_join_date(),teacher.getTeacher_subject_id(), teacher.getTeacher_name(), teacher.getTecher_email()});
    }


    public void addUser(Univ_user user) {
        String query = "INSERT INTO univ_user(user_id, user_name, user_password, user_role_id) values(?,?,?,?);";
        jdbcTemplate.update(query, new Object[] {user.getUser_id(), user.getUser_name(), user.getUser_password(), user.getUser_role()});
    }


    public List<Univ_user> checkUser(String user_name, String password, int role_id) {
        String query = "select user_name, user_password, user_role_id from univ_user where user_name = '"+ user_name + "' and user_password = '"+password+ "' and user_role_id = "+role_id+ ";";
        List users = jdbcTemplate.queryForList(query);
        return users;
    }


    public List<Univ_user> getAllUsers() {
        String query = "select  * from univ_user;";
        List users = jdbcTemplate.queryForList(query);
        return users;
    }


    public List<Role> getAllRoles() {
        String query = "select * from role;";
        List roles = jdbcTemplate.queryForList(query);
        return roles;
    }


    public List<Session> getAllSessions() {
        String query = "select * from session;";
        List sessions = jdbcTemplate.queryForList(query);
        return sessions;
    }


    public List<Subject> getAllSubjects() {
        String query = "select * from subject;";
        List students = jdbcTemplate.queryForList(query);
        return students;
    }


    public List<Class> getAllClasses() {
        String query = "select * from class;";
        List classes = jdbcTemplate.queryForList(query);
        return classes;
    }


    public List<Student> getAllStudents() {
        String query = "select * from student;";
        List students = jdbcTemplate.queryForList(query);
        return students;
    }


    public List<Teacher> getAllTeachers() {
        String query = "select * from teacher;";
        List teachers = jdbcTemplate.queryForList(query);
        return teachers;
    }


    public List<Attednance> getDailyAttednance(int class_id, int session_id) {
        String query = "select student_id, student_name from student s where class_id = "+class_id+" and session_id = "+session_id+" order by student_id;";
        List attednances =  jdbcTemplate.queryForList(query);
        return attednances;
    }


    public List<Semester> getAllSemester() {
        String query = "select * from semester;";
        List semesters = jdbcTemplate.queryForList(query);
        return semesters;
    }


    public List<Result> getResultById(int Student_id, int Semester_id) {
        String query = "SELECT s.student_name , c.class_name , sub.subject_name , sem.semester_name , r.marks , r.grade_point , r.grade "
                + "FROM result r , student s , class c , semester sem , subject sub , session sess "
                + "where r.student_id = s.student_id "
                + "and sem.semester_id = r.semester_id "
                + "and c.class_id = s.class_id "
                + "and sub.subject_id = r.subject_id "
                + "and s.session_id = sess.session_id "
                + "and r.student_id = " + Student_id + " "
                + " and r.semester_id = " + Semester_id + " "
                + " order by sub.subject_id asc";;
        List results = jdbcTemplate.queryForList(query);
        return results;
    }


    public List<Student> getStudentById(int student_id) {
        String query = "select * from student where student_id = "+student_id+" ;";
        List students = jdbcTemplate.queryForList(query);
        return students;
    }


    public List<Semester> getSemesterById(int Semester_id) {
        String query = "select * from semester where semester_id = "+Semester_id+" ;";
        List semester = jdbcTemplate.queryForList(query);
        return semester;
    }


    public List<Teacher> getTeacherById(int Teacher_id) {
        String query = "select * from teacher where teacher_id = "+Teacher_id+" ;";
        List teachers = jdbcTemplate.queryForList(query);
        return teachers;
    }


    public List<Attednance> getAttednaceById(int Student_id) {
        String query = "select * from attednance where student_id = "+Student_id+" ;";
        List attednances = jdbcTemplate.queryForList(query);
        return attednances;
    }
}
