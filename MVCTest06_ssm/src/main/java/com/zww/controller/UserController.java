package com.zww.controller;

import com.zww.pojo.User;
import com.zww.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin  // 这个是跨域访问
@Controller
@RequestMapping("/user")
//@RestController  // 如果这个类中的所有的方法都是使用的json的方式，那么久不用在方法上写@ResponseBody
public class UserController {
    @Autowired
    UserService userService;


    // 显示所有的用户
    @RequestMapping("/selectUserPage")
    @ResponseBody
    public List<User> selectUserPage(String userName,String userSex,Integer page){
        int pageNow = page == null ? 1 : page;
        int pageSize = 5;
        int startRows = pageSize*(pageNow-1);
        return userService.selectAll(userName, userSex, startRows);
    }
     //    查询符合要求的条数
    @RequestMapping("/getRowCount")
    @ResponseBody
    public int getRowCount(String userName,String userSex){
        return userService.getRowCount(userName,userSex);
    }

    //  根据id来进行删除处理的操作
    @RequestMapping("/deleteUserById")
    @ResponseBody
    public int deleteUserById(String userId){
        return userService.deleteUserById(userId);
    }

    // 来进行数据的添加处理的过程化  createUser
    @RequestMapping("/createUser")
    @ResponseBody
    public int createUser(User user){
        String userId = System.currentTimeMillis()+ "";
        user.setUserId(userId);
        return userService.createUser(user);
    }

}
