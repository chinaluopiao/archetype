package com.xujiangjun.archetype.domain.entity.config;

import com.xujiangjun.archetype.domain.entity.base.BaseEntity;
import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class ParamConfig extends BaseEntity {

    /** 参数描述 **/
    private String paramName;

    /** 参数编号 **/
    private String paramNo;

    /** 参数值 **/
    private String paramValue;

    /** 备注 **/
    private String remark;

}