package com.daisj.config;/**
 * @author Administrator
 * @Title: Controller
 * @Description:
 * @date 2020/8/3
 */

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 *@ClassName MyConfigure
 *@Description TODO
 *@Author Administrator
 *@Date 2020/8/3 11:30
 *@Version 1.0
 **/
@Configuration
@PropertySource("classpath:myConfig.properties")
@MapperScan("com.daisj.mapper")
public class MyConfigure {

    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    public MyConfigure() {
        System.out.println("==================MyConfigure=================");
    }


    @Bean
    public DataSource dataSource() {
        System.out.println("=================getDataSource=====================");
        System.out.println("==url:"+url);
        System.out.println("==driver:"+driver);
        System.out.println("==username:"+username);
        DruidDataSource datasource = new DruidDataSource();
        datasource.setUrl(url);
        datasource.setDriverClassName(driver);
        datasource.setUsername(username);
        datasource.setPassword(password);
        return datasource;
    }

    @Bean("sqlSessionFactory")
    public SqlSessionFactory getSqlSessionFactory(DataSource dataSource) {
        System.out.println("=================sqlSessionFactory=====================");
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        try {
            //羊肉串转驼峰
            factoryBean.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);
            return factoryBean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }



}
