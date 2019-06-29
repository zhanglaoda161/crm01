package com.bjpowernode.crm.settings.dao;/*
 *张晓光
 *2019/6/28
 *
 */


import com.bjpowernode.crm.settings.domain.User;

import java.util.List;
import java.util.Map;

public interface UserDao {

    User login(Map<String, String> map);

    List<User> getUserList();

}
