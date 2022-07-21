package com.zww.service.impl;

import com.zww.mapper.UserMapper;
import com.zww.pojo.User;
import com.zww.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectAll(String userName, String userSex, int startPage) {
        return userMapper.selectUserPage(userName,userSex,startPage);
    }

    @Override
    public int createUser(User user) {
        return userMapper.createUser(user);
    }

    @Override
    public int deleteUserById(String userId) {
        return userMapper.deleteUserById(userId);
    }

    @Override
    public int getRowCount(String userName, String userSex) {
        return userMapper.getRowCount(userName,userSex);
    }
}
