package com.manish.studentmanagementsystem_springboot.controller;

import com.manish.studentmanagementsystem_springboot.dto.request.StudentRequest;
import com.manish.studentmanagementsystem_springboot.dto.response.StudentResponse;
import com.manish.studentmanagementsystem_springboot.service.StudentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    //========================================Create Student=================================================
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public StudentResponse createStudent(@Valid @RequestBody StudentRequest request){
        return studentService.saveStudent(request);
    }
//======================================get Student by id====================================================
    @GetMapping("/{id}")
    public StudentResponse getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }
//======================================get Student by email================================================
    @GetMapping("/email/{email}")
    public StudentResponse getStudentByEmail(@PathVariable String email){
        return studentService.getStudentByEmail(email);
    }
    //=====================================View All Student===============================================
    @GetMapping
    public List<StudentResponse> getAllStudent(){
        return  studentService.getAllStudents();
    }
//=====================================Update Student=======================================================
    @PutMapping("/{id}")
    public StudentResponse updateStudent(@PathVariable Long id, @Valid  @RequestBody StudentRequest request){
        return studentService.updateStudent(id,request);
    }
    //================================Delete Student=====================================================
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
    }
}
