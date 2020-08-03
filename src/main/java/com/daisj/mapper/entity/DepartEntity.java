package com.daisj.mapper.entity;/**
 * @author Administrator
 * @Title: Controller
 * @Description:
 * @date 2020/8/3
 */

/**
 *@ClassName DepartEntity
 *@Description TODO
 *@Author Administrator
 *@Date 2020/8/3 16:06
 *@Version 1.0
 **/
public class DepartEntity {
    private Long id;
    private String departName;
    private String orgCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    @Override
    public String toString() {
        return "DepartEntity{" +
                "id=" + id +
                ", departName='" + departName + '\'' +
                ", orgCode='" + orgCode + '\'' +
                '}';
    }
}
