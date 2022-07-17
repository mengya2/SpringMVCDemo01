package com.zww.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

    @RequestMapping("/zwwdemo1")
    public String test01(){
        System.out.println("服务器运行到了这里");
        return "show";
    }

    @RequestMapping(value = "/zwwfrom",method = RequestMethod.GET)
    public String test02(){
        System.out.println("这个是用来处理get请求的");
        return "show";
    }
}
