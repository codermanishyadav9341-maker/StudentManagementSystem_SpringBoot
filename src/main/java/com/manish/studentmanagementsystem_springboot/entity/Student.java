package com.manish.studentmanagementsystem_springboot.entity;

import java.sql.Date;
public class Student {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String email;
    private String phone;
    private String address;
    private Date dateOfBirth;
    private Date admissionDate;
    private String course;
    private Double fee;
    private String status;
    private String createdAt;
    private String updatedAt;

    //Default constructor;
    public Student(){}

    //Parameterised constructor;
    public Student(int id,String name,int age,String gender,String email,String phone,String address,
                   Date dateOfBirth,Date admissionDate,String course,double fee,String status,String createdAt,
                   String updatedAt){

    }
}
