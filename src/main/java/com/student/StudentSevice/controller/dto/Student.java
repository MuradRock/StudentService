package com.student.StudentSevice.controller.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    private String rollNo;
    private String className;
    private String section;
    private String address;
    private String contactNo;
    private String email;
    private String dob;
}
