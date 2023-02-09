package com.Campus.Campus.repository;

import org.springframework.data.repository.Repository;

import com.Campus.Campus.entity.Student;

public interface StudentRepository extends Repository<Student,Integer> {
    
    Student save(Student student);
    
}
