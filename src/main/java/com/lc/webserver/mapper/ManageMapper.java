package com.lc.webserver.mapper;

import com.lc.webserver.entity.Title;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ManageMapper {

    List<Title> selectAllTitle();
}
