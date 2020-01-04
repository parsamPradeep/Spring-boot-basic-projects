package com.demo.componentscan.bean;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Lazy
@Component("basic-service")
public class ServiceImplA implements MyService{

	
	@PostConstruct
	private void init() {
		System.out.println("intializing lazily"+this.getClass().getSimpleName());
	}
	@Override
	public String getMessege() {
		
		return "messege from "+getClass().getSimpleName();
	}

}
