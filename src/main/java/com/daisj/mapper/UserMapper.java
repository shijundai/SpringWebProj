package com.daisj.mapper;/**
 * @author Administrator
 * @Title: Controller
 * @Description:
 * @date 2020/8/3
 */

import com.daisj.mapper.entity.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

/**
 *@ClassName UserMapper
 *@Description TODO
 *@Author Administrator
 *@Date 2020/8/3 15:07
 *@Version 1.0
 **/
public interface UserMapper {

    @Select("select * from t_user where id=#{id}")
    UserEntity queryUserById(Long id);

    @Insert("insert into t_user(name,sex,age,create_time) values(#{name},#{sex},#{age},#{createTime})")
    int saveUser(UserEntity userEntity);
}
