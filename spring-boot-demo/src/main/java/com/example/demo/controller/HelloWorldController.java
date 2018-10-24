package com.example.demo.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 杨阳
 * @Date 2018/10/23 - 11:26
 */

@RestController
@EnableAutoConfiguration
public class HelloWorldController {

    @RequestMapping("/hello")
    private String index() {
        return "Hello World!";
    }
}