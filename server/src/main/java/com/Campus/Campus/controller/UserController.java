package com.Campus.Campus.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Campus.Campus.service.UserService;
import com.Campus.Campus.form.UserForm;
import com.Campus.Campus.view.UserView;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public UserView add(@Valid @RequestBody UserForm form) {
        return userService.add(form);
    }

    // List of all data from Table
    @GetMapping
    public List<UserView> userlist() {
        return userService.list();
    }

    // List of data in role 1
    @GetMapping("/principal")
    public List<UserView> userlist1() {
        return userService.list1();
    }
}