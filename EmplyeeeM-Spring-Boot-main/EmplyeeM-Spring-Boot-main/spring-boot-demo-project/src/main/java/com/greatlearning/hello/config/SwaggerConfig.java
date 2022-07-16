package com.greatlearning.hello.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket libraryApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
				.groupName("Hello-API").select()
				.apis(RequestHandlerSelectors.basePackage("com.greatlearning.hello.controllers")).build();
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Hello API")
				.description("Hello API reference for developers")
				.termsOfServiceUrl("http://helloworld.com")
				.contact(new Contact("Hello API", "http://helloworld.com", "helloworld@gmail.com"))
				.license("HelloWorld license")
				.licenseUrl("http://helloworld.com")
				.version("1.0")
				.build();
						
	}

	
	
	
}
