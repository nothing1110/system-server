package com.zhuangf.cms.dao;

import com.zhuangf.cms.model.LogInfo;
import com.zhuangf.frame.base.dao.mybatis.MysqlBaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: zhuangf
 * @create: 2018-09-27 15:18
 **/
@Mapper
public interface LogInfoMapper extends MysqlBaseMapper<LogInfo> {
}
