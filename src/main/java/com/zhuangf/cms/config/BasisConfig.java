package com.zhuangf.cms.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author: zhuangf
 * @description:基础配置
 * @create: 2018-09-21 15:53
 **/
@Component
public class BasisConfig {
    //取配置文件中的值
    @Value("${spring.profiles.active}")
    public String PROFILE_ACTIVE;
}
