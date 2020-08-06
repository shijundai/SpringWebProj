package com.daisj.config;/**
 * @author Administrator
 * @Title: Controller
 * @Description:
 * @date 2020/8/3
 */

import com.daisj.mapper.UserMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 **/
@Configuration
public class MyBatisMapperConfigure {

//    @Bean
//    public UserMapper getUserMapper(SqlSessionFactory sqlSessionFactory) throws Exception {
//        MapperFactoryBean<UserMapper> mapperFactoryBean = new MapperFactoryBean(UserMapper.class);
//        mapperFactoryBean.setSqlSessionFactory(sqlSessionFactory);
//        sqlSessionFactory.getConfiguration().addMapper(UserMapper.class);
//        return mapperFactoryBean.getObject();
//    }

    /**
     * 作用和@MapperScan类似
     * @return
     */
//    @Bean
//    public MapperScannerConfigurer mapperScannerConfigurer() {
//        System.out.println("=================getMapperScannerConfigurer=====================");
//        MapperScannerConfigurer conf = new MapperScannerConfigurer();
//        conf.setBasePackage("com.daisj.mapper");
//        conf.setSqlSessionFactoryBeanName("sqlSessionFactory");
//        return conf;
//    }

}
