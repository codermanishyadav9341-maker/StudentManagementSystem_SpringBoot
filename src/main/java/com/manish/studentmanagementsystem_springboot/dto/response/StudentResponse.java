package com.manish.studentmanagementsystem_springboot.dto.response;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table
public class StudentResponse {

    private Long id;
    private String name;
    private Integer age;
    private String gender;
    private String address;
    private String email;
    private String phone;
    private LocalDate dateOfBirth;
    private LocalDate admissionDate;
    private String course;
    private Double fee;
    private String status;
    private LocalDate createdAt;
    private LocalDate updateAt;
}
