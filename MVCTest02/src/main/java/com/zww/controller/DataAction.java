package com.zww.controller;

import com.zww.dao.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DataAction {

    /**
     * 1、这个方法用来处理，前段提交的表单,(单个数据的提交处理)
     * @param myname
     * @param age
     * @return
     */
    @RequestMapping("/one")
    public String one(String myname,Integer age){
        System.out.println("myname = "+myname);
        System.out.println("age = " +age);
        return "show";
    }

    /**
     * 2、对象封装的方式进行数据提交处理
     */
    @RequestMapping("/two")
    public String two(User user){
        System.out.println(user);
        return "show";   // 跳转到view/show.jsp中，这里是已经设置了后缀.jsp
    }

    /**
     * 3、用来处理动态值的处理
     * <form action="${${pageContext.request.contextPath}/three/张三/22.action}">
     *     PathVariable相当于取值，给到对应的形参
     */
    @RequestMapping("/three/{name}/{age}")
    public String three(@PathVariable String name,@PathVariable Integer age){
        System.out.println("myname = "+name);
        System.out.println("age = " +age);
        return "show";   // 跳转到view/show.jsp中，这里是已经设置了后缀.jsp
    }

    /**
     * 4、处理形参和属性名不一致时，所采用的方法
     */
    @RequestMapping("/fore")
    public String fore(@RequestParam("name") String uname,
                       @RequestParam("age") Integer uage){
        System.out.println("uname =  "+uname +"  uage = "+uage);
        return "show";   // 跳转到view/show.jsp中，这里是已经设置了后缀.jsp
    }
}
