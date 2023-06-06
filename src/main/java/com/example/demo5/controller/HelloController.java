package com.example.demo5.controller;

import com.example.demo5.mapper.UserMapper;
import com.example.demo5.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/aaa")
    public List<User> aaa() {
        return userMapper.findAll();
    }
}
