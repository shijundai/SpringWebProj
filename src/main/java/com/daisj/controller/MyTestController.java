package com.daisj.controller;/**
 * @author Administrator
 * @Title: Controller
 * @Description:
 * @date 2020/7/31
 */

import com.daisj.mapper.DepartMapper;
import com.daisj.mapper.UserMapper;
import com.daisj.mapper.entity.DepartEntity;
import com.daisj.mapper.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *@ClassName MyTestController
 *@Description TODO
 *@Author Administrator
 *@Date 2020/7/31 11:42
 *@Version 1.0
 **/
@RestController
public class MyTestController {


    @Autowired
    private UserMapper userMapper;

    @Autowired
    private DepartMapper deptMapper;

    @RequestMapping("queryUser/{id}")
    public UserEntity queryUser(@PathVariable Long id) {
        UserEntity user = userMapper.queryUserById(id);
        return user;
    }

    @RequestMapping("queryDept/{id}")
    public DepartEntity queryDept(@PathVariable Long id) {
        DepartEntity dept = deptMapper.queryDepartById(id);
        return dept;
    }

    @RequestMapping("saveUser")
    public String saveUser(UserEntity entity) {
        int result = userMapper.saveUser(entity);
        return String.valueOf(result);
    }
}
