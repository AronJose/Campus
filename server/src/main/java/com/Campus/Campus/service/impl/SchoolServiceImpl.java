package com.Campus.Campus.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Campus.Campus.entity.School;
import com.Campus.Campus.repository.SchoolRepository;
import com.Campus.Campus.security.util.SecurityUtil;
import com.Campus.Campus.service.SchoolService;
import com.Campus.Campus.view.SchoolView;

@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    private SchoolRepository schoolRepository;

    @Override
    public SchoolView add(School form) {
        // Take values from constructor to entity

        return new SchoolView(schoolRepository.save(new School(form.getUser(),form.getSchoolName(),form.getPlace(),form.getAddress(),form.getContact(),form.getEmail(),form.getPrincipal())));
    }
    
}
