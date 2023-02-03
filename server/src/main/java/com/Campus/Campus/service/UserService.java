package com.Campus.Campus.service;

import java.util.List;

import org.springframework.validation.Errors;

import com.Campus.Campus.exception.BadRequestException;
import com.Campus.Campus.form.LoginForm;
import com.Campus.Campus.form.UserForm;
import com.Campus.Campus.view.LoginView;
import com.Campus.Campus.view.UserView;

public interface UserService {

    UserView add(UserForm form);

    LoginView login(LoginForm form, Errors errors) throws BadRequestException;

    LoginView refresh(String refreshToken) throws BadRequestException;

    List<UserView>list();

    // list role1
    List<UserView>list1();
}
