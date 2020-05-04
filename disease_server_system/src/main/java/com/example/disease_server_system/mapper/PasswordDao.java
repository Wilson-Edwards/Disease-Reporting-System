package com.example.disease_server_system.mapper;

import com.example.disease_server_system.model.Password;

public interface PasswordDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Password record);

    int insertSelective(Password record);

    Password selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Password record);

    int updateByPrimaryKey(Password record);
}