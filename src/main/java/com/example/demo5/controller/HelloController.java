package com.example.demo5.controller;

import com.example.demo5.mapper.StudentMapper;
import com.example.demo5.mapper.UserMapper;
import com.example.demo5.pojo.Student;
import com.example.demo5.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private StudentMapper studentMapper;


    @GetMapping("/aaa")
    public String aaa() {
        redisTemplate.opsForValue().set("aa", "aaa");
        return redisTemplate.opsForValue().get("aa");
    }

    @GetMapping("/bbb")
    public List<User> bbb() {
        return userMapper.findAll();
    }

    @GetMapping("/ccc")
    public List<Student> ccc() {
        return studentMapper.findList();
    }

    @GetMapping("/ddd")
    public List<Student> ddd() {
        return studentMapper.findList2();
    }
}
