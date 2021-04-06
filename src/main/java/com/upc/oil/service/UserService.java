package com.upc.oil.service;

import com.upc.oil.bean.USERS;

public interface UserService {
    USERS findUserBypassword(String username, String password);
    USERS findPassword(String username, String danwei);
    int addUser(USERS user);
}
