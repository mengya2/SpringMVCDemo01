package com.zww.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyController {

    // 访问这个：http://localhost/show.action
    @RequestMapping("/show")
    public String show(){
        System.out.println("访问show的页面进行处理··");
        return "show";
    }


    // 登录页面
    @RequestMapping("/showLogin")
    public String showLogin(){
        System.out.println("处理的是showLogin的页面的处理");
        return "login";
    }

    // 完成登录的页面判断处理
    @RequestMapping("/login")
    public String login(String name, String password, HttpServletRequest request){
        if ("zww".equalsIgnoreCase(name) && "123".equalsIgnoreCase(password)){
            // 账目密码正确，在session中存储用户信息
            request.getSession().setAttribute("users",name);
            return "main";
        }else {
            // 账号，密码错误
            request.setAttribute("msg","用户名或密码不正确");
            return "login";
        }
    }
}
