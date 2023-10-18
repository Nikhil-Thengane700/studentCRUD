package com.studentCRUD.service;

import com.studentCRUD.model.Student;
import com.studentCRUD.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
@Component
@Service
public class StudentService {
    @Autowired
    StudentRepository repository;
    public String createStudent(Student student) {
        repository.insertStudent(student);

        return "Successfully Student Created" ;
    }
}
