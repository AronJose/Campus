package com.Campus.Campus.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Campus.Campus.entity.Student;
import com.Campus.Campus.form.StudentForm;
import com.Campus.Campus.repository.StudentRepository;
import com.Campus.Campus.service.StudentService;
import com.Campus.Campus.view.StudentView;

@Service
public class StudentServiceImpl implements StudentService {
    
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public StudentView add(StudentForm form) {
        return new StudentView(studentRepository.save(new Student(form.getUserId(),form.getSchoolId(),form.getStudentName(),form.getDob(),form.getAddress(),form.getContact(),form.getEmail())));
    }
    
}