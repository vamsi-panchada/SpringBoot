package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {


    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student vamsi = new Student(
                    "vamsi",
                    LocalDate.of(2001, Month.DECEMBER, 12),
                    "vamsivs58@gmail.com"
            );
            Student jack = new Student(
                    "jack",
                    LocalDate.of(2004, Month.APRIL, 12),
                    "jack8@gmail.com"
            );
            repository.saveAll(
                    List.of(vamsi, jack)
            );
        };
    }
}
