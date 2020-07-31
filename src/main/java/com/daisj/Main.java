package com.daisj;/**
 * @author Administrator
 * @Title: Controller
 * @Description:
 * @date 2020/7/31
 */

import com.daisj.webserver.TomcatServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

/**
 *@ClassName Main
 *@Description TODO
 *@Author Administrator
 *@Date 2020/7/31 11:27
 *@Version 1.0
 **/
@ComponentScan("com.daisj")
public class Main {

    public static void main(String[] args) {

        AnnotationConfigWebApplicationContext acw = new AnnotationConfigWebApplicationContext();
        acw.register(Main.class);
        acw.refresh();
        TomcatServer server = acw.getBean(TomcatServer.class);
        try {
            server.startTomcat();
        } catch (Exception e) {
            e.printStackTrace();
        }
//
    }

}
