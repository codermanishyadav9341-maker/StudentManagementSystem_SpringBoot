package com.manish.studentmanagementsystem_springboot.dto.response;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table
public class StudentResponse {

    private int id;
    private String name;
    private int age;
    private String gender;
    private String address;
    private String email;
    private String phone;
    private Date dateOfBirth;
    private Date admissionDate;
    private String course;
    private Double fee;
    private String status;
    private Date createdAt;
    private Date updateAt;
}
