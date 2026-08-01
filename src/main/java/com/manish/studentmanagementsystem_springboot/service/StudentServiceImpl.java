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

    //==========================================Constructor============================================
    public StudentServiceImpl(StudentRepository studentRepository , StudentMapper studentMapper){
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
    }
    //====================================Save Student====================================================
    @Override
    public StudentResponse saveStudent(StudentRequest request){
        Student student = studentMapper.toEntity(request);

        Student saveStudent = studentRepository.save(student);

        return studentMapper.toResponse(saveStudent);
    }
//==============================Student Search by Id========================================================
    @Override
    public StudentResponse getStudentById(Long id){

        Student student = studentRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Student does not found with id " +id));
        return studentMapper.toResponse(student);
    }
// ===============================Student Search by Email=================================================
    @Override
    public StudentResponse getStudentByEmail(String email){

        Student student = studentRepository.findByEmail(email)
                .orElseThrow(() -> new  RuntimeException("Student does not found with email:- " +email));
        return studentMapper.toResponse(student);
    }
//======================================View All Students==================================================
    @Override
    public List<StudentResponse> getAllStudents(){

        List<Student> students = studentRepository.findAll();

        return studentMapper.toResponseList(students);

    }
//==========================================Update Student==================================================
    @Override
    public StudentResponse updateStudent(Long id,StudentRequest request){

        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student does not found with id " +id));


        student.setName(request.getName());
        student.setAge(request.getAge());
        student.setGender(request.getGender());
        student.setEmail(request.getEmail());
        student.setPhone(request.getPhone());
        student.setAddress(request.getAddress());
        student.setDateOfBirth(request.getDateOfBirth());
        student.setAdmissionDate(request.getAdmissionDate());
        student.setCourse(request.getCourse());
        student.setFee(request.getFee());
        student.setStatus(request.getStatus());


        Student updateStudent = studentRepository.save(student);

        return StudentMapper.toResponse(updateStudent);

    }
//===============================================Delete Student============================================
    @Override
    public void deleteStudent(Long id){
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student does not found with id " +id));

        studentRepository.delete(student);

    }
}
