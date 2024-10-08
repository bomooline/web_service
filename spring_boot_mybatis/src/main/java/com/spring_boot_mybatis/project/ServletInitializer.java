package com.spring_boot_mybatis.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;

public class ServletInitializer extends SpringBootServletInitializer implements WebApplicationInitializer{
//	public static void main(String[] args) {
//		SpringApplication.run(SpringBootMybatisApplication.class, args);
//	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootMybatisApplication.class);
	}	

}

//public class ServletInitializer extends SpringBootServletInitializer implements WebApplicationInitializer{
//	
//	@Override
//	protected WebApplicationContext run(SpringApplication application) {
//		return super.run(application);
//	}
//	
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(SpringBootMybatisApplication.class);
//	}	
//
//}
