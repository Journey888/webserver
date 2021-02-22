package com.lc.webserver.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LoginMapper {

    int login(@Param("username")String username, @Param("password")String password);

}
