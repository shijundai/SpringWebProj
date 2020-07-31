package com.daisj.view;/**
 * @author Administrator
 * @Title: Controller
 * @Description:
 * @date 2020/7/31
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.mvc.HttpRequestHandlerAdapter;
import org.springframework.web.servlet.mvc.SimpleControllerHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *@ClassName ViewResolverConfigure
 *@Description TODO
 *@Author Administrator
 *@Date 2020/7/31 11:54
 *@Version 1.0
 **/
@Configuration
public class ViewResolverConfigure {


    @Order(0)
    @Bean
    public BeanNameViewResolver getBeanNameViewResolver(){
        return new BeanNameViewResolver();
    }

    @Bean
    public InternalResourceViewResolver getInternalResourceViewResolver() {
        InternalResourceViewResolver defualtViewResolver = new InternalResourceViewResolver();
        defualtViewResolver.setViewClass(org.springframework.web.servlet.view.JstlView.class);
        defualtViewResolver.setContentType("text/html");
        defualtViewResolver.setPrefix("webapp");
        defualtViewResolver.setSuffix(".jsp");
        return defualtViewResolver;
    }

    @Bean
    public RequestMappingHandlerMapping getRequestMappingHandlerMapping() {
        return new RequestMappingHandlerMapping();
    }

    @Bean
    public RequestMappingHandlerAdapter getRequestMappingHandlerAdapter() {
        RequestMappingHandlerAdapter adapter = new RequestMappingHandlerAdapter();
        adapter.getMessageConverters().add(new StringHttpMessageConverter());
        return adapter;
    }

    @Bean
    public HandlerMapping getBeanNameUrlMappingHandler() {
        return new BeanNameUrlHandlerMapping();
    }

    @Bean
    public HandlerAdapter getHttpRequestHandlerAdapter() {
        return new HttpRequestHandlerAdapter();
    }

    @Bean
    public HandlerMapping getSimpleUrlMappingHandler() {
        return new SimpleUrlHandlerMapping();
    }

    @Bean
    public HandlerAdapter getSimpleControllerHandlerAdapter() {
        return new SimpleControllerHandlerAdapter();
    }

}
