package com.manish.studentmanagementsystem_springboot.dto.request;

import jakarta.validation.constraints.*;
import lombok.*;
import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentRequest {
    @NotBlank(message = "Name is required")
    private String name;
    @NotNull(message = "Age is required")
    @Min(15)
    @Max(60)
    private Integer age;
    @NotBlank(message = "Gender is required")
    private String gender;
    @NotBlank(message = "Email is required")
    @Email
    private String email;
    @NotBlank(message = "Course is required")
    private String course;
    @NotBlank(message = "^[6-9]\\d{9}$")
    @Pattern(regexp = "^[6-9]\\d{9}$")
    private String phone;
    @NotBlank(message = "address is required")
    private String address;
    @NotNull(message = "DateOfBirth")
    private LocalDate dateOfBirth;
    @NotNull(message = "admissionDate")
    private LocalDate admissionDate;
    @NotNull(message = "Fee is required")
    private Double fee;
    @NotBlank(message = "Status is required")
    private String status;
}
