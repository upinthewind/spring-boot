package com.example.demo.controller;

import com.example.demo.model.UserInfo;
import com.example.demo.service.UserService;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 杨阳
 * @Date 2018/10/23 - 16:35
 */

@RestController
@EnableAutoConfiguration
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private StringRedisTemplate redisTemplate;

    @RequestMapping("/user/userInfo")
    public UserInfo getUserInfo(@RequestBody UserInfo userInfo) {

        val user = userService.getUserInfo(userInfo.getUserId());
        if (null == user) {
            return new UserInfo();
        }

        Object a = redisTemplate.opsForValue().get("valueType");

        UserInfo userInfo1 = new UserInfo();
        userInfo1.setUserId(user.getId());
        userInfo1.setUserHeadImg(user.getUserImg());
        return userInfo1;
        
    }

}