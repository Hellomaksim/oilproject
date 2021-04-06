package com.upc.oil.aop;

import com.upc.oil.bean.USERS;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;


/**
 * @author maksim
 * @date 2021/3/30-9:18
 * 获取登录用户信息的切面
 */
@Aspect
@Component
public class UserInfoFromSessionAspect {
    /*
    配置切入点
    */
    // 配置controller下只有UserController中的login方法不执行，其他都执行
    //@Pointcut(value = "execution(* com.upc.oil.controller.*.*(..)) && !execution(* com.upc.oil.controller.UserController.Login(..))")
     public void getUserInfo(){}

    // 定义一个前置通知
    //@Before(value="getUserInfo()")
    public void beforeGetUserInfo(JoinPoint joinPoint){
        // 获取目标方法传入的对象
        Object[] args = joinPoint.getArgs();
        HttpSession httpSession = (HttpSession) args[1];
        args[0] = (USERS) httpSession.getAttribute("user");
        System.out.println("args[0]"+args[0].toString());
        System.out.println("前置通知执行成功");
    }
}
