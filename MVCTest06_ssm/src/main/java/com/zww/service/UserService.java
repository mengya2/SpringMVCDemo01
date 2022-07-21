package com.zww.service;

import com.zww.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    // 查询
    List<User> selectAll(String userName,String userSex,int startPage);
    // 添加用户
    int createUser(User user);
    // 根据id进行删除处理
    int deleteUserById(String userId);
    // 查询个数
    int getRowCount( String userName,String userSex);
}
