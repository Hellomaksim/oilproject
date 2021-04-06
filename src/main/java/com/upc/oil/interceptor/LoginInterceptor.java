package com.upc.oil.interceptor;

import org.springframework.http.HttpRequest;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author maksim
 * @date 2021/3/30-11:10
 */

public class LoginInterceptor implements HandlerInterceptor {
    // 在进入controller方法之前执行,判断用户是否已经登录
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession httpSession = request.getSession();
        // System.out.println("httpSession.getAttribute(\"user\")"+httpSession.getAttribute("user"));
        if(httpSession.getAttribute("user")!=null){
            // 用户已经登录
            return true;
        }else{
            // 用户登录过期或者用户未登录，返回登录界面
            response.sendRedirect("http://localhost:8089/#/Login");
            return false;
        }

    }
}
