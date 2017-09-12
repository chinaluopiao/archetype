package com.xujiangjun.archetype.dao.mapper;

import com.xujiangjun.archetype.domain.entity.config.ParamConfig;
import org.springframework.stereotype.Repository;

@Repository
public interface ParamConfigMapper {
    int insert(ParamConfig record);

    int insertSelective(ParamConfig record);

    ParamConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ParamConfig record);

    int updateByPrimaryKey(ParamConfig record);

    ParamConfig selectByParamNo(String paramNo);

    int updateByParamNo(ParamConfig paramConfig);
}