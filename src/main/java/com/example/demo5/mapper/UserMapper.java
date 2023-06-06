package com.example.demo5.mapper;

import com.example.demo5.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> findList();

}
