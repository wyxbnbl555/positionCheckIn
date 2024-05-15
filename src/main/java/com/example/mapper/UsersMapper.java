package com.example.mapper;

import com.example.pojo.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UsersMapper {

    @Select("select * from student")
    List<Users> list();
}
