package com.zww.controller;

import com.zww.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    /**
     * 测试的时候直接在网页上输入：http://localhost/list.action就可以了，不要写ajax的页面也是可以的
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody   // 用来解析ajax，并且要在Springmvc.xml中添加注解驱动
    public List<Student> test01(){
        List<Student> list = new ArrayList<>();
        Student st1 = new Student("张三",21);
        Student st2 = new Student("王杰",123);
        list.add(st1);
        list.add(st2);
        return list;
    }

}
