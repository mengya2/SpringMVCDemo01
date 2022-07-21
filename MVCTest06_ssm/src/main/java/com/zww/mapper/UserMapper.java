package com.zww.mapper;

import com.zww.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

// 实体类接口，我们要对应着接口来进行程序的编写
public interface UserMapper {

    List<User> selectUserPage(
            @Param("userName")   // 这个注解是为SQL语句中参数赋值而服务的。
            String userName,
            @Param("userSex") String userSex,
            @Param("startRow") int startRow);

    int createUser(User user);

    int deleteUserById(String userId);

    int getRowCount(@Param("userName") String userName,
                    @Param("userSex")String userSex);





}
