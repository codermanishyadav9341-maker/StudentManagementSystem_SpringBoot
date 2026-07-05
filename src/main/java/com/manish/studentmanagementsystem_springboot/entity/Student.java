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

        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.admissionDate = admissionDate;
        this.course = course;
        this.fee = fee;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    //------------------Getter && Setter-----------------------------------------;
    public void setId(int id){
        if(id >= 0){
            this.id = id;
        }
         else{
             System.out.println("Id cannot be negative");
        }
    }

    public Integer getId(){
        return id;
    }

    public void setName(String name){
        if(name == null){
            this.name = name;
        }
         else{
             System.out.println("Name is not empty");
        }
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        if(age >= 0  && age < 100){
            this.age = age;
        }
         else{
             System.out.println("Age cannot be negative");
        }
    }

    public Integer getAge(){
        return age;
    }


}
