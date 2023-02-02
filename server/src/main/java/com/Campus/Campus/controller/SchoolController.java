package com.Campus.Campus.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Campus.Campus.entity.School;
import com.Campus.Campus.service.SchoolService;
import com.Campus.Campus.view.SchoolView;

@RestController
@RequestMapping("/school")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @PostMapping
    public SchoolView add(@Valid @RequestBody School form)
    {
        return schoolService.add(form);
    }

    
}
