package com.example.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
@Repository
public interface MemberMapper {

    ArrayList<HashMap<String, Object>> findAll();
    HashMap<String, Object> findByName(@Param("name") String name);

    void insertMember(@Param("name") String name, @Param("age") int age);
}
