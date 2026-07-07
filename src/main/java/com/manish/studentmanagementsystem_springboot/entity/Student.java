package com.manish.studentmanagementsystem_springboot.entity;



import jakarta.persistence.*;
import jakarta.validation.constraints.Positive;

import java.time.LocalDate;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false,length = 15)
    private String name;
    @Column(nullable = false)
    private int age;
    @Column(nullable = false)
    private String gender;
    @Column(unique = true,nullable = false)
    private String email;
    @Column(nullable = false,length = 10)
    private String phone;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private LocalDate dateOfBirth;
    @Column(nullable = false)
    private LocalDate admissionDate;
    @Column(nullable = false)
    private String course;
    @Positive
    private Double fee;
    @Column(nullable = false)
    private String status;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    //Default constructor;
    public Student(){}

    //Parameterised constructor;
    public Student(int id,String name,int age,String gender,String email,String phone,String address,
                   LocalDate dateOfBirth,LocalDate admissionDate,String course,double fee,String status,LocalDate createdAt,
                   LocalDate updatedAt){

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
        if(name != null && !name.trim().isEmpty()){
            this.name = name;
        }
         else{
            throw new IllegalArgumentException("Invalid name");
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
            throw new IllegalArgumentException("Invalid age");
        }
    }

    public Integer getAge(){
        return age;
    }


    public void setGender(String gender){
        if(gender != null &&
                (gender.equalsIgnoreCase("Male")||
                 gender.equalsIgnoreCase("Female")||
                gender.equalsIgnoreCase("Other"))){
            this.gender = gender;
        }
         else{
            throw new IllegalArgumentException("Invalid gender");
        }
    }

    public String getGender(){
        return gender;
    }

    public void setEmail(String email){
        if(email != null && email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")){
            this.email = email;
        }
        else{
           throw new IllegalArgumentException("Invalid email");
        }
    }

    public String getEmail(){
        return email;
    }

    public void setPhone(String phone){
        if(phone != null && phone.matches("\\d{10}")){
            this.phone = phone;
        }
         else{
             System.out.println("Invalid phone number");
        }
    }

    public String getPhone(){
        return phone;
    }

    public void setAddress(String address){
        if(address != null && !address.trim().isEmpty()){
            this.address = address;
        }
         else{
             System.out.println("Invalid address");
        }
    }

    public String getAddress(){
        return address;
    }

    public void setDateOfBirth(LocalDate dateOfBirth){
        if(dateOfBirth != null && !dateOfBirth.isAfter(LocalDate.now())){
            this.dateOfBirth = dateOfBirth;
        }
         else{
             System.out.println("Invalid date of birth;");
        }
    }

    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }

    public void setAdmissionDate(LocalDate admissionDate){
        if(admissionDate != null && !admissionDate.isAfter(LocalDate.now())){
            this.admissionDate = admissionDate;
        }
         else{
             System.out.println("Invalid admissionDate");
        }
    }

    public LocalDate getAdmissionDate(){
        return admissionDate;
    }

    public void setCourse(String course){
        if(course != null && !course.trim().isEmpty()){
            this.course = course;
        }
         else{
             System.out.println("Invalid course");
        }
    }

    public String getCourse(){
        return course;
    }

    public void setFee(double fee){
        if(fee >= 0){
            this.fee = fee;
        }
         else{
             System.out.println("Invalid fee");
        }
    }

    public Double getFee(){
        return fee;
    }

    public void setStatus(String status){
        if(status != null && (status.equalsIgnoreCase("Active")
        || status.equalsIgnoreCase("Inactive"))) {
            this.status = status;
        }
        else{
            throw new IllegalArgumentException("Invalid status");
        }
    }

    public String getStatus(){
        return status;
    }

    public void setCreatedAt(LocalDate createdAt){
        this.createdAt =createdAt;
    }

    public LocalDate getCreatedAt(){
        return createdAt;
    }

    public void setUpdatedAt(LocalDate updatedAt){
        this.updatedAt = updatedAt;
    }

    public LocalDate getUpdatedAt(){
        return updatedAt;
    }
}
