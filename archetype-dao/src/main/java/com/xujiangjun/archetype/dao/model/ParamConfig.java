package com.xujiangjun.archetype.dao.model;

import lombok.Data;

import java.util.Date;

@Data
public class ParamConfig {
    /** 自增主键 **/
    private Integer id;

    /** 是否删除：0-未删除; 1-已删除 **/
    private Integer isDeleted;

    /** 创建人 **/
    private String creator;

    /** 创建时间 **/
    private Date gmtCreate;

    /** 修改人 **/
    private String modifier;

    /** 修改时间 **/
    private Date gmtModified;

    /** 参数描述 **/
    private String paramName;

    /** 参数编号 **/
    private String paramNo;

    /** 参数值 **/
    private String paramValue;

    /** 备注 **/
    private String remark;

}