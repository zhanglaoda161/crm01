package com.bjpowernode.crm.workbench.service.impl;/*
 *张晓光
 *2019/6/29
 *
 */

import com.bjpowernode.crm.util.SqlSessionUtil;
import com.bjpowernode.crm.workbench.dao.ActivityDao;
import com.bjpowernode.crm.workbench.service.ActivityService;

public class ActivityServiceImpl implements ActivityService {
    private ActivityDao activityDao= SqlSessionUtil.getSqlSession().getMapper(ActivityDao.class);

}
