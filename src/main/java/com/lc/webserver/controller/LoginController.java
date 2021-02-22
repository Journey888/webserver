package com.lc.webserver.controller;

import com.lc.webserver.entity.Result;
import com.lc.webserver.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    @GetMapping("/login")
    public Result login(String username, String password) {

        if (loginService.login(username, password) != 0 ) {
            return Result.success();
        }
        return Result.fail();
    }
}
