package com.zww.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * 这个类中的功能，都是由一些方法来进行处理的
 * 1-方法的权限是public
 * 2-方法的返回值是任意的
 * 3-方法名是任意的
 * 4-方法中可以是没有参数的
 * 5-要使用@RequestMapper注解来来声明一个访问路径
 */
@Controller
public class DemoAction {

    @RequestMapping("/demo")
    public String demo(){
        System.out.println("服务器访问到了这里");
        return "main";
    }
}
