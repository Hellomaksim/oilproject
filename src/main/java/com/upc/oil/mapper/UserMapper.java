package com.upc.oil.mapper;

import com.upc.oil.bean.USERS;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    USERS findUserBypassword(String username,String password);
    USERS findPassword(String username, String danwei);
    int addUser(USERS user);
}
