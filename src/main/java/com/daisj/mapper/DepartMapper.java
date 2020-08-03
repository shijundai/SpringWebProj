package com.daisj.mapper;/**
 * @author Administrator
 * @Title: Controller
 * @Description:
 * @date 2020/8/3
 */

import com.daisj.mapper.entity.DepartEntity;
import org.apache.ibatis.annotations.Select;

/**
 *@ClassName DepartMapper
 *@Description TODO
 *@Author Administrator
 *@Date 2020/8/3 16:06
 *@Version 1.0
 **/
public interface DepartMapper {

    @Select("select * from t_depart where id=#{id}")
    DepartEntity queryDepartById(Long id);
}
