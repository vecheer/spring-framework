package com.yq.config;

import com.yq.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig  {

	@Bean
	public User jack(){
		return new User();
	}

}
