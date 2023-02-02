package com.Campus.Campus.service;

import java.util.List;

import com.Campus.Campus.entity.School;
import com.Campus.Campus.view.SchoolView;


public interface SchoolService {

    SchoolView add(School form);

    // list All schools
    List<SchoolView>list();
    
}
