package com.Campus.Campus.repository;

import java.util.List;

import org.springframework.data.repository.Repository;
import com.Campus.Campus.entity.School;


public interface SchoolRepository extends Repository<School,Integer> {
    
    School save(School school);

    List<School>findAll();
}
