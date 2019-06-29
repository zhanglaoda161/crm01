package com.bjpowernode.crm.workbench.web.controller;

import com.bjpowernode.crm.settings.domain.User;
import com.bjpowernode.crm.settings.service.UserService;
import com.bjpowernode.crm.settings.service.impl.UserServiceImpl;
import com.bjpowernode.crm.util.PrintJson;
import com.bjpowernode.crm.util.ServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ActivityController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("进入市场模块控制器");
        String path = req.getServletPath();
        if ("/workbench/activity/getUserList.do".equals(path)){
            getUserList(req, resp);
        }else if ("/workbench/activity/save.do".equals(path)){
           save(req,resp);
        }

    }

    private void getUserList(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("进入查询用户操作列表操作");
        UserService userService= (UserService) ServiceFactory.getService(new UserServiceImpl());
        List<User> userList =userService.getUserList();
        PrintJson.printJsonObj(resp, userList);
    }

    private void save(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("执行市场活动添加操作");
    }

}
