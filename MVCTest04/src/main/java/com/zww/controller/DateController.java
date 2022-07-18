package com.zww.controller;

import com.zww.pojo.Student;
import com.zww.pojo.User;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class DateController {
    SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
    // 方法一
    @RequestMapping("/mydate1")
    public String date(@DateTimeFormat(pattern = "yyyy-MM-dd")
            Date mydate){
        System.out.println(mydate);
        System.out.println(sf.format(mydate));
        return "main";
    }

    // 日期处理方式二，写一个全局的日期处理注解,来实现日期的自动注入
    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        dataBinder.registerCustomEditor(Date.class,new CustomDateEditor(sf,true));
    }
    @RequestMapping("/mydate2")
    public String date1(Date mydate){
        System.out.println(mydate);
        System.out.println(sf.format(mydate));
        return "main";
    }

    // 携带数据到页面上，并且实现跳转功能
    @RequestMapping("/data")
    public <session> String data(HttpServletRequest request, HttpServletResponse response
            , HttpSession session, Model model , Map map, ModelMap modelMap){
        // 创建一个对象参数
        Student student = new Student("张文文",21);
        // 传递对象参数
        request.setAttribute("requestStu",student);
        session.setAttribute("sessionS",student);
        model.addAttribute("modeS",student);
        map.put("mapS",student);
        modelMap.addAttribute("modeMapS",student);
        return  "main";
        // 也可以使用重定向跳转，大多数的数据都不会显示，因为重定向：请求被挂断了
        //return "redirect:/jsp/other.action";
    }

    /**
     * 使用这个处理，在页面上也可以显示出来，但是显示的形式是String的
     */
    @RequestMapping("/mydate")
    public String date2(Date mydate,HttpServletRequest request){
        System.out.println(mydate);
        System.out.println(sf.format(mydate));
        request.setAttribute("mydate",sf.format(mydate));
        return "main";
    }

    @RequestMapping("/list")
    public String list(HttpServletRequest request) throws ParseException {
        User user = new User("张三",sf.parse("2001-03-23"));
        User user2 = new User("李四",sf.parse("2001-03-23"));
        User use3 = new User("王五",sf.parse("2001-03-23"));
        List<User> lilsts = new ArrayList<>();
        lilsts.add(user);
        lilsts.add(user2);
        lilsts.add(use3);
        request.setAttribute("list",lilsts);
        return "main";
    }


}
