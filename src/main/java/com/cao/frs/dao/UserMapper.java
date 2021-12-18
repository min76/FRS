package com.cao.frs.dao;

import com.cao.frs.entities.Users;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface UserMapper {

    int add(Users users);

    int remove(int id);

    int update(Map<String,Object> map);

    List<Users> findAll();

    Users findByName(String name);

}
