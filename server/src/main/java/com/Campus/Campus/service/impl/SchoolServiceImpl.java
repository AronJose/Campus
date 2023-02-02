package com.Campus.Campus.service.impl;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.Campus.Campus.entity.School;
import com.Campus.Campus.repository.SchoolRepository;
import com.Campus.Campus.service.SchoolService;
import com.Campus.Campus.view.SchoolView;



@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    private SchoolRepository schoolRepository;

    @Override
    public SchoolView add(School form) {
        return new SchoolView(schoolRepository.save(new School(form.getUser(),form.getSchoolName(),form.getPlace(),form.getAddress(),form.getContact(),form.getEmail(),form.getPrincipal())));
    }
    
    // list All schools
    @Override
    public List<SchoolView>list()
    {
        List<SchoolView>schoolViews = new ArrayList<>();
        List<School>schools = schoolRepository.findAll();
        schools.forEach(school ->{
            schoolViews.add(new SchoolView(school));
        });
        return schoolViews;
    }

}
