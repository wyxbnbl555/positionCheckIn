package com.example.service;


import com.example.WechatLogin.User;
import com.example.WechatLogin.UserLoginDTO;

public interface UserService {

    /**
     * 微信登录
     * @param userLoginDTO
     * @return
     */
    User wxLogin(UserLoginDTO userLoginDTO);
}


