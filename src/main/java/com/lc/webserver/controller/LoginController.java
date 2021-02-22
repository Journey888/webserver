package com.lc.webserver.controller;

import com.lc.webserver.entity.Result;
import com.lc.webserver.service.LoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "用户登录")
@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    @ApiOperation("登录")
    @PostMapping("/login")
    public Result login(String username, String password) {

        if (loginService.login(username, password) != 0 ) {
            return Result.success();
        }
        return Result.fail();
    }
}
