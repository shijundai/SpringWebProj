package com.daisj.servletinit;/**
 * @author Administrator
 * @Title: Controller
 * @Description:
 * @date 2020/7/31
 */

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * tomcat启动会通过spi加载spring的SpringServletContainerInitializer类 该接口实现了ServletContainerInitializer接口
 *
 **/
@Component
public class MyContextInitaltion implements ApplicationContextAware, WebApplicationInitializer {

    private static ApplicationContext act;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        act = applicationContext;
    }

    public void onStartup(ServletContext servletContext) throws ServletException {
        DispatcherServlet servlet = act.getBean(DispatcherServlet.class);
        ServletRegistration.Dynamic dy = servletContext.addServlet("dispatch", servlet);
        dy.setLoadOnStartup(1);
        dy.addMapping("/*");
    }
}
