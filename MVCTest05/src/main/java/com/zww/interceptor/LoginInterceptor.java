package com.zww.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    // 重写这个方法
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 预处理，判断是否进行接下来的处理
        // 来完成是否登录过的处理，登录过的话前面Session已经被放数据了
        // Session有值，表示登录过了
        if (request.getSession().getAttribute("users") == null){
            // 回到登录页面
            request.setAttribute("msg","请您完成登录处理");
            // 请求转发的跳转的方式
            request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request,response);
            return false;
        }
        return true;   // 这就是放行处理
    }
}
