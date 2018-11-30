package com.zhuangf.cms.service;

import com.zhuangf.cms.model.LogInfo;
import com.zhuangf.frame.base.service.BaseService;

/**
 * @author: zhuangf
 * @create: 2018-09-20 11:32
 **/
public interface LogInfoService extends BaseService<LogInfo,String> {
    LogInfo queryById(String id);
    int insertLogInfo(LogInfo logInfo);
}
