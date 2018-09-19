package com.zhuangf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 * 扫描同包以及子包
 * @author chinaoly
 */
@SpringBootApplication
public class CMSApplication {

	public static void main(String[] args) {
		SpringApplication.run(CMSApplication.class, args);
	}
}
