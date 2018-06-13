package com.zhaowoba.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 添加swaggerConfig
 * 
 * @author 念阿郎
 *
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {	
	 @Bean  
	    public Docket createRestApi() {  
	        return new Docket(DocumentationType.SWAGGER_2)  
	                .apiInfo(apiInfo())  
	                .select()  
	                .apis(RequestHandlerSelectors.basePackage("com.zhaowoba.controller"))//扫描com路径下的api文档  
	                .paths(PathSelectors.any())//路径判断  
	                .build();  
	    }  
	 //接口描述
	    private ApiInfo apiInfo() {  
	        return new ApiInfoBuilder()  
	                .title("找我吧  后台API接口平台")//标题  
	                .description("提供详细的后台restful接口")  
	                .termsOfServiceUrl("http://baidu.com")//（不可见）条款地址  
	                .version("1.0.0")//版本号  
	                .build();  
	    }  
}