package com.manish.studentmanagementsystem_springboot.repository;

import com.manish.studentmanagementsystem_springboot.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import java.util.List;
public interface StudentRepository extends JpaRepository<Student,Long> {
    //find by email
    Optional<Student> findByEmail(String email);

    //find student by phoneNumber;
    Optional<Student> findByPhone(String phone);

    //Search by student name;
    List<Student> findByName(String name);

    //check email exists
    boolean existsByEmail(String email);

    //Check phone exists;
    boolean existsByPhone(String phone);

}
