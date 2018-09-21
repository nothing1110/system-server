package com.zhuangf.cms.service.impl;

import com.zhuangf.cms.config.BasisConfig;
import com.zhuangf.cms.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: zhuangf
 * @description:
 * @create: 2018-09-20 11:43
 **/
@Service("helloService")
public class HelloServiceImpl implements HelloService {
    @Autowired
    BasisConfig basisConfig;

    @Override
    public String dayHello() {
        return "Hello "+basisConfig.PROFILE_ACTIVE;
    }
}
