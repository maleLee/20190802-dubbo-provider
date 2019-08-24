package com.aaa.lee.dubbo.mapper;

import com.aaa.lee.dubbo.model.DbUser;

import java.util.List;

public interface DbUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DbUser record);

    DbUser selectByPrimaryKey(Long id);

    List<DbUser> selectAll();

    int updateByPrimaryKey(DbUser record);
}