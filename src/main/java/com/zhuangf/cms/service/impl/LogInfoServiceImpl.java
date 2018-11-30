package com.zhuangf.cms.service.impl;

import com.zhuangf.cms.dao.LogInfoMapper;
import com.zhuangf.cms.model.LogInfo;
import com.zhuangf.cms.service.LogInfoService;
import com.zhuangf.frame.base.service.impl.CommonBaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author: zhuangf
 * @create: 2018-09-20 11:43
 **/
@Service("logInfoService")
public class LogInfoServiceImpl extends CommonBaseServiceImpl<LogInfo,LogInfoMapper,String> implements LogInfoService {

    @Override
    public LogInfo queryById(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int insertLogInfo(LogInfo logInfo) {
        return mapper.insert(logInfo);
    }

}
