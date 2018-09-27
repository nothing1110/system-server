package com.zhuangf.cms.dao;

import com.zhuangf.cms.model.LogInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author: zhuangf
 * @description:
 * @create: 2018-09-27 15:18
 **/
@Mapper
public interface LogInfoMapper {
    @Select("select * from t_sys_log ")
    List<LogInfo> findAllLogInfo();
}
