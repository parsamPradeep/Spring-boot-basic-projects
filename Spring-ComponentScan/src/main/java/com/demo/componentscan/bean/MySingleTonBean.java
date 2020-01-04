package com.demo.componentscan.bean;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
@Component

public class MySingleTonBean {
	
	@PostConstruct
	public void init() {
		System.out.println("intializing"+getClass().getSimpleName());
		
	}

}
	