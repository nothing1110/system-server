package com.zhuangf.cms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * swagger2配置
 * http://localhost:xxxx/swagger-ui.html
 * @Author: zhuangf
 * @Date: 2018/9/29
 */
@Configuration
public class swaggerConfiguration {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)//文档类型：DocumentationType.SWAGGER_2
                .apiInfo(apiInfo())//api信息
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.zhuangf.cms.controller"))//api选择器选择api的
                .paths(PathSelectors.any())//api选择器选择包路径下任何api显示在文档中
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("system-cms")//页面标题
                .description("系统管理Swagger")
                .contact(new Contact("zhuangf", "#", "zhuangf@chinaoly.com"))
//                .termsOfServiceUrl("http://blog.csdn.net/saytime")
                .version("1.0")
                .build();
    }
}
