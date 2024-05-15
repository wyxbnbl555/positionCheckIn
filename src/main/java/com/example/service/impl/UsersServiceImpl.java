package com.example.service.impl;

import com.example.mapper.UsersMapper;
import com.example.pojo.Users;
import com.example.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;

    @Override
    public List<Users> list() {
        return usersMapper.list();
    }

}
