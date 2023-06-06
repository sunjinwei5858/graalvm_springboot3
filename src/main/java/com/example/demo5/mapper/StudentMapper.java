package com.example.demo5.mapper;

import com.example.demo5.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {

    List<Student> findList();
}
