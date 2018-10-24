package com.example.demo.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author 杨阳
 * @Date 2018/10/23 - 16:49
 */

@Data
public class Resp<T> implements Serializable{
    private static final long serialVersionUID = 1570862188687182738L;

    private Integer code;

    private String msg;

}