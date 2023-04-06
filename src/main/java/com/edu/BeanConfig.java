package com.edu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

	@Bean
	public Product product()
	{
	   Product p=new Product();
	   p.setPid(3);
	   p.setPname("computer");
	return p;
	   
	}

}
