package com.upc.oil.interceptor;

import com.upc.oil.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author maksim
 * @date 2021/3/30-11:18
 */
//@Configuration
public class WebAppConfig extends WebMvcConfigurerAdapter {
    // 注册拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**")
        .excludePathPatterns("/UserController/login").excludePathPatterns("/UserController/findPassword")
        .excludePathPatterns("/UserController/addUser");
        super.addInterceptors(registry);
    }
}
