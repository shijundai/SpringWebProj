package com.daisj.controller;/**
 * @author Administrator
 * @Title: Controller
 * @Description:
 * @date 2020/7/31
 */

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

    @RequestMapping("myTest")
    @ResponseBody
    public String myTest() {
        return "myTest";
    }


    @RequestMapping("myHello")
    public String myHello() {
        return "myHello";
    }
}
