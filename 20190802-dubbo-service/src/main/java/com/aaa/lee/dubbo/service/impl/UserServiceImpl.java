package com.aaa.lee.dubbo.service.impl;

import com.aaa.lee.dubbo.mapper.DbUserMapper;
import com.aaa.lee.dubbo.model.DbUser;
import com.aaa.lee.dubbo.service.IUserService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2019/8/2 11:13
 * @Description
 **/
@Service(timeout = 5000)
public class UserServiceImpl implements IUserService {

    @Autowired
    private DbUserMapper dbUserMapper;

    public List<DbUser> selectAllUsers() {
        return dbUserMapper.selectAll();
    }

}
