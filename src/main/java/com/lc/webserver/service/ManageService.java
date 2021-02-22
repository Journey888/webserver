package com.lc.webserver.service;

import com.lc.webserver.entity.Title;
import com.lc.webserver.mapper.ManageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManageService {

    @Autowired
    ManageMapper manageMapper;

    public List<Title> selectAllTitle(){
        return manageMapper.selectAllTitle();
    }
}
