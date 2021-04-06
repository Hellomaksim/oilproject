package com.upc.oil.service;

import com.upc.oil.bean.USERS;
import com.upc.oil.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public USERS findUserBypassword(String username, String password) {
       USERS users=userMapper.findUserBypassword(username,password);
       return users;
    }

    @Override
    public USERS findPassword(String username, String danwei) {
        USERS user = userMapper.findPassword(username,danwei);
        return user;
    }

    @Override
    public int addUser(USERS user) {
        return userMapper.addUser(user);
    }
}
