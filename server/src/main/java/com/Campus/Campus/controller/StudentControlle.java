package com.Campus.Campus.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Campus.Campus.form.StudentForm;
import com.Campus.Campus.service.StudentService;
import com.Campus.Campus.view.StudentView;

@RestController
@RequestMapping("/student")
public class StudentControlle {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public StudentView add(@Valid @RequestBody StudentForm form) {
        return studentService.add(form);
    }
    
}
