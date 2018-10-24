package com.example.demo.service.impl;

import com.example.demo.entity.UserEntity;
import com.example.demo.mapper.UserEntityMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author 杨阳
 * @Date 2018/10/23 - 16:31
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserEntityMapper userEntityMapper;

    @Override
    public UserEntity getUserInfo(Long userId) {
        return userEntityMapper.selectByPrimaryKey(userId);
    }
}