package com.example.demo.service;

import com.example.demo.entity.UserEntity;

/**
 * @Author 杨阳
 * @Date 2018/10/23 - 16:30
 */


public interface UserService {

    UserEntity getUserInfo(Long userId);

}