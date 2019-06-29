package com.bjpowernode.crm.settings.service;/*
 *张晓光
 *2019/6/28
 *
 */

import com.bjpowernode.crm.exception.loginException;
import com.bjpowernode.crm.settings.domain.User;

import java.util.List;

public interface UserService {

    User login(String loginAct, String loginPwd, String ip) throws loginException;

    List<User> getUserList();
}
