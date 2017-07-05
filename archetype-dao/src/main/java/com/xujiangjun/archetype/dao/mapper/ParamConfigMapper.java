package com.xujiangjun.archetype.dao.mapper;

import com.xujiangjun.archetype.dao.model.ParamConfig;

public interface ParamConfigMapper {
    int insert(ParamConfig record);

    int insertSelective(ParamConfig record);

    ParamConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ParamConfig record);

    int updateByPrimaryKey(ParamConfig record);
}