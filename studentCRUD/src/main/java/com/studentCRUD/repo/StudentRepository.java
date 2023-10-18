package com.studentCRUD.repo;

import com.studentCRUD.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;


@org.springframework.stereotype.Repository
public class StudentRepository {
    @Autowired
    Student student;



    public StudentRepository(DataSource dataSource, JdbcTemplate jdbcTemplate) {
        this.dataSource = dataSource;
        this.jdbcTemplate = jdbcTemplate;
    }
   private DataSource dataSource;
    private  JdbcTemplate jdbcTemplate;

    public void insertStudent(Student student){
try {

    String sql = "INSERT into student studentcrud(name,emailid,phone) "+ "values('"+student.getName()+","+student.getEmail()+","+student.getPhone()+")";

    jdbcTemplate.update(sql);
}
catch (Exception e){
    e.printStackTrace();
}

    }
}
