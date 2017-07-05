package com.xujiangjun.archetype.dao.model;

import lombok.Data;

import java.util.Date;

@Data
public class ParamConfig {
    private Integer id;

    private Byte isDeleted;

    private String creator;

    private Date gmtCreate;

    private String modifier;

    private Date gmtModified;

    private String paramName;

    private String paramNo;

    private String paramValue;

    private String remark;

}