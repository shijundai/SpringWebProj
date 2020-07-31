package com.daisj.webserver;/**
 * @author Administrator
 * @Title: Controller
 * @Description:
 * @date 2020/7/31
 */

import org.apache.catalina.startup.Tomcat;
import org.springframework.stereotype.Component;

/**
 *@ClassName TomcatServer
 *@Description TODO
 *@Author Administrator
 *@Date 2020/7/31 11:36
 *@Version 1.0
 **/
@Component
public class TomcatServer {


    public void startTomcat() throws Exception {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(7000);
//        tomcat.setBaseDir(Thread.currentThread().getContextClassLoader().getResource("").getPath());
        tomcat.addWebapp("/dsj",Thread.currentThread().getContextClassLoader().getResource("").getPath());
        tomcat.start();
        tomcat.getServer().await();
    }

}
