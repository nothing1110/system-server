package com.zhuangf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 启动类
 * 扫描同包以及子包
 * @author chinaoly
 */
@SpringBootApplication
@EnableSwagger2
public class CMSApplication {

	public static void main(String[] args) {
		SpringApplication.run(CMSApplication.class, args);
	}
}
