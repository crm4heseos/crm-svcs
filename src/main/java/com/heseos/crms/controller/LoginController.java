package com.heseos.crms.controller;

import com.heseos.crms.domain.AuthDetails;
import com.heseos.crms.domain.User;
import com.heseos.crms.exceptions.BadRequestException;
import com.heseos.crms.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class LoginController extends BaseController{

    @Autowired
    LoginService loginService;

    @PostMapping("/login")
    public AuthDetails login(@RequestBody User user) throws BadRequestException {
        System.out.println(loginService);

        return loginService.login(user);
    }
}
