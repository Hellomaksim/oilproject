package com.upc.oil.controller;

import com.upc.oil.bean.USERS;
import com.upc.oil.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("UserController")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Map Login(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession httpSession) {
        //System.out.println(username+"--"+password);
        USERS user = userService.findUserBypassword(username, password);
        Map<String, String> repMap = new HashMap<String, String>();
        if (user != null) {
            // 将获取到的user的账户名和单位信息保存到session中
            httpSession.setAttribute("user", user);
            repMap.put("status", "success");
            repMap.put("content", "登录成功");
        } else {
            repMap.put("status", "error");
            repMap.put("content", "账户或密码输入错误，请核对后重新输入！");
        }
        return repMap;
    }

/*
* @Author: maksim
* @Description: 测试方法
* @DateTime: 9:03 2021/3/31
* @Params: []
* @Return void
*/
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public void Login() {
        System.out.println("i have passed interceptor!");
    }
/*
* @Author: maksim
* @Description: 找回密码
* @DateTime: 9:34 2021/3/31
* @Params: [username, danwei]
* @Return java.util.Map
*/
    @RequestMapping(value = "/findPassword", method = RequestMethod.GET)
    @ResponseBody
    public Map findPasswordByUsernameAndDanwei(@RequestParam("username") String username, @RequestParam("danwei") String danwei) {
        Map<String,String> resMap = new HashMap<String,String>();
        USERS user = userService.findPassword(username,danwei);
        if(user!=null){
            resMap.put("status","success");
            resMap.put("password",user.getPassword());
            resMap.put("message","找回密码成功！");
        }else{
            resMap.put("status","error");
            resMap.put("message","找回密码失败，请重新核对输入的账户和单位");
        }
        return resMap;
    }
/*
* @Author: maksim
* @Description: 注册新用户
* @DateTime: 10:21 2021/3/31
* @Params: [user]
* @Return java.util.Map
* 使用postman请求时不要加@RequestBody注解
*/
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    @ResponseBody
    public Map addUser(USERS user) {
        Map<String,String> resMap = new HashMap<String,String>();
        int insertResult = userService.addUser(user);
        System.out.println("insertResult"+insertResult);
        if(insertResult == 1){
            resMap.put("status", "success");
            resMap.put("message","注册成功");
        }else{
            resMap.put("status","error");
            resMap.put("message","注册失败，请重试！");
        }
        return resMap;
    }
}