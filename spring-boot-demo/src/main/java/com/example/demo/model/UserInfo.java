package com.example.demo.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author 杨阳
 * @Date 2018/10/23 - 16:50
 */

@Data
public class UserInfo implements Serializable {
    private static final long serialVersionUID = 6619583392919109845L;

    private Long userId;

    private String userHeadImg;
}