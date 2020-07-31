package com.daisj.controller;/**
 * @author Administrator
 * @Title: Controller
 * @Description:
 * @date 2020/7/31
 */

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *@ClassName TestController
 *@Description TODO
 *@Author Administrator
 *@Date 2020/7/31 15:47
 *@Version 1.0
 **/
@Component("/testController")
public class TestController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        httpServletResponse.getOutputStream().print("hahahahahah");
        return null;
    }
}
