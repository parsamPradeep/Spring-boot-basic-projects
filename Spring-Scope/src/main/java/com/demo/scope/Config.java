package com.demo.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.demo.scope.bean.UserRegestrationBeanImpl;
import com.demo.scope.bean.UserRegetrationBean;
import com.demo.scope.bean.UserRegetrationValidation;
import com.demo.scope.services.RegestrationService;
import com.demo.scope.services.RegestrationServiceImpl;

@Configuration
public class Config {
	@Bean
	public UserRegetrationValidation validator() {
		return new UserRegetrationValidation();
	}
@Bean
	public RegestrationService regestrationService() {
		return new RegestrationServiceImpl(); 
		
	}
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Bean
public UserRegetrationBean userRegistrationBean () {
    return new UserRegestrationBeanImpl();
}
}
