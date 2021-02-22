package com.lc.webserver.service;

import com.lc.webserver.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    LoginMapper loginMapper;

    public int login(String username, String password) {

        return loginMapper.login(username, password);
    }
}
