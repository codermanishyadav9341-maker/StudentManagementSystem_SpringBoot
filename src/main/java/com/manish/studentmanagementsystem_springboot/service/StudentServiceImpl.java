package com.manish.studentmanagementsystem_springboot.service;

import com.manish.studentmanagementsystem_springboot.dto.request.StudentRequest;
import com.manish.studentmanagementsystem_springboot.dto.response.StudentResponse;
import com.manish.studentmanagementsystem_springboot.entity.Student;
import com.manish.studentmanagementsystem_springboot.mapper.StudentMapper;
import com.manish.studentmanagementsystem_springboot.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service// @Service annotation batata hai ki ya class service layer ka part hai
        //Spring isko automatically bean bana deta gai
public class StudentServiceImpl implements StudentService{

    private final StudentRepository studentRepository;

    private final StudentMapper studentMapper;

    //Constructor;
    public StudentServiceImpl(StudentRepository studentRepository , StudentMapper studentMapper){
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
    }
    //----------------------------------Save new Student:------------------------------------------
    @Override
    public StudentResponse saveStudent(StudentRequest request){
        Student student = studentMapper.toEntity(request);

        Student saveStudent = studentRepository.save(student);

        return studentMapper.toResponse(saveStudent);
    }

    @Override
    public StudentResponse getStudentById(Long id){

        Student student = studentRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Student does not found with id " +id));
        return studentMapper.toResponse(student);
    }

    @Override
    public StudentResponse getStudentByEmail(String email){

        Student student = studentRepository.findByEmail(email)
                .orElseThrow(() -> new  RuntimeException("Student does not found with email:- " +email));
        return studentMapper.toResponse(student);
    }

}
