package com.xujiangjun.archetype.service.base.impl;

import com.xujiangjun.archetype.dao.mapper.ParamConfigMapper;
import com.xujiangjun.archetype.service.base.ParamConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xujiangjun
 * @date 2017-07-01 02:11
 */
@Service
public class ParamConfigServiceImpl implements ParamConfigService {

    @Autowired
    private ParamConfigMapper paramConfigMapper;
}
