package com.example.demo.student;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Component
public class StudentService {

    public List<Student> getStudent()
    {
        return List.of(new Student(1L, "Aryan Sarkar", "aryan@gmail.com", LocalDate.of(2000, Month.JANUARY, 5), 21));
    }
}
