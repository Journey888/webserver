package com.lc.webserver.controller;

import com.lc.webserver.entity.Result;
import com.lc.webserver.service.ManageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "题库数据管理")
@RestController
public class ManageController {

    @Autowired
    ManageService manageService;

    @ApiOperation("查看所有题目标题")
    @GetMapping("getAllTitle")
    public Result selectAllTitle() {

        return Result.success().add("TitleList",manageService.selectAllTitle());
    }

}
