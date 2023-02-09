package com.Campus.Campus.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.Campus.Campus.entity.Student;

public interface StudentRepository extends Repository<Student,Integer> {
    
    Student save(Student student);
    
    List<Student>findAll();
}
