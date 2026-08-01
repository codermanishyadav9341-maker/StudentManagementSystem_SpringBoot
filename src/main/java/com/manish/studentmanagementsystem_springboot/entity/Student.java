package com.manish.studentmanagementsystem_springboot.entity;



import jakarta.persistence.*;
import jakarta.validation.constraints.Positive;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "students")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 15)
    private String name;
    @Column(nullable = false)
    private int age;
    @Column(nullable = false)
    private String gender;
    @Column(unique = true, nullable = false)
    private String email;
    @Column(nullable = false, length = 10)
    private String phone;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private Date dateOfBirth;
    @Column(nullable = false)
    private Date admissionDate;
    @Column(nullable = false)
    private String course;
    @Positive
    private Double fee;
    @Column(nullable = false)
    private String status;
    private Date createdAt;
    private Date updatedAt;


    public Date getDateOfBirth(){
        return dateOfBirth;
    }

    public Date getAdmissionDate(){
        return admissionDate;
    }
}
