package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private StudentRepository StudentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.StudentRepository = studentRepository;
    }

    public List<Student> getStudents(){
        return StudentRepository.findAll();
    }

    public void addNewStudent(Student student) {

        Optional<Student> studentOptional = StudentRepository.findStudentByEmail(student.getEmail());

        if(studentOptional.isPresent()){
            throw new IllegalStateException("Email Taken");
        }
        StudentRepository.save(student);
    }
}
