package com.Campus.Campus.service;

import java.util.List;

import com.Campus.Campus.form.StudentForm;
import com.Campus.Campus.view.StudentView;

public interface StudentService {

    StudentView add(StudentForm form);

    List<StudentView>list();
    
}
