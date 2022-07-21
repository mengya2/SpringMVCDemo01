package com.zww.my;

import com.zww.pojo.User;
import com.zww.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)   // 启动Spring容器
@ContextConfiguration(locations = {"classpath:applicationContext_mapper.xml", "classpath:applicationContext_service.xml"})
public class MyTest {

    @Autowired
    UserService userService;

    @Test
    public void test01(){
        // 测试集合的那一个
        List<User> list = userService.selectAll(null,null,0);
        System.out.println("结果为："+list);
    }

    // 进行添加处理，添加是可以实现的
    @Test
    public void test02(){
        // 添加处理，添加'15968954638794962', '身份证', '110654196604079098', '孔十四', '女', '29', '生产、运输设备操作人员及有关人员'
        int i = userService.createUser(new User("15968954638794962", "身份证", "110654196604079098", "孔十四", "女", "29", "生产、运输设备操作人员及有关人员"));
        if (i ==0){
            System.out.println("添加失败");
        }else {
            System.out.println("添加成功");
        }
    }

    //  用来处理删除的处理
    @Test
    public void test03(){
        //  删除功能是可以实现出来的,删除了孔十四，
        int i = userService.deleteUserById("15968954638794962");
        System.out.println(i);
    }

}
