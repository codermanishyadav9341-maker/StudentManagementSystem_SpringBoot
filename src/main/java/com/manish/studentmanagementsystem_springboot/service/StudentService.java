package com.manish.studentmanagementsystem_springboot.service;

import com.manish.studentmanagementsystem_springboot.dto.request.StudentRequest;
import com.manish.studentmanagementsystem_springboot.dto.response.StudentResponse;
import java.util.List;
public interface StudentService {


    StudentResponse saveStudent(StudentRequest request);

    StudentResponse getStudentById(Long id);

    StudentResponse getStudentByEmail(String email);


    List<StudentResponse> getAllStudents();

    StudentResponse updateStudent(Long id,StudentResponse request);

    void deleteStudent(Long id);
}
