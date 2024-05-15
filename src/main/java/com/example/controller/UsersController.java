package com.example.controller;

import com.example.pojo.Result;
import com.example.pojo.Users;
import com.example.service.UsersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Slf4j
@RestController
public class UsersController {
    @Autowired
    private UsersService usersService;

    @RequestMapping(value = "/students")
    public Result list(){
        log.info("查询所有签到的学生");
        List<Users> usersList = usersService.list();
        return Result.success(usersList);
    }
}
