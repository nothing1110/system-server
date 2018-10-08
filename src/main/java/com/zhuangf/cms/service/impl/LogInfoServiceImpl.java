package com.zhuangf.cms.service.impl;

import com.zhuangf.cms.dao.LogInfoMapper;
import com.zhuangf.cms.model.LogInfo;
import com.zhuangf.cms.service.LogInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: zhuangf
 * @create: 2018-09-20 11:43
 **/
@Service("logInfoService")
public class LogInfoServiceImpl implements LogInfoService {
    @Autowired
    LogInfoMapper logInfoMapper;

    @Override
    public LogInfo queryById(String id) {
        return logInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insertLogInfo(LogInfo logInfo) {
        return logInfoMapper.insert(logInfo);
    }

}
