package com.zhuangf.cms.service;

import com.zhuangf.cms.model.LogInfo;

/**
 * @author: zhuangf
 * @create: 2018-09-20 11:32
 **/
public interface LogInfoService {
    LogInfo queryById(String id);
    int insertLogInfo(LogInfo logInfo);
}
