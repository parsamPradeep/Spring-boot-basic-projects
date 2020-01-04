package com.demo.componentscan.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MyPrototypeBean {
	
	@Autowired
	@Qualifier("basic-service")
	private MyService myService;
	
	public void doSomethign() {
		System.out.println(myService.getMessege());
	}

}
