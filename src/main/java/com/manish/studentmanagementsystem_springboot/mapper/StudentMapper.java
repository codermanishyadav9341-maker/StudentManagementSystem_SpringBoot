package com.manish.studentmanagementsystem_springboot.mapper;

// Import request DTO (Client se data recieve karne ke liya use hota hai);
import com.manish.studentmanagementsystem_springboot.dto.request.StudentRequest;
//Import Response DTO (Client ko data return karne ke liya use hota hai);
import com.manish.studentmanagementsystem_springboot.dto.response.StudentResponse;
//Import Student entity (DataBase table);
import com.manish.studentmanagementsystem_springboot.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper { // StudentMapper-> dto or entity ke beech data convert karne ke liya use hota hai
    
    // StudentRequest DTO ko student entity me convert karta hai
    //Is method ka use new student save karne se phle hota hai;
    
    public static Student toEntity(StudentRequest request){

        if(request == null){
            return null;
        }
        Student student = new Student();
        
        //DTO se entity me data set karna
        
        student.setName(request.getName());
        student.setEmail(request.getEmail());
        student.setPhone(request.getPhone());
        student.setCourse(request.getCourse());
        student.setAge(request.getAge());
        student.setAddress(request.getAddress());
        student.setGender(request.getGender());
        student.setDateOfBirth(request.getDateOfBirth());
        student.setAdmissionDate(request.getAdmissionDate());
        student.setFee(request.getFee());
        student.setStatus(request.getStatus());
        
        return student;
    }
    
    //Student entity ko studentResponse DTO me convert karta hai
    //Is method ka use clint ko response bhejne ke liya use hota hai;
    
    public static StudentResponse toResponse(Student student){

        if(student == null){
            return null;
        }
        StudentResponse response = new StudentResponse();
        
        //Entity se DTO me data set karna
        
        response.setId(student.getId());
        response.setName(student.getName());
        response.setEmail(student.getEmail());
        response.setPhone(student.getPhone());
        response.setCourse(student.getCourse());
        response.setAge(student.getAge());
        response.setGender(student.getGender());
        response.setAddress(student.getAddress());
        response.setDateOfBirth(student.getDateOfBirth());
        response.setAdmissionDate(student.getAdmissionDate());
        response.setFee(student.getFee());
        response.setStatus(student.getStatus());
        
        return response;

    }
}
