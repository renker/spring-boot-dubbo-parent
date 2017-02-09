package com.renker.web.manage;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
public class MvcConfig {
	@Value(value="${spring.mvc.view.prefix}")
	private String spring_mvc_view_prefix;
	
	@Value(value="${spring.mvc.view.suffix}")
	private String spring_mvc_view_suffix;
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver(){
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix(spring_mvc_view_prefix);
		viewResolver.setSuffix(spring_mvc_view_suffix);
		viewResolver.setViewClass(JstlView.class);
		return viewResolver;
	}
}
