package com.manish.studentmanagementsystem_springboot.service;

import com.manish.studentmanagementsystem_springboot.dto.request.StudentRequest;
import com.manish.studentmanagementsystem_springboot.dto.response.StudentResponse;
import java.util.List;
public interface StudentService {

//======================Save Student=====================================
    StudentResponse saveStudent(StudentRequest request);

    //=======================Student Search by Id================================
    StudentResponse getStudentById(Long id);

    //=======================Student Search by email==================================
    StudentResponse getStudentByEmail(String email);

//================================View All Student=====================================
    List<StudentResponse> getAllStudents();

    //===========================Update Student=====================================
    StudentResponse updateStudent(Long id,StudentRequest request);

    //================================Delete Student==================================
    void deleteStudent(Long id);
}
