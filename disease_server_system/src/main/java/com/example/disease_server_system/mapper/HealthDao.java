package com.example.disease_server_system.mapper;

import com.example.disease_server_system.model.Health;

public interface HealthDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Health record);

    int insertSelective(Health record);

    Health selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Health record);

    int updateByPrimaryKey(Health record);
}