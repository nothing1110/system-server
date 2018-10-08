package com.zhuangf.cms.dao;

import com.zhuangf.cms.model.LogInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * TkMyBatis主要使用的是Jpa注解。
 * 如果数据库用下划线命名法，模型类用驼峰命名法，不需要设置，TkMyBatis默认开启转换。
 * @author: zhuangf
 * @create: 2018-09-27 15:18
 **/
@Mapper
public interface LogInfoMapper extends MysqlBaseMapper<LogInfo> {
}
