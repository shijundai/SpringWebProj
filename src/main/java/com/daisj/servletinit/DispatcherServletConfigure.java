package com.daisj.servletinit;/**
 * @author Administrator
 * @Title: Controller
 * @Description:
 * @date 2020/7/31
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;

/**
 *@ClassName DispatcherServletConfigure
 *@Description TODO
 *@Author Administrator
 *@Date 2020/7/31 11:41
 *@Version 1.0
 **/
@Configuration
public class DispatcherServletConfigure {

    @Bean
    public DispatcherServlet getDispatcherServlet() {
        return new DispatcherServlet();
    }

}
