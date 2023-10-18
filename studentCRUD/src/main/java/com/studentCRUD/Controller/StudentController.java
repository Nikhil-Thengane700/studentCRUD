package com.studentCRUD.Controller;

import com.studentCRUD.model.Student;
import com.studentCRUD.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
 @Autowired
 StudentService studentService;
@PostMapping("/student")
public String createStudent(@RequestBody Student student ){


  return studentService.createStudent(student);

 }}
