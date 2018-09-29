package com.zhuangf.cms.controller;

import com.zhuangf.cms.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping("/hello")
@ApiIgnore//swagger忽视该类
public class HelloController {
    @Autowired
    HelloService helloService;

	@GetMapping("/sayHello")
	public String sayHello() {
		return helloService.dayHello();
	}
}
