package com.zww.controller;

import com.zww.pojo.Student;
import com.zww.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.Map;

@Controller
public class MyController {
    // 第一种直接跳转的方式
    @RequestMapping("/one")
    public String one(){
        System.out.println("这个是请求转发页面跳转```");
        return "main";   // 默认的就是这个，会进行前缀和后缀的拼接处理
    }

    // 第二种跳转的方式
    @RequestMapping("/two")
    public String two(){
        System.out.println("这个是处理action跳转处理的");
        // 跳转有转发和重定向，整理会自动的屏蔽掉前缀和后缀的处理
        return "forward:/other.action";
    }
    // 上面那个就是转发到这里来
    @RequestMapping("/other")
    public String other(){
        System.out.println("这个方法是other的，采用的是forward的方式进行跳转处理的");
        return "main";
    }


    // 第三种方式，直接重定向
    @RequestMapping("/three")
    public String three(){
        System.out.println("重定向");
        return "redirect:/jsp/hello.jsp";    // 重定向
    }

    // 第四种方式，使用重定向的方式，来进行跳转
    @RequestMapping("/fore")
    public String fore(){
        System.out.println("action的重定向");
        return "redirect:/other.action";    // 重定向
    }




}
