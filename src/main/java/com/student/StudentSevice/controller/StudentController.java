package com.student.StudentSevice.controller;

import com.student.StudentSevice.controller.dto.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    List<Student> students=List.of(
            new Student("Rahul","1","10","A","Delhi","1234567890","kdkkd@gmail.com","12/10/1990"),
            new Student("Rohit","2","10","B","Mumbai","1234567890","sdfd@gmail.com","12/10/1990"),
            new Student("Raj","3","10","C","Pune","1234567890","ldlfd@gmail.com","12/10/1990"));

    @RequestMapping("/students")
    public List<Student> getStudent() {
        return students;
    }
}
